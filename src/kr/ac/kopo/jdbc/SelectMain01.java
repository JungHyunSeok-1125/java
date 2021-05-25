package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
		//	ConnectionFactory factory = new ConnectionFactory();
		//	conn =  factory.getConnection();			
			conn = new ConnectionFactory().getConnection();
			
			// 3단계 : SQL문 실행할 객체 얻기
			String sql = "SELECT * FROM T_TEST";
			pstmt = conn.prepareStatement(sql);
			
			// 4단계 : SQL문 실행 및 결과 얻기
			pstmt.executeQuery();
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : " + id + ", name : " + name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn,pstmt);
		}
	}

}
