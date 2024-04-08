package edu.sejong.ex.repository;

import java.util.List;

import edu.sejong.ex.vo.DeptVo;

public interface DeptRepository {
	List<DeptVo> selectList();	
	void insert(DeptVo deptVo);
	void delete(DeptVo deptVo);
}
