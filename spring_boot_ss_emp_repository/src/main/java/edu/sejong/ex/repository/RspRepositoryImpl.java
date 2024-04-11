package edu.sejong.ex.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.sejong.ex.vo.RspVo;
import lombok.extern.slf4j.Slf4j;

@Repository
public class RspRepositoryImpl implements RspRepository {
	
	@Override
	public List<RspVo> players(RspVo rspPlayer) {
		List<RspVo> players = new ArrayList<RspVo>();
		RspVo rspComputer = new RspVo(1);
		
		if(rspPlayer.getRsp() != null) {
			
			rspPlayer.rspGame(rspComputer);
		}
			
		
		players.add(rspPlayer);
		players.add(rspComputer);
		return players;
	}

}
