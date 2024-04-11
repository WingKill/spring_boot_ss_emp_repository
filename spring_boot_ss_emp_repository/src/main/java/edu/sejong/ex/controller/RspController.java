package edu.sejong.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.RspService;
import edu.sejong.ex.vo.RspVo;


@Controller
@RequestMapping("/rsp")
public class RspController {

	@Autowired
	private RspService rspService;

	@GetMapping("/game")
	public String game(Model model, RspVo playerVo) {
		System.out.println("game()..");
		
		// 초기값 세팅을 위한 객체 배분()
		model.addAttribute("player", playerVo);		
		model.addAttribute("computer", playerVo);
		// 에러 처리한 부분 추가
		return "/game/rsp_game";
	}
	
	@RequestMapping("/result.do")
	public String result(Model model,@RequestParam("rsp") String rsp, RspVo playerVo) {
		playerVo.setRsp(rsp);
		List<RspVo> rsps = rspService.rspPlayers(playerVo);
		model.addAttribute("player", rsps.get(0));
		model.addAttribute("computer", rsps.get(1));
		return "/game/rsp_game";
	}
	
}
