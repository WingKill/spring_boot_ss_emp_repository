package edu.sejong.ex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.sejong.ex.vo.EmpVo;

@Repository
public class EmpRepositoryImpl implements EmpRepository {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<EmpVo> selectList() {
		List<EmpVo> empList = new ArrayList<EmpVo>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from emp";
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				 int empno = rs.getInt("empno");
				 String ename = rs.getString("ename");
				 String job = rs.getString("job");
				 int mgr = rs.getInt("mgr");
				 Timestamp hiredate = rs.getTimestamp("hiredate");
				 int sal = rs.getInt("sal");
				 String comm = rs.getString("comm");
				 int deptno = rs.getInt("deptno");
				 
				 EmpVo vo = new EmpVo(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				 empList.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}		
		return empList;
	}

	@Override
	public void insert(EmpVo empVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values (?,?,?,?,?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empVo.getEmpno());
			pstmt.setString(2, empVo.getEname());
			pstmt.setString(3, empVo.getJob());
			pstmt.setInt(4, empVo.getMgr());
			//pstmt.setTimestamp(5, empVo.getHiredate());
			pstmt.setString(5, empVo.getHiredateStr());
			pstmt.setInt(6, empVo.getSal());
			pstmt.setString(7, empVo.getComm());
			pstmt.setInt(8, empVo.getDeptno());
			result = pstmt.executeUpdate();
			
			if(result > 0)
				System.out.println("emp insert successed");
			else
				System.out.println("emp insert failed");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {			
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void delete(EmpVo empVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "delete from emp where empno = ?";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empVo.getEmpno());
			result = pstmt.executeUpdate();
			
			if(result > 0)
				System.out.println("emp delete successed");
			else
				System.out.println("emp delete failed");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {			
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

	@Override
	public List<EmpVo> selectMgrList() {
		List<EmpVo> mgrList = new ArrayList<EmpVo>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from emp where job in('MANAGER','PRESIDENT','ANALYST')";
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				 int empno = rs.getInt("empno");
				 String ename = rs.getString("ename");
				 String job = rs.getString("job");
				 int mgr = rs.getInt("mgr");
				 Timestamp hiredate = rs.getTimestamp("hiredate");
				 int sal = rs.getInt("sal");
				 String comm = rs.getString("comm");
				 int deptno = rs.getInt("deptno");
				 
				 EmpVo vo = new EmpVo(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				 mgrList.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}		
		return mgrList;

	}

	@Override
	public List<String> selectJobList() {
		List<String> jobList = new ArrayList<String>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select DISTINCT job from emp";
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				 String job = rs.getString("job");
				 jobList.add(job);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}		
		return jobList;
	}

}
