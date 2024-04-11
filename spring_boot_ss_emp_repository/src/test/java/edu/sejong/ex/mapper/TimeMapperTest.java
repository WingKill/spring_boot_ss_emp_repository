package edu.sejong.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class TimeMapperTest {

	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	void testTimeMapper() {
		assertNotNull(timeMapper);
	}

	@Test
	void testGetTime() {
		log.info("현재 시간 : " + timeMapper.getTime());
	}
	
	@Test
	void testGetOnePlusOne() {
		log.info("나오는 값 : " + timeMapper.getOnePlusOne());
	}
	
	@Test
	void testGetEmps() {
		for(EmpVo emp : timeMapper.getEmps()) {
			log.info("나오는 객체 : " + emp);
			log.info("나오는 객체 내 번호 : " + emp.getEmpno());
		}		
	}
	
	@Test
	void testGetTime2() {
		log.info("현재 시간 : " + timeMapper.getTime2());
	}
	
	@Test
	void testGetOnePlusOne2() {
		log.info("나오는 값 : " + timeMapper.getOnePlusOne2());
	}
}
