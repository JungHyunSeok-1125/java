package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IOdata/dog.png -> IOdata/dog2.png 복사
 * 
 * 작업순서
 * 1. stream open
 * 2. read/write
 * 3. stream close
 * 
 */
public class FileIoMain02 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 생명주기 생각했을 때 중괄호 바깥부분에서 미리 선어냏 주어야 한다.
		
		try {
			long start = System.currentTimeMillis();
			// 1. stream open
			fis = new FileInputStream("IOdata/dog.png"); 
			fos = new FileOutputStream("IOdata/dog2.png");
			// 그냥 선언하면 0바이트의 빈 파일이 생성된다.
			//dog1 => dog2에 read write해준다.
			
			// 2. read / write
			
			
			
			/*
			 int c = 0;
			 while((c = fis.read())!= -1){
			 	fos.write(c);
			 }
			 */
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}//파일의 끝까지 읽기
			System.out.println("복사완료");
			
			// => 중간에 뻑나면?  close() 가 안된다. (자원해제 코드)

			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (double) (end - start) / 1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3. stream close
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}
}
