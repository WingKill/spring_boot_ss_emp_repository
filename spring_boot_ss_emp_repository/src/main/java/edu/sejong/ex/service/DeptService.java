package edu.sejong.ex.service;

import java.util.List;

import edu.sejong.ex.vo.DeptVo;

public interface DeptService {
	List<DeptVo> getList();
	void register(DeptVo deptVo);
	void erase(DeptVo deptVo);
}
