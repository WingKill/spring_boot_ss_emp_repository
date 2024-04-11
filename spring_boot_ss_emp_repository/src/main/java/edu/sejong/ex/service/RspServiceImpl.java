package edu.sejong.ex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.sejong.ex.vo.RspVo;

@Service
public class RspServiceImpl implements RspService{
	
	@Override
	public List<RspVo> players(String rsp, RspVo rspPlayer) {
		List<RspVo> players = new ArrayList<RspVo>();
		RspVo rspComputer = new RspVo(1);
		rspPlayer.setRsp(rsp);
		
		if(rspPlayer.getRsp() != null) {			
			rspPlayer.rspGame(rspComputer);
		}			
		
		players.add(rspPlayer);
		players.add(rspComputer);
		return players;
	}
}
