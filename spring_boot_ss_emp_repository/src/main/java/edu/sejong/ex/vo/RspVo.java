package edu.sejong.ex.vo;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class RspVo {
	private static String[] arrRsp = {"가위","바위","보"};
	private static String[] arrResult = {"당신이 이겼습니다.","서로 비겼습니다.","당신이 졌습니다."};
	private static String[] arrImage = {
	"http://49.247.158.208:9999/hjs/img/scissor.f9ef898c.jpg\r\n", 
	"http://49.247.158.208:9999/hjs/img/rock.8b39a13f.jpg\r\n",
	"http://49.247.158.208:9999/hjs/img/paper.0b032424.jpg",
	"https://taegon.kim/wp-content/uploads/2018/05/image-5.png" };
	private String image = null;
	private String rsp = null;
	private String result = null;
	
	// 컴퓨터
	public RspVo(int num) {
		// 0~2까지 랜덤한 숫자 얻기
		rsp = arrRsp[(int)(Math.random()*3)];
	}
	
	// 초기 객체
	public RspVo() {
		image = arrImage[3];
	}
	
	public void rspGame(RspVo rspVo) {
		String comRsp = rspVo.getRsp();
		if(this.rsp.equals(comRsp)) {
			result = arrResult[1];
		}
		
		if((this.rsp.equals(arrRsp[0]) && comRsp.equals(arrRsp[1]))
		 ||(this.rsp.equals(arrRsp[1]) && comRsp.equals(arrRsp[2]))
		 ||(this.rsp.equals(arrRsp[2]) && comRsp.equals(arrRsp[0]))) {
			result = arrResult[2];					
		}else if((this.rsp.equals(arrRsp[0]) && comRsp.equals(arrRsp[2]))
			   ||(this.rsp.equals(arrRsp[1]) && comRsp.equals(arrRsp[0]))
			   ||(this.rsp.equals(arrRsp[2]) && comRsp.equals(arrRsp[1]))) {
			result = arrResult[0];
		}
	}
	
	public String getImage() {
		if(rsp != null) {
			int num = Arrays.asList(arrRsp).indexOf(rsp);
			image = arrImage[num];
		}		
		return image;
	}
}
