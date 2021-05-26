package kr.ac.kopo.day18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10000);
			System.out.println("어플리케이션 서버 실행...");
			
			Socket client = server.accept();
			//System.out.println("연결된 클라이언트 정보 : " + client.getInetAddress());
			System.out.println("연결된 클라이언트 정보 : " + client);
			
			String msg = "접속을 환영합니다";
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(msg);
			dos.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//10000번 이상의 포트를 설정한다.(안전하게)
	}
}
