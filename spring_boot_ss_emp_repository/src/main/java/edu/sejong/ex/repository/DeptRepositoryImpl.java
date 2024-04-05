package edu.sejong.ex.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.sejong.ex.vo.DeptVo;

@Repository
public class DeptRepositoryImpl implements DeptRepository{
	
	@Override
	public List<DeptVo> selectList(){
		return null;
	}
}
