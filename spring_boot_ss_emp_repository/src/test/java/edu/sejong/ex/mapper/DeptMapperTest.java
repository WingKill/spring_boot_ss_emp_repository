package edu.sejong.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.DeptVo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DeptMapperTest {

	@Autowired
	private DeptMapper deptMapper;
	
	@Test
	void test() {
		assertNotNull(deptMapper);
	}
	
	@Test
	void testSelectList() {
		for(DeptVo dept : deptMapper.selectList()) {
			log.info("부서번호 : " + dept.getDeptno());
			log.info("부서이름 : " + dept.getDname());
			log.info("부서위치 : " + dept.getLoc());			
		}	
	}

	@Test
	void testInsert() {
		deptMapper.insert(new DeptVo(11, "홍콩", "마오이"));
		for(DeptVo dept : deptMapper.selectList()) {
			log.info("부서번호 : " + dept.getDeptno());
			log.info("부서이름 : " + dept.getDname());
			log.info("부서위치 : " + dept.getLoc());			
		}	
	}

	@Test
	void testDelete() {
		deptMapper.delete(new DeptVo(11, "홍콩", "마오이"));
		for(DeptVo dept : deptMapper.selectList()) {
			log.info("부서번호 : " + dept.getDeptno());
			log.info("부서이름 : " + dept.getDname());
			log.info("부서위치 : " + dept.getLoc());			
		}	
	}
}
