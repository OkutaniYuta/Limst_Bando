package com.example.demo.week5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.week5.model.CalcForm;
import com.example.demo.week5.service.CompoundInterestService;

@Controller
public class CompoundInterestController {

	@Autowired
	CompoundInterestService service;
	
	@GetMapping("/compoundInterest/")
	public String getHome(@ModelAttribute CalcForm calcForm,Model model) {
		model.addAttribute("calcForm", calcForm);
		return "week5/compoundInterest/index";
	}
	
	@PostMapping("/compoundInterest/result")
	public String postResult(@ModelAttribute @Validated CalcForm calcForm,
			BindingResult bindingResult,Model model,RedirectAttributes rd) {
		
		//バリデーションエラー時
		if(bindingResult.hasErrors()) {
			return getHome(calcForm,model);
		}

		int principal=calcForm.getPrincipal();
		double rate=calcForm.getRate();
		int years=calcForm.getYears();
		double compoundInterestResult = service.getResult(principal,rate,years);
		
		model.addAttribute("compoundInterestResult", compoundInterestResult);
		String result =String.format("%.2f",compoundInterestResult);
		rd.addAttribute("result", result);
		
		return "redirect:/compoundInterest/result";
	}
	
		
	@RequestMapping("/compoundInterest/result")
	public String getResult(@ModelAttribute("result") String result) {
		
		return "week5/compoundInterest/result";
	}
}
