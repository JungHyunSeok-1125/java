package kr.ac.kopo.day17;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File dirObj = new File("IOdata");
		System.out.println(dirObj.exists() ? "유효한 드렉토리 입니다." : "유효하지 않는 디렉토리 입니다.");
		System.out.println(dirObj.isDirectory() ? "디렉토리 입니다." :"디렉토리가 아닙니다.");
		
		String[] list = dirObj.list();
		System.out.println("----------------------------------------------------");
		System.out.println("\t" + dirObj.getName() + " 정보");
		System.out.println("----------------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("----------------------------------------------------");
		
		
		File newDirObj = new File("IOdata/새폴더/고니");
		
		if(!newDirObj.exists()) {
			boolean bool = newDirObj.mkdir();
			System.out.println(bool?"생성 성공":"생성 실패");
		}
		
		newDirObj = new File("IOdata/새새폴더/오리");
		if(!newDirObj.exists()) {
			boolean bool = newDirObj.mkdirs();
			System.out.println(bool?"생성 성공":"생성 실패");
		}
		
		boolean bool = newDirObj.delete();
		System.out.println(bool?"삭제 성공":"삭제 실패");
		
		
		/*
		File fileObj = new File("IOdata/a.txt");
//		File fileObj = new File("C:\\Users\\HP\\git\\javaStudy\\java\\IOdata\\a.txt");
		String name = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		String abPath = fileObj.getAbsolutePath();
		
		System.out.println("파일명 : " + name);
		System.out.println("부모이름 : " + parent);
		System.out.println("경로 : " + path);
		System.out.println("절대경로 : " + abPath);
		
		boolean bool = fileObj.isFile();
		System.out.println(bool? "파일입니다" : "파일이 아닙니다");
		
		bool = fileObj.isDirectory();
		System.out.println(bool? "디렉토리 입니다" : "디렉토리가 아닙니다");
		
		bool = fileObj.exists();
		System.out.println(bool ? "존재합니다": "존재하지 않습니다");
		
		long size = fileObj.length();
		System.out.println("파일크기 : " + size + "bytes(s)");
		
		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("마지막 수정 날짜 : " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(bool? "읽기 가능" : "읽기 불가능");
		
		bool = fileObj.canWrite();
		System.out.println(bool? "쓰기 가능" : "쓰기 불가능");
				 
		 */
	}

}
