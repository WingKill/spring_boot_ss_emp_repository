package edu.sejong.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.repository.RspRepository;
import edu.sejong.ex.vo.RspVo;

@Service
public class RspServiceImpl implements RspService{
	
	@Autowired
	private RspRepository repository;
	
	@Override
	public List<RspVo> rspPlayers(RspVo rspPlayer) {
		return repository.players(rspPlayer);
	}
}
