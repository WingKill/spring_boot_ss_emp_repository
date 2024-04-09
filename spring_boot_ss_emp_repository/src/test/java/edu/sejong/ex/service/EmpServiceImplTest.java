package edu.sejong.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.EmpVo;

@SpringBootTest
class EmpServiceImplTest {

	@Autowired
	private EmpService empService;
	
	@Test
	void test() {
		assertNotNull(empService);
		System.out.println(empService);
	}
	
	@Test
	void testGetList() {
		for(EmpVo emp : empService.getList()) {
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
	void testRegister() {
		empService.register(new EmpVo(20, "텟", "텟2", 30, new Timestamp(System.currentTimeMillis()), 200, null, 20));
		for(EmpVo emp : empService.getList()) {
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
	void testRemove() {
		empService.remove(new EmpVo(20, "텟", "텟2", 30, new Timestamp(System.currentTimeMillis()), 200, null, 20));
		for(EmpVo emp : empService.getList()) {
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
	void testGetMgrs() {
		System.out.println("매니저리스트");
		for(EmpVo emp : empService.getMgrs()) {
			System.out.println("============매니저리스트=============");
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
	void testGetJobs() {
		System.out.println("직업 리스트");
		for(String job : empService.getJobs()) {
			System.out.println("====================");
			System.out.println("직업 : " + job );
			System.out.println("==========================");
		}
	}	
}
