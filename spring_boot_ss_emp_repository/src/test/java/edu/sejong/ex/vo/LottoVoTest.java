package edu.sejong.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LottoVoTest {

	@Test
	void test() {
		LottoVo lottoVo = new LottoVo();
		assertNotNull(lottoVo);
		log.info("로또객체 : " + lottoVo);
		log.info("로또번호들 : " + lottoVo.getArrList());
		log.info("보너스번호 : " + lottoVo.getBonusNum());
	}

}
