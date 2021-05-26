package kr.ac.kopo.day17.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 
 1. 탐색기 구현
----------------------------------------------------------
   iodata 폴더 정보
----------------------------------------------------------
이름      종류   크기   마지막수정날짜
새폴더      폴더
새새폴더      폴더
a.txt      파일   3bytes   2021-05-25 11:25:12
b.txt      파일   25bytes   
----------------------------------------------------------
[M] 새폴더   [R]이름변경   [D]삭제   [.]상위폴더이동   [move]하위폴더 이동 

: move 새새폴더
----------------------------------------------------------
   iodata/새새폴더 폴더 정보
----------------------------------------------------------
이름      종류   크기   마지막수정날짜
----------------------------------------------------------




 */
public class Hw1 {

	public static void main(String[] args) {

		File dirObj = new File("IOdata");
		
		File[] fList = dirObj.listFiles();
		for(int i=0;i<fList.length;i++) {
			
		}
		
		
		System.out.println("탐색기 구현");
		System.out.println("-----------------------------------------------------------");
		System.out.println("IOdata폴더 정보");
		System.out.println("-----------------------------------------------------------");
		long size = dirObj.length();
		System.out.println("파일크기 : " + size + "bytes(s)");
		
		System.out.println("-----------------------------------------------------------");
		System.out.println(dirObj.isDirectory() ? "디렉토리" :(dirObj.isFile() ? "파일" : "모르겠습니다"));
	//	System.out.println(dirObj.isFile()? "파일" : "디렉토리");
		System.out.println("-----------------------------------------------------------");
		long time = dirObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("마지막 수정 날짜 : " + sdf.format(new Date(time)));
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
	}

}
