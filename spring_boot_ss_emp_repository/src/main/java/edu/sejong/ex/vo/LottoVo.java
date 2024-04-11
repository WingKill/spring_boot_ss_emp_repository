package edu.sejong.ex.vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LottoVo {
	private final static int LOTTO_COUNT = 7;
	private Set<Integer> numbers = new HashSet<Integer>();
	private List<Integer> arrList = new ArrayList<Integer>();
	private int bonusNum;
	private String[] colors = {"blue","red","green","orange","black"};	
	private String background = null;

	public LottoVo() {
		while(numbers.size() < LOTTO_COUNT) {
			numbers.add((int)(Math.random()*45 + 1));
		}
		
		List<Integer> arrList = new ArrayList<Integer>(numbers);
		for(int i = 0; i<arrList.size()-1; i++) {
			int num = arrList.get(i);
			this.arrList.add(num);
		}
		
		this.bonusNum = arrList.get(LOTTO_COUNT-1);
	}
	

	public String getBackground(int num) {
		if(num >= 40) {
			background = colors[4];
		}else if(num >= 30) {
			background = colors[3];
		}else if(num >= 20) {
			background = colors[2];
		}else if(num >= 10) {
			background = colors[1];
		}else {			
			background = colors[0];
		}
		return background;
	}
}
