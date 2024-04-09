package edu.sejong.ex.repository;

import java.util.List;

import edu.sejong.ex.vo.EmpVo;

public interface EmpRepository {
	List<EmpVo> selectList();
	List<EmpVo> selectMgrList();
	List<String> selectJobList(); 
	void insert(EmpVo empVo);
	void delete(EmpVo empVo);
}
