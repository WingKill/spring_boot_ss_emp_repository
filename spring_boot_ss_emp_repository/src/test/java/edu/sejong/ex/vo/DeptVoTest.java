package edu.sejong.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeptVoTest {

	@Test
	void testDeptVo() {
		//DeptVo dept = new DeptVo();
		
		DeptVo dept = new DeptVo(1234, "영업팀", "서울");
		System.out.println(dept);
		//assertNotNull(dept);
		assertEquals(dept.getDname(), "영업팀");
	}

}
