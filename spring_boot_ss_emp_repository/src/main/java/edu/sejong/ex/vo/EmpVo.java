package edu.sejong.ex.vo;



import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpVo {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Timestamp hiredate;
	private int sal;
	private String comm;
	private int deptno;
}
