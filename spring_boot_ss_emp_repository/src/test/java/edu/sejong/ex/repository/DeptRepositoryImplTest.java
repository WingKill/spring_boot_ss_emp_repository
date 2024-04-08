package edu.sejong.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.DeptVo;

@SpringBootTest
class DeptRepositoryImplTest {

	@Autowired
	private DeptRepository deptRepository;
	
	@Test
	void test() {
		assertNotNull(deptRepository);
		System.out.println(deptRepository); 
	}
	
	@Test
	void testSelectList() {
		System.out.println("-----------------selectList()--------------------");
		System.out.println("-------------------------------------------");
		for(DeptVo deptVo : deptRepository.selectList()) {			
			System.out.println("부서번호 : " + deptVo.getDeptno());
			System.out.println("부서이름 : " + deptVo.getDname());
			System.out.println("부서위치 : " + deptVo.getLoc());
			System.out.println("-------------------------------------------");
		}	
	}
	
	@Test
	void testInsert() {
		DeptVo deptVo = new DeptVo(11, "홍콩", "마오이");
		deptRepository.insert(deptVo);
		List<DeptVo> depts = deptRepository.selectList();
		testSelectList();
		for(DeptVo vo : depts) {
			String name = vo.getDname();
			if(name.equals("홍콩")){
				assertEquals(name, "홍콩");
				System.out.println("확인 완료");
			}
		}
	}
	
	@Test
	void testDelete() {
		DeptVo deptVo = new DeptVo(11, "홍콩", "마오이");
		deptRepository.delete(deptVo);
		List<DeptVo> depts = deptRepository.selectList();
		testSelectList();
		for(DeptVo vo : depts) {
			int no = vo.getDeptno();
			if(no == 11 ) {
				// 에러 때리란 소리.
				assertEquals(no, 11);
			}
		}		
	}

}
