package edu.sejong.ex.service;

import java.util.List;

import edu.sejong.ex.vo.EmpVo;

public interface EmpService {
	List<EmpVo> getList();
	List<EmpVo> getMgrs();
	List<String> getJobs();
	void register(EmpVo empVo);
	void remove(EmpVo empVo);
}
