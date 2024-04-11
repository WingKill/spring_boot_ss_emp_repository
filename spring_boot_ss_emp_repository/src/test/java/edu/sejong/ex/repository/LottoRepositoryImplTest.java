package edu.sejong.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LottoRepositoryImplTest {

	@Autowired
	LottoRepository lottoRepository;
	
	@Test
	void test() {
		assertNotNull(lottoRepository);
	}
	
	@Test
	void testAutoLotto() {
		assertNotNull(lottoRepository.autoLotto());
	}

}
