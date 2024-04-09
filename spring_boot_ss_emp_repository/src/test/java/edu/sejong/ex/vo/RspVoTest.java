package edu.sejong.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class RspVoTest {

	@Test
	void test() {
		RspVo rspVo = new RspVo();
		RspVo rspVo2 = new RspVo(3);
		
		log.info("rspVo : " + rspVo);
		log.info("rspVo2 : " + rspVo2);
		
		assertNotNull(rspVo);
		assertNotNull(rspVo2);
	}

}
