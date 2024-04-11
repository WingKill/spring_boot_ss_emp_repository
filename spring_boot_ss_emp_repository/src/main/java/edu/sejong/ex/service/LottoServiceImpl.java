package edu.sejong.ex.service;

import org.springframework.stereotype.Service;

import edu.sejong.ex.vo.LottoVo;

@Service
public class LottoServiceImpl implements LottoService{

	@Override
	public LottoVo numbers() {
		return new LottoVo();
	}
}
