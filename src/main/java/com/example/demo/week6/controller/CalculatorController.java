package com.example.demo.week6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.week6.model.CalculatorForm;
import com.example.demo.week6.service.CalculatorService;

@Controller
public class CalculatorController {

	@Autowired
	CalculatorService calculatorService;

	@GetMapping({"/calculator/", "/calculator/home"})
	public String getHome(@ModelAttribute CalculatorForm calculatorForm,Model model) {

		// 計算可能な演算子の日本語名一覧を渡す
		model.addAttribute("calcTypeNameArray",calculatorService.getCalcTypeNameArray());

		// 計算選択用のキーバリューセットを渡す
		model.addAttribute("calcTypes",calculatorService.getCalcTypes());

		model.addAttribute("calculatorForm", calculatorForm);

		return "week6/calculator/home";
	}

	@PostMapping("/calculator/result")
	public String getResult(@ModelAttribute @Validated CalculatorForm calculatorForm, BindingResult bindingResult, Model model) {

		// バリデーションエラー時の処理
		if (bindingResult.hasErrors()) {
			return getHome(calculatorForm,model);
		}
		
		String calcType = calculatorForm.getCalcType();
		double firstNum = calculatorForm.getFirstNum();
		double secondNum = calculatorForm.getSecondNum();

		model.addAttribute("firstNum", firstNum);
		model.addAttribute("secondNum", secondNum);
		model.addAttribute("physicalCalcType", calculatorService.convertPysicalCalcType(calcType));
		model.addAttribute("result", calculatorService.calculate(calcType,firstNum,secondNum));

		return "week6/calculator/result";
	}

}
