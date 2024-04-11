package edu.sejong.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class LottoServiceImplTest {

	@Autowired
	LottoService lottoService;
		
	@Test
	void test() {
		assertNotNull(lottoService);
	}

	@Test
	void testNumbers() {
		log.info("로또숫자 : " + lottoService.numbers().getArrList());
	}
}
