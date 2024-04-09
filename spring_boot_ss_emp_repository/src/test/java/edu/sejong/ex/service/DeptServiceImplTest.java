package edu.sejong.ex.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.DeptVo;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootTest
class DeptServiceImplTest {

	@Autowired
	private DeptService deptService;
	
	@Test
	void test() {
		assertNotNull(deptService);
		System.out.println("주소 : " + deptService);
		
		assertThat(deptService).isInstanceOf(DeptService.class);
	}
	
	@Test
	void testGetList() {
		log.info("아으아으아앙");
		
		for(DeptVo deptVo : deptService.getList()) {
			System.out.println("============================");
			System.out.println("부서번호 : " + deptVo.getDeptno());
			System.out.println("부서명 : " + deptVo.getDname());
			System.out.println("부서위치 : " + deptVo.getLoc());
			System.out.println("============================");
		}
	}
	
	@Test
	void testRegister() {
//		DeptVo deptVo = new DeptVo(12, "이름", "위치");
//		deptService.register(deptVo);
		deptService.register(new DeptVo(12, "이름", "위치"));
//		List<DeptVo> depts = deptService.getList();
		for(DeptVo deptVo : deptService.getList()) {
			System.out.println("============================");
			System.out.println("부서번호 : " + deptVo.getDeptno());
			System.out.println("부서명 : " + deptVo.getDname());
			System.out.println("부서위치 : " + deptVo.getLoc());
			System.out.println("============================");
		}
//		for(DeptVo vo : depts) {
//			String name = vo.getDname();
//			if(name.equals("이름")){
//				assertEquals(name , "이름");
//				System.out.println("확인 완료");
//			}
//		}
	}
	
	@Test
	void testErase() {
//		DeptVo deptVo = new DeptVo(12, "이름", "위치");
//		deptService.erase(deptVo);
//		List<DeptVo> depts = deptService.getList();
//		for(DeptVo vo : depts) {
//			int no = vo.getDeptno();
//			if(no == 12 ) {
//				// 에러 때리란 소리.
//				assertEquals(no, 12);
//			}
//		}
		deptService.erase(new DeptVo(12, "이름", "위치"));
		for(DeptVo deptVo : deptService.getList()) {
			System.out.println("============================");
			System.out.println("부서번호 : " + deptVo.getDeptno());
			System.out.println("부서명 : " + deptVo.getDname());
			System.out.println("부서위치 : " + deptVo.getLoc());
			System.out.println("============================");
		}
	}
}
