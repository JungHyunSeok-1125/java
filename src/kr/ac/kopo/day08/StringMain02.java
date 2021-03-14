package kr.ac.kopo.day08;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {

		char[] chars = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		String s = new String(chars);
		// 이걸 반대로
		String str = "Hello World";
		char[] chars2 = new char[str.length()];
		
		str.getChars(0, str.length(), chars2, 0);
//		str.getChars(3, 9, chars2, 0);
		/*
		for (int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}			
		*/

		System.out.println("chars  : " + Arrays.toString(chars2));

		System.out.println("[" + str + "]의 길이 : " + str.length());
		System.out.println("0번째에 위차한 문자 : " + str.charAt(0));
		System.out.println("0번째에 위차한 문자 : " + str.charAt(7));// Hello W'o'

		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		/*
		 * String input = sc.nextLine(); char inputChar = input.charAt(0);
		 */
		char inputChar = sc.nextLine().charAt(0);// 하나의 문자열을 받을 때
		System.out.println(inputChar);
	}
}
