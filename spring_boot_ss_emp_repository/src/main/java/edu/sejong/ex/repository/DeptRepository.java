package edu.sejong.ex.repository;

import java.util.List;

import edu.sejong.ex.vo.DeptVo;

public interface DeptRepository {
	public List<DeptVo> selectList();	
}
