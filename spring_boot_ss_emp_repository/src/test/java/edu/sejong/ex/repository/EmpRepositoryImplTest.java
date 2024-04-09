package edu.sejong.ex.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.EmpVo;

@SpringBootTest
class EmpRepositoryImplTest {
		
	@Autowired
	private EmpRepository empRepository;
	
	@Test
	void test() {
		assertNotNull(empRepository);
		System.out.println(empRepository);
	}
	
	@Test
	void testSelectList() {
		for(EmpVo emp : empRepository.selectList()) {
			System.out.println("==========================");
			System.out.println("사원번호 : " + emp.getEmpno() );
			System.out.println("사원명 : " + emp.getEname());
			System.out.println("직업 : " + emp.getJob() );
			System.out.println("매니저 : " + emp.getMgr() );
			System.out.println("입사일 : " + emp.getHiredate() );
			System.out.println("월급 : " + emp.getSal() );
			System.out.println("성과금 : " + emp.getComm() );
			System.out.println("부서번호 : " + emp.getDeptno() );
			System.out.println("==========================");
		}
	}

	@Test
	void testInsert() {
		empRepository.insert(new EmpVo(500, "텟1", "텟2", 752, new Timestamp(System.currentTimeMillis()), 100, "20", 20));
		for(EmpVo emp : empRepository.selectList()) {
			System.out.println("==========================");
			System.out.println("사원번호 : " + emp.getEmpno() );
			System.out.println("사원명 : " + emp.getEname());
			System.out.println("직업 : " + emp.getJob() );
			System.out.println("매니저 : " + emp.getMgr() );
			System.out.println("입사일 : " + emp.getHiredate() );
			System.out.println("월급 : " + emp.getSal() );
			System.out.println("성과금 : " + emp.getComm() );
			System.out.println("부서번호 : " + emp.getDeptno() );
			System.out.println("==========================");
		}
	}
	
	@Test
	void testDelete() {
		empRepository.delete(new EmpVo(500, "텟1", "텟2", 752, new Timestamp(System.currentTimeMillis()), 100, "20", 20));
		for(EmpVo emp : empRepository.selectList()) {
			System.out.println("==========================");
			System.out.println("사원번호 : " + emp.getEmpno() );
			System.out.println("사원명 : " + emp.getEname());
			System.out.println("직업 : " + emp.getJob() );
			System.out.println("매니저 : " + emp.getMgr() );
			System.out.println("입사일 : " + emp.getHiredate() );
			System.out.println("월급 : " + emp.getSal() );
			System.out.println("성과금 : " + emp.getComm() );
			System.out.println("부서번호 : " + emp.getDeptno() );
			System.out.println("==========================");
		}
	}
	
	@Test
	void testSelectMgrList() {
		System.out.println("매니저에 들어갈 리스트");
		for(EmpVo emp : empRepository.selectMgrList()) {
			System.out.println("====================");
			System.out.println("사원번호 : " + emp.getEmpno() );
			System.out.println("사원명 : " + emp.getEname());
			System.out.println("직업 : " + emp.getJob() );
			System.out.println("매니저 : " + emp.getMgr() );
			System.out.println("입사일 : " + emp.getHiredate() );
			System.out.println("월급 : " + emp.getSal() );
			System.out.println("성과금 : " + emp.getComm() );
			System.out.println("부서번호 : " + emp.getDeptno() );
			System.out.println("==========================");
		}
	}
	
	@Test
	void testSelectJobList() {
		System.out.println("직업에 들어갈 리스트");
		for(String job : empRepository.selectJobList()) {
			System.out.println("====================");
			System.out.println("직업 : " + job );
			System.out.println("==========================");
		}
	}
}
