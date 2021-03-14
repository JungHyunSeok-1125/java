package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {

		String str = "Hello World";

		System.out.println("str : " + str);
		String subStr = str.substring(1, 5);
		System.out.println("str : " + str);
		System.out.println("subStr() : " + subStr);

		subStr = str.substring(6);// String subStr = str.substring(6, str.length);
		System.out.println("subStr() : " + subStr);

		String str1 = "hello";
		String str2 = "!!!!";

		// str = str1 + str2;
		// System.out.println(str);
		str1 = str1.concat(str2);
		System.out.println(str1);

		String str3 = "hello world";

		System.out.println("replace 전 : " + str3);
		// str3 = str3.replace('l', 'r');
		str3 = str3.replace("ll", "rrr");
		System.out.println("replace 후 : " + str3);

		String str4 = "               hello world               ";
		System.out.println("trim() 전 [" + str4 + "] 길이 : " + str4.length());
		str4 = str4.trim();
		System.out.println("trim() 후 [" + str4 + "] 길이 : " + str4.length());

		String str5 = "Hello World";
		System.out.println("str5 [" + str5 + "] ");
		System.out.println("toLowerCase() [" + str5.toLowerCase() + "] ");
		System.out.println("toLowerCase() [" + str5.toUpperCase() + "] ");

		String str6 = "홍길동전@@허균@@조선시대";
		System.out.println("str6 [" + str6 + "] ");
		String[] strArr = str6.split("@@");
		System.out.println(Arrays.toString(strArr));

		String ip = "192.168.10.203";
		System.out.println("ip [" + ip + "] ");
		String[] ipArr = ip.split("\\.");
		System.out.println(Arrays.toString(ipArr));

		int num = 123;
		// String strNum = num + "";//꼼수
		String strNum = String.valueOf(num);
		System.out.println(strNum + 10);
		System.out.println(String.valueOf(true) + false);//true라는 문자열을 의미한다.
	}
}
