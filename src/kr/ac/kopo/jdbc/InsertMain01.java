package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC 작업 순서
 * 1. 드라이버 로딩
 * 2. DB접속 후 연결 객체 얻기
 * 3. SQL문 실행할 객체 얻기 
 * 4. SQL문 실행 및 결과 얻기
 * 5. DB접속 해제
 * 
 * */
public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공......");

			// 2단계 : DB 연결 후 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("conn : " + conn);

			// 3단계 : SQL문 실행할 객체 얻기
			stmt = conn.createStatement();// LINE :: java.sql 패키지 안에 있는 거 가져오기
			String sql = "INSERT INTO T_TEST(ID,NAME) ";
				   sql += "VALUES ('HONG', '홍길동') ";

			// 4단계 : SQL문 실행 및 결과 얻기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//IF :: stmt 자원 해제
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} //IF :: conn 자원 해제
		} // LINE :: Finally 종료

	}
}
