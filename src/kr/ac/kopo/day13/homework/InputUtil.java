package kr.ac.kopo.day13.homework;

import java.util.Scanner;

/**
 * 문자열 입려받기 위한 클래스 입니다.
 * 매 과제에 활용할 클래스 입니다.
 * @author JungHyunSeok
 */
public class InputUtil {

	Scanner sc = new Scanner(System.in);

	/**
	 * 숫자 입력받기
	 * @param str 질문
	 * @return 입력받은 숫자
	 */
	public int getInt(String str) {
		System.out.print(str);
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
	
	/**
	 * 문자 입력 받기
	 * @param str 질문
 	 * @return 입력받은 문자
	 */
	public char getChar(String str) {
		System.out.print(str);
		char input = sc.nextLine().charAt(0);
		sc.nextLine();
		return input;
	}
	
	/**
	 * 문자열 입력받기
	 * @param str 질문
	 * @return 입력받은 문자열
	 */
	public String getString(String str) {
		System.out.print(str);
		String input = sc.nextLine();
		sc.nextLine();
		return input;
	}
	
	/**
	 * double 입력받기
	 * @param str 질문
	 * @return
	 */
	public Double getDouble(String str) {
		System.out.print(str);
		Double input = sc.nextDouble();
		sc.nextLine();
		return input;
	}
	
	
	
	

	
}
