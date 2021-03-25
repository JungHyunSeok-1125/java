package kr.ac.kopo.day14.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 입력받기 위한 클래스 입니다.
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
	
	/**
	 * 1 ~ 입력받은 수까지 랜덤숫자 출력
	 * @return 1 ~ num 사이의 랜덤숫자
	 */
	public int getRandomNum(int num) {
		
		Random r = new Random();
		int randNum = r.nextInt(num) + 1;
		return randNum;
	}
	
	

	
}
