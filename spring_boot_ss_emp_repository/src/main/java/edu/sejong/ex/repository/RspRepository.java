package edu.sejong.ex.repository;

import java.util.List;

import edu.sejong.ex.vo.RspVo;


public interface RspRepository {
	List<RspVo> players(RspVo rspPlayer, RspVo rspComputer);
}
