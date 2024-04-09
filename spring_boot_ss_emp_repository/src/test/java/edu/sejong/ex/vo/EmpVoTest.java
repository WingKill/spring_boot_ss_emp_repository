package edu.sejong.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;


class EmpVoTest {

	@Test
	void test() {
		EmpVo vo = new EmpVo(6, "안녕", "하이", 12, new Timestamp(System.currentTimeMillis()) , 100, "100", 10);
		System.out.println(vo);
		assertEquals("하이", vo.getJob());
		
	}

}
