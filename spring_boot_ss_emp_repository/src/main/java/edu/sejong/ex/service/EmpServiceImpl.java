package edu.sejong.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.repository.EmpRepository;
import edu.sejong.ex.vo.EmpVo;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepository empRepository;
	
	@Override
	public List<EmpVo> getList() {
		return empRepository.selectList();
	}

	@Override
	public void register(EmpVo empVo) {
		empRepository.insert(empVo);		
	}

	@Override
	public void remove(EmpVo empVo) {
		empRepository.delete(empVo);
	}

	@Override
	public List<EmpVo> getMgrs() {
		return empRepository.selectMgrList();
	}

	@Override
	public List<String> getJobs() {
		return empRepository.selectJobList();
	}
}
