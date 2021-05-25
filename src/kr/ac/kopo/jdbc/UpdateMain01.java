package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * JDBC 작업 순서
 * 1. 드라이버 로딩
 * 2. DB접속 후 연결 객체 얻기
 * 3. SQL문 실행할 객체 얻기 
 * 4. SQL문 실행 및 결과 얻기
 * 5. DB접속 해제
 * 
 * */
public class UpdateMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
			
			//3단계
			System.out.println("아이디를 입력 : ");
			String id = sc.nextLine();
			
			System.out.println("이름을 입력 : ");
			String name = sc.nextLine();
			/*
			String sql =  "UPDATE T_TEST ";
				   sql += "SET NAME = ? ";
				   sql += "WHERE ID= ? ";
				  */
			
			StringBuilder sql = new StringBuilder();
			sql.append("update t_test ");
			sql.append(" set name = ?");
			sql.append(" where id = ?");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, id);
				   
			//4단계
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 수정");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} // IF :: stmt 자원 해제

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} // IF :: conn 자원 해제
			sc.close();// LINE :: scanner 자원 해제
		}
	}
}
