package edu.sejong.ex.service;

import java.util.List;

import edu.sejong.ex.vo.RspVo;


public interface RspService {
	List<RspVo> players(String rsp, RspVo rspPlayer);
}
