package kr.ac.kopo.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIoMain03 {

	// dog.png => dog3.jpg 복사
	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			long start = System.currentTimeMillis();
			fis = new FileInputStream("IOdata/dog.png");
			fos = new FileOutputStream("IOdata/dog.jpg");

			// 버퍼 사용하기 위해서 객체 연결
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			// 복사 수행
			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}

			System.out.println("복사완료");
			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (double) (end - start) / 1000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			//jdk 1.7버전 이전에 많이 쓰던 방법
			//DB수업에 해준다.
			
			
			/*
			FileClose.close(bis);
			FileClose.close(bos);
			FileClose.close(fis);
			FileClose.close(fos);
			*/
			
			//이게 정석이다. 다 하기 귀찮으니 유틸 클래스 하나 만들자
			/*
			 * if (bis != null) { try { bis.close(); } catch (Exception e) {
			 * e.printStackTrace(); } }
			 * 
			 * if (bos != null) { try { bos.close(); } catch (Exception e) {
			 * e.printStackTrace(); } }
			 * 
			 * if (fis != null) { try { fis.close(); } catch (Exception e) {
			 * e.printStackTrace(); } }
			 * 
			 * if (fos != null) { try { fos.close(); } catch (Exception e) {
			 * e.printStackTrace(); } }
			 */

		}

	}
	

}
