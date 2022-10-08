package com.example.demo.week10.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.week10.model.NumeronModel;
import com.example.demo.week10.service.NumeronService;

@Controller
@RequestMapping("numeron")
public class NumeronController {

	private final NumeronService numeronService;

	public NumeronController(NumeronService numeronService) {
		this.numeronService = numeronService;
	}

	@GetMapping("/")
	public String index(@ModelAttribute NumeronModel numeronModel,Model model) {
		return "week10/numeron/index";
	}

	@GetMapping("/retry")
	public String retry(@ModelAttribute NumeronModel numeronModel,Model model) {
		numeronService.init();
		return "week10/numeron/index";
	}
	
	@PostMapping("/result")
	public String number(@ModelAttribute @Validated NumeronModel numeronModel,BindingResult bindingResult,Model model) {

		//バリデーションエラー時
		if (bindingResult.hasErrors()) {
			return index(numeronModel,model);
		}

		String attackNumber = numeronModel.getAttackNumber();
		List<Integer> answerList = numeronService.getAnswerList();
		List<Integer> attackResult = numeronService.getAttackResult(answerList,attackNumber);

		numeronService.addturn();

		model.addAttribute("hitCount",attackResult.get(0));
		model.addAttribute("blowCount",attackResult.get(1));

		if (attackResult.get(0)!=3) return "week10/numeron/retry";

		int turn = numeronService.getTurn();
		List<String> rank = numeronService.getRank(turn);

		model.addAttribute("turn",turn);
		model.addAttribute("answerList",answerList);
		model.addAttribute("rank",rank.get(0));
		model.addAttribute("message",rank.get(1));

		return "week10/numeron/result";
	}

}
