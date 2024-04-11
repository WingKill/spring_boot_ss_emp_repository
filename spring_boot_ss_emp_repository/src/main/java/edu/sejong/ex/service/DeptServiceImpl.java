package edu.sejong.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.repository.DeptRepository;
import edu.sejong.ex.vo.DeptVo;

// @Component + 의미(Command) 
@Service 
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptRepository deptRepository;
	
	@Override
	public List<DeptVo> getList() {
		System.out.println("getList()..");
		return deptRepository.selectList();
	}

	@Override
	public void register(DeptVo deptVo) {
		System.out.println("register()..");
		deptRepository.insert(deptVo);
	}

	@Override
	public void erase(DeptVo deptVo) {
		System.out.println("erase()..");
		deptRepository.delete(deptVo);		
	}

}
