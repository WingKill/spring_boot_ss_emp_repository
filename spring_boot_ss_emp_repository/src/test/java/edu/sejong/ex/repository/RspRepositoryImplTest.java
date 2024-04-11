package edu.sejong.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.RspVo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class RspRepositoryImplTest {

	@Autowired
	private RspRepository repository;
	
	@Test
	void test() {
		assertNotNull(repository);
	}
	
	@Test
	void testPlayers() {		
		RspVo rspPlayer = new RspVo();
		rspPlayer.setRsp("가위");
		for(RspVo member : repository.players(rspPlayer)) {
			log.info("각각의 rsp 값 : " + member.getRsp());
			log.info("각각의 rsp 이미지 값 : " + member.getImage());
			log.info("승부 : " + member.getResult());
		}		
	}

}
