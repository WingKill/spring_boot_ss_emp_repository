package edu.sejong.ex.controller;

import java.sql.Timestamp;
/*import java.text.ParseException;
import java.text.SimpleDateFormat;*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
/*import java.util.Date;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.service.DeptService;
import edu.sejong.ex.service.EmpService;
import edu.sejong.ex.vo.EmpVo;


@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService service;
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping("/list")
	public String board(Model model) {
		System.out.println("board()..");
		model.addAttribute("emps", service.getList());
		// 에러 처리한 부분 추가
		return "/emp/list";
	}
	
	@GetMapping("/insert_view")
	public String insertView(Model model) {
		System.out.println("insertView()..");
		model.addAttribute("depts", deptService.getList());
		model.addAttribute("mgrs", service.getMgrs());
		model.addAttribute("jobs", service.getJobs());
		return "/emp/insert";
	}
	
	@PostMapping("/register")
	public String register(@RequestParam("hiredatestr") String hiredate, EmpVo empVo){
		System.out.println("register()..");		
		if (hiredate == null || hiredate.isEmpty()) {
	        return "redirect:/emp/list";
	    }
		System.out.println(empVo);
		
//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			Date date = sdf.parse(hiredate);
//			Timestamp timestamp = new Timestamp(date.getTime());
//			empVo.setHiredate(timestamp);
//	    } catch (ParseException e) {
//	        return "redirect:/emp/list";
//	    }		
		
		try {
	        // 문자열을 LocalDate로 파싱
	        LocalDate localDate = LocalDate.parse(hiredate);
	        // LocalDate를 LocalDateTime으로 변환 (시간은 자정으로 설정)
	        LocalDateTime localDateTime = localDate.atStartOfDay();
	        // LocalDateTime을 Timestamp로 변환
	        Timestamp timestamp = Timestamp.valueOf(localDateTime);
	        
	        System.out.println("변환된 Timestamp 확인 : " + timestamp);
	        
	        empVo.setHiredate(timestamp);
	    } catch (DateTimeParseException e) {
	        return "redirect:/emp/list";
	    }
      		
		service.register(empVo);
		return "redirect:/emp/list";
	}

	@GetMapping("/remove")
	public String remove(EmpVo empVo) {
		service.remove(empVo);
		return "redirect:/emp/list";
	}
}
