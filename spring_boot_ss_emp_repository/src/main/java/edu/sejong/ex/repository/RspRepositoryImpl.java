package edu.sejong.ex.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.sejong.ex.vo.RspVo;

@Repository
public class RspRepositoryImpl implements RspRepository {
	
	@Override
	public List<RspVo> players(RspVo rspPlayer, RspVo rspComputer) {
		List<RspVo> players = new ArrayList<RspVo>();
		
		if(rspPlayer.getRsp() != null) {
			rspPlayer.rspGame(rspComputer);
		}else{
			rspPlayer = new RspVo(3);
			rspComputer = new RspVo(3);
		}
		
		players.add(rspPlayer);
		players.add(rspComputer);
		return players;
	}

}
