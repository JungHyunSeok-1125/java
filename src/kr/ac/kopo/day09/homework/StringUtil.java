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
	public StringBuilder reverseString(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		return sb;

		/*int length = str.length
		 * char[] chars = new char[length]
		 * set.getChars(0, length, chars,0);
		 * 
		 *  for(int i=0, j=length -1; i<length/2; i++, j--) {
		 *  char tmp = chars[i];
		 *  chars[i] = chars [j];
		 *  chars[j] = tmp;
		 *  
		 *  }
		 *  
		 *  return new String(chars);*/
	}

	/**
	 * 문자열이 소문자이면 대문자로 변경
	 * 
	 * @param str
	 * @return
	 */
	public StringBuilder toUpperString(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (this.isLowerChar(str.charAt(i))) {
				sb.append(this.makeUpper(str.charAt(i)));
			} else {
				sb.append(str.charAt(i));
			}
		}

		return sb;

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
	public StringBuilder toLowerString(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (this.isUpperChar(str.charAt(i))) {
				sb.append(this.makeLower(str.charAt(i)));
			} else {
				sb.append(str.charAt(i));
			}
		}

		return sb;
		//return sb.toString();

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

	/**
	 * 문자열 비교 하여 해당 갯수를 리턴
	 * 
	 * @param strData
	 * @param ch
	 * @return char갯수
	 */
	public static int checkChar(String strData, char ch) {

		int cnt = 0;

		for (int i = 0; i < strData.length(); i++) {
			if (strData.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;

	}

	/**
	 * 특정 문자 제거
	 * 
	 * @param oriStr
	 * @param delChar
	 * @return 제거된 문자열 리턴
	 */
	public static String removeChar(String oriStr, char delChar) {

		char[] removeChar = new char[oriStr.length() - checkChar(oriStr, delChar)];

		for (int i = 0, j = 0; i < oriStr.length(); i++) {
			if (oriStr.charAt(i) != delChar) {
				removeChar[j] = oriStr.charAt(i);
				j++;
			}
		}

		return new String(removeChar);

	}

}
