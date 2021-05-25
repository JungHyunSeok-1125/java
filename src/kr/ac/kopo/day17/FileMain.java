package kr.ac.kopo.day17;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File fileObj = new File("IOdata/a.txt");
		
		String name = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		String abPath = fileObj.getAbsolutePath();
		
		System.out.println("파일명 : " + name);
		System.out.println("부모이름 : " + parent);
		System.out.println("경로 : " + path);
		System.out.println("절대경로 : " + abPath);
		
	}

}
