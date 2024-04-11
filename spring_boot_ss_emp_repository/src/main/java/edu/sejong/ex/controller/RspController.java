package edu.sejong.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.RspService;
import edu.sejong.ex.vo.RspVo;


@Controller
@RequestMapping("/rsp")
public class RspController {

	@Autowired
	private RspService rspService;

	// 초기화면
	@GetMapping("/game")
	public String game(Model model, RspVo defaultSet) {
		System.out.println("game()..");
		
		model.addAttribute("player", defaultSet);		
		model.addAttribute("computer", defaultSet);
		// 에러 처리한 부분 추가
		return "/game/rsp_game";
	}
	
	// 결과창
	@PostMapping("/result.do")
	public String result(Model model,@RequestParam("rsp") String rsp, RspVo player) {
		List<RspVo> rsps = rspService.players(rsp, player);
		
		model.addAttribute("player", rsps.get(0));
		model.addAttribute("computer", rsps.get(1));
		return "/game/rsp_game";
	}
	
}
