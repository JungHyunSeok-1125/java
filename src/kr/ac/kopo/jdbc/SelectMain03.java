package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;

class Test implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close()...");
	}
	
}

public class SelectMain03 {

	public static void main(String[] args) {
		
		String sql = "SELECT * FROM T_TEST";

		try (
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				//String은 AutoCloseable 상속 받지 않아서 여기 있을 수 없다.
		) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("ID : " + id + ", NAME : " + name);
			}
		} catch (Exception e) {
		}
	}
}
