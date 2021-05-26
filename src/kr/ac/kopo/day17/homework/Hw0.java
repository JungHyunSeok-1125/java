package kr.ac.kopo.day17.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactoryHR;
import kr.ac.kopo.util.JDBCClose;

public class Hw0 {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "SELECT AVG(salary) AS AVERAGE, job_title FROM employees e, (SELECT job_title, job_id FROM jobs) j WHERE e.job_id = j.job_id AND e.salary > ? GROUP BY job_title, salary ORDER BY AVG(salary) DESC";
		//LINE :: 쿼리문 작성
		try {
			ConnectionFactoryHR factory = new ConnectionFactoryHR();
	        conn = factory.getConnection();
	         
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			String number = sc.nextLine();
			//LINE :: 문자열 입력
			
			pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, number); //LINE :: ? 위치에 문자를 입력한다.
	        ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) { //WHILE :: 행 하나씩 이동하면서 출력한다. 
				String avg = rs.getString("AVERAGE");
				String jobtitle = rs.getString("JOB_TITLE");
				System.out.println("AVERAGE : " + avg + ", JOB_TITLE : " + jobtitle);
			}
		} catch (Exception e) {
		} finally {
			JDBCClose.close(conn,pstmt);
		}
		
	}

}
