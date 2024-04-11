package edu.sejong.ex.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.sejong.ex.vo.EmpVo;

@Mapper
public interface TimeMapper {
	
	@Select("select sysdate from dual")
	public String getTime();
	
	@Select("select 1+1 from dual")
	public String getOnePlusOne();
	
	@Select("select * from emp")
	public ArrayList<EmpVo> getEmps();
}
