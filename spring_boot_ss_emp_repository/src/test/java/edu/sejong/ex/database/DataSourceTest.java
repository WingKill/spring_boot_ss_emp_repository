package edu.sejong.ex.database;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 데이터소스(커넥션 풀 테스트)
// 테스트를 위한 웹 프로그래밍 환경 구축
@SpringBootTest
class DataSourceTest {

	// 커넥션 풀 객체
	// 주입 키워드
	
	@Autowired
	private DataSource dataSource; 
	
	
	@Test
	void testConnection() {
		assertNotNull(dataSource);
		
		System.out.println("DS = " + dataSource);
		
		try(Connection conn = dataSource.getConnection()) {
			System.out.println("conn = " + conn);
			
            // conn의 데이터 타입이 Connection인가?
            // Connection 클래스의 인스턴스인지 아닌지를 확인하는 것.
			assertThat(conn).isInstanceOf(Connection.class);
			
			// Statement stmt = conn.createStatement();
			// ResultSet rs = stmt.executeQuery("select 100 from dual");
			
			PreparedStatement pstmt = conn.prepareStatement("select 100 from dual");
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getLong(1));
				assertEquals(100, rs.getLong(1));
			}
			
			// stmt.close();
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
