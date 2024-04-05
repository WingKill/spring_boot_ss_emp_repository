package edu.sejong.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
이름     널?       유형           
------ -------- ------------ 
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeptVo {
	private int deptno;
	private String dname;
	private String loc;

	
}
