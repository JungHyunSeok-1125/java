package kr.ac.kopo.day09.homework;

import java.util.Scanner;

public class StringUtil {

	Scanner sc = new Scanner(System.in);

	/**
	 * 문자 하나 입력받는 메소드
	 * 
	 * @param str 질문
	 * @return 입력받은 메소드
	 */
	public char getChar(String str) {

		System.out.print(str);

		char oneChar = sc.nextLine().charAt(0);

		return oneChar;
	}

	/**
	 * 숫자 하나 입력받는 메소드
	 * 
	 * @param str
	 * @return 입력받은 숫자
	 */
	public int getInt(String str) {

		System.out.print(str);

		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	/**
	 * 문자열 입력받는 메소드
	 * 
	 * @param str 질문
	 * @return 문자열 반환
	 */
	public String getString(String str) {

		System.out.print(str);

		String text = sc.nextLine();

		return text;
	}

	/**
	 * 입력받은 문자가 대문자인지 확인하는 메소드
	 * 
	 * @param c 확인할 문자
	 * @return 대문자이면 true 아니면 false
	 */
	public boolean isUpperChar(char c) {

		int letter = c;

		if (letter <= 90 && letter >= 65) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 입력받은 문자가 소문자인지 확인하는 메소드
	 * 
	 * @param c 확인할 문자
	 * @return 소문자이면 true 아니면 false
	 */
	public boolean isLowerChar(char c) {

		int letter = c;

		if (letter <= 122 && letter >= 97) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 숫자 비교하는 메소드
	 * 
	 * @param num1
	 * @param num2
	 * @return 더 큰 숫자를 반환
	 */
	public int max(int num1, int num2) {

		if (num1 - num2 > 0) {
			return num1;
		} else {
			return num2;
		}
	}

	/**
	 * 숫자 비교 메소드
	 * 
	 * @param num1
	 * @param num2
	 * @return 더 작은 숫자 반환
	 */
	public int min(int num1, int num2) {

		if (num1 - num2 < 0) {
			return num1;
		} else {
			return num2;
		}
	}

	/**
	 * 문자열 뒤집는 메소드
	 * 
	 * @param str
	 * @return 뒤집어진 문자열
	 */
	public String reverseString(String str) {

		char[] reverse = new char[str.length()];

		int loc = str.length() - 1;

		for (int i = 0; i < str.length(); i++) {
			reverse[i] = str.charAt(loc);
			loc--;
		}

		return new String(reverse);
	}

	/**
	 * 문자열이 소문자이면 대문자로 변경
	 * 
	 * @param str
	 * @return
	 */
	public String toUpperString(String str) {

		char[] upper = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (this.isLowerChar(str.charAt(i))) {
				upper[i] = this.makeUpper(str.charAt(i));
			} else {
				upper[i] = str.charAt(i);
			}
		}

		return new String(upper);
	}

	/**
	 * 대문자로 변경
	 * 
	 * @param c 소문자
	 * @return 변경된 대문자
	 */
	private char makeUpper(char c) {
		int a = c - 32;
		return (char) a;
	}

	/**
	 * 문자열이 대문자이면 소문자로 변경
	 * 
	 * @param c
	 * @return 변경된 문자열
	 */
	public String toLowerString(String str) {

		char[] lower = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (this.isUpperChar(str.charAt(i))) {
				lower[i] = this.makeLower(str.charAt(i));
			} else {
				lower[i] = str.charAt(i);
			}
		}

		return new String(lower);
	}

	/**
	 * 소문자로 문자열 변경
	 * 
	 * @param c
	 * @return 변경된 문자
	 */
	private char makeLower(char c) {
		int a = c + 32;
		return (char) a;
	}

	public static int checkChar(String strData, char ch){
		
		int cnt = 0;
		
		for(int i=0;i<=strData.length();i++) {			
			if(strData.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
		
	}

}
