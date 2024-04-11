package edu.sejong.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
		assertNotNull(lottoService.numbers());
	}
}
