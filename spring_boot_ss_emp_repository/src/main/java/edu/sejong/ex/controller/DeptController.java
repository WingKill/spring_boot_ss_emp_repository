package edu.sejong.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.service.DeptService;
import edu.sejong.ex.vo.DeptVo;


@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService service;
	
	@GetMapping("/list")
	public String board(Model model) {
		System.out.println("board()..");
		List<DeptVo> depts = service.getList();
		model.addAttribute("depts", depts); 
		
		return "/dept/list";
	}
	
	@RequestMapping("/insert_view")
	public String insert() {
		System.out.println("insert()..");
		return "/dept/insert";
	}
	
	@PostMapping("/register")
	public String register(DeptVo deptVo) {
		service.register(deptVo);		
		return "redirect:/dept/list";
	}

	@PostMapping("/erase")
	public String erase(DeptVo deptVo) {
		service.erase(deptVo);		
		return "redirect:/dept/list";
	}
}
