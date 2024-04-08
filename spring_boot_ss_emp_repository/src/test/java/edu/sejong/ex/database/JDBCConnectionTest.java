package edu.sejong.ex.database;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.junit.jupiter.api.Test;

class JDBCConnectionTest {

	@Test
	void testConnection() {
		// 1. DB접속
		// Connection 클래스
		Connection conn = null;
		
		// 2. 연결 문자열 생성
		// - 접속에 필요한 정보로 구성된 문자열. Connection String
		// - localhost 대신, ip주소가 들어갈수도 있음
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String id = "scott";
        String pw = "tiger";
        
        // DB작업  > 외부 입출력 > try-catch 필수
        try {
			// 3. JDBC 드라이버 로딩
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	        	
        	// 4. 접속
        	// - Connection 객체 생성 + 접속 작업
			conn = DriverManager.getConnection(url,id,pw);
			// 접속 중(false), 접속종료(true)
			System.out.println(conn.isClosed()?"접속종료":"접속중");
			
			// 5. SQL
			
			// 6. 접속종료
			conn.close();
			// 접속 중(false), 접속종료(true)
			System.out.println(conn.isClosed()?"접속종료":"접속중");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
