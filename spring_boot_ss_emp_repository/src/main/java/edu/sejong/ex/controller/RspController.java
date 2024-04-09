package edu.sejong.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.DeptService;
import edu.sejong.ex.service.EmpService;
import edu.sejong.ex.service.RspService;
import edu.sejong.ex.vo.EmpVo;
import edu.sejong.ex.vo.RspVo;


@Controller
@RequestMapping("/rsp")
public class RspController {

	@Autowired
	private RspService rspService;

	@GetMapping("/game")
	public String game(Model model, RspVo playerVo, RspVo computerVo) {
		System.out.println("game()..");
		
		model.addAttribute("player", playerVo);
		model.addAttribute("computer", computerVo);
		
		// 에러 처리한 부분 추가
		return "/game/rsp_game";
	}
	
	@RequestMapping("/result.do")
	public String result(Model model,@RequestParam("rsp") String rsp, RspVo playerVo, RspVo computerVo) {
		playerVo.setRsp(rsp);
		rspService.rspPlayers(playerVo, computerVo);
		model.addAttribute("player", playerVo);
		model.addAttribute("computer", computerVo);
		return "/game/rsp_game";
	}
	
}
