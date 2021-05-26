package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//DB접속하고 드라이버 로딩하고 연결객체를 알려주는게 목적
public class ConnectionFactoryHR {

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public Connection getConnection() {
		// 1단계
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.217.57:1522:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
