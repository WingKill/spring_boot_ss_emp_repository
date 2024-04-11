package edu.sejong.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.RspVo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class RspServiceImplTest {

	@Autowired
	RspService rspService;
	
	@Test
	void test() {
		assertNotNull(rspService);
	}
	
	@Test
	void testRspPlayers() {
		RspVo rspPlayer = new RspVo();
		List<RspVo> list =  rspService.players("가위", rspPlayer);
		for(RspVo member : list) {
			log.info("각각의 rsp 값 : " + member.getRsp());
			log.info("각각의 rsp 이미지 값 : " + member.getImage());
			log.info("승부 : " + member.getResult());
		}
	}

}
