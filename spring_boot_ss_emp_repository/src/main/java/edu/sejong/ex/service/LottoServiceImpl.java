package edu.sejong.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.repository.LottoRepository;
import edu.sejong.ex.vo.LottoVo;

@Service
public class LottoServiceImpl implements LottoService{

	@Autowired
	LottoRepository lottoRepository;
	
	@Override
	public LottoVo numbers() {
		return lottoRepository.autoLotto();
	}
}
