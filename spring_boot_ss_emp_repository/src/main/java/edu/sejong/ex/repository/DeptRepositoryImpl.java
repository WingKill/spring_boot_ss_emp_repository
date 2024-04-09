package edu.sejong.ex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.sejong.ex.vo.DeptVo;

@Repository // @Component + 의미(DAO)
public class DeptRepositoryImpl implements DeptRepository{
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<DeptVo> selectList(){
		List<DeptVo> deptList = new ArrayList<DeptVo>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from dept";
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				DeptVo dept = new DeptVo(deptno, dname, loc);
				deptList.add(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}									
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
		return deptList;
	}

	@Override
	public void insert(DeptVo deptVo) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "insert into dept(deptno, dname, loc) values(?,?,?)";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, deptVo.getDeptno());
			pstmt.setString(2, deptVo.getDname());
			pstmt.setString(3, deptVo.getLoc());
			result = pstmt.executeUpdate();
			
			if(result > 0)
				System.out.println("insert successed");
			else
				System.out.println("insert failed");
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
	public void delete(DeptVo deptVo) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "delete from dept where deptno = ?";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, deptVo.getDeptno());
			result = pstmt.executeUpdate();
			
			if(result > 0)
				System.out.println("delete successed");
			else
				System.out.println("delete failed");
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
}
