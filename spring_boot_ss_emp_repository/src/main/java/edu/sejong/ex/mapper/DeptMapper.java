package edu.sejong.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sejong.ex.vo.DeptVo;

@Mapper
public interface DeptMapper {
	List<DeptVo> selectList();	
	void insert(DeptVo deptVo);
	void delete(DeptVo deptVo);
}
