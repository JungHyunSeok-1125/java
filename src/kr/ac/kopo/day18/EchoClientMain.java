package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {


	  public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      
	      try {
	         
	         Socket socket = new Socket("192.168.217.44", 10001);
	         //키보드로 입력받을 객체
	         BufferedReader keyboard 
	            = new BufferedReader(new InputStreamReader(System.in));
	         
	         // 클라이언트가 키보드로 입력받은 데이터를 서버에게 데이터 전달 객체
	         OutputStream os = socket.getOutputStream();
	         OutputStreamWriter osw = new OutputStreamWriter(os);
	         PrintWriter pw = new PrintWriter(osw);
	         
	         // 서버에서 재전송한 데이터 수신 객체
	         InputStream is = socket.getInputStream();
	         InputStreamReader isr = new InputStreamReader(is);
	         BufferedReader br = new BufferedReader(isr);
	         
	         while(true) {
	         
	            System.out.print("메시지 입력(quit입력 시 종료) : ");
	            String msg = keyboard.readLine();
	            
	            if(msg.equals("quit")) {
	               
	               System.out.println("접속 종료");
	               socket.close();
	               break;
	            }
	            
	            pw.write(msg);
	            pw.write('\n');
	            pw.flush();
	            
	            String echMsg = br.readLine();
	            System.out.println("서버에서 전송한 메시지 : " + echMsg);
	         }
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	   }



}
