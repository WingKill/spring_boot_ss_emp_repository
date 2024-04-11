package edu.sejong.ex.repository;

import org.springframework.stereotype.Repository;

import edu.sejong.ex.vo.LottoVo;

@Repository
public class LottoRepositoryImpl implements LottoRepository {

	@Override
	public LottoVo autoLotto() {
		LottoVo lotto = new LottoVo();
		return lotto;
	}

}
