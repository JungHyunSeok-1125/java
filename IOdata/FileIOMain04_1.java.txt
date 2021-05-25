package kr.ac.kopo.day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIoMain04 {

	public static void write() {

		char c = 'c';
		int i = 97;
		double d = 12.34;

		FileOutputStream fos = null;
		DataOutputStream dos = null; // 입력을 받아서 문자열이든 int형이든 원하는 형식으로 받고 싶을 때 사용한다.

		try {

			fos = new FileOutputStream("IOdata/test.dat");
			dos = new DataOutputStream(fos); // fos 와 연결하여 저장

			// 문자 + 실수 + 정수
			dos.writeChar(c);
			dos.writeInt(i);
			dos.writeDouble(d);

			System.out.println("쓰기 완료...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos);
			FileClose.close(fos);
		}

	}

	public static void read() {

		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("IOdata/test.dat");
			dis = new DataInputStream(fis);

			char c =dis.readChar();
			int i = dis.readInt();
			double d =dis.readDouble();
			
			System.out.println("읽어온 데이터 : " );
			System.out.println("문자 : " + c);
			System.out.println("문자 : " + i);
			System.out.println("문자 : " + d);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis);
			FileClose.close(fis);
		}
		
	}

	public static void main(String[] args) {

		write();
		read();

	}
}
