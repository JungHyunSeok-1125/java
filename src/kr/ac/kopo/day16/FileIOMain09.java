package kr.ac.kopo.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// FileIOMain08 원본파일명 복사파일명
// FileIOMain05 	FileIoMain04.java	FileIOMain04.java.txt
public class FileIOMain09 {
	
	public static void main(String[] args) {
		
		
		/*
		 * if(args.length != 2) {
		 * System.out.println("======================================================");
		 * System.out.println("\t사용법 : FileIOMain06 원본파일명 복사할 파일명");
		 * System.out.println("======================================================");
		 * System.exit(0); }
		 */
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("iodata/FileIOMain04.java");
			fw = new FileWriter("iodata/FileIOMain04_2.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while (true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			fw.flush();
			System.out.println("파일복사를 완료하였습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(br, bw);
			FileClose.close(fr, fw);
		}
		
	}

}
