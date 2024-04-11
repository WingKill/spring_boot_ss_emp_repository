package edu.sejong.ex.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.sejong.ex.service.LottoService;

@Controller
@RequestMapping("/lotto")
public class LottoController {

	@Autowired
	LottoService lottoService;
	
	@GetMapping("/list.do")
	public String lottoSetting(Model model) {
		model.addAttribute("lotto", lottoService.numbers());
		return "/game/lotto_list";
	}
	
}
