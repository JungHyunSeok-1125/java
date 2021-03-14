package kr.ac.kopo.day09;

public class StringMain03 {

	public static void main(String[] args) {

		String str = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");

		if (str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		// String의 주소비교, new String("hello");는 따로 인스턴스 생성하는 것이므로 다르다.
		if (str3 == str4) {
			System.out.println("str3 == str4");
		} else {
			System.out.println("str3 != str4");
		}

		// 문자열 비교
		boolean bool = str.equals(str2);
		if (bool) {

			System.out.println("equals() : str == str2");
		} else {
			System.out.println("equals() : str != str2");
		}

		String str5 = "HELLO";
		String str6 = "hello";
		boolean bool2 = str5.equalsIgnoreCase(str6);
		if (bool2) {
			System.out.println("equals() : str == str2");
		} else {
			System.out.println("equals() : str != str2");
		}

		String str7 = "hello!!";
		String str8 = "hello World";

		String sub = "hello";

		bool = str7.startsWith(sub);
		if (bool) {
			System.out.println("[" + str7 + "]은 [" + sub + "]문자열로 시작합니다");
		} else {
			System.out.println("[" + str7 + "]은 [" + sub + "]문자열로 시작하지 않습니다.");
		}

		String str9 = "hello.txt";
		bool = str9.endsWith(".txt");

		if (bool) {
			System.out.println("[" + str7 + "]은 텍스트 파일입니다.");
		} else {
			System.out.println("[" + str7 + "]은 텍스트 파일이 아닙니다.");
		}

		String str10 = "boat";
		String str11 = "board";

		int compare = str.compareTo(str2);
		if (compare == 0) {
			System.out.println(str + " == " + str2);
		} else if (compare < 0) {
			System.out.println(str + " < " + str2);
		} else {
			System.out.println(str + " > " + str2);
		}

		String[] names = { "강길동", "홍길동", "홍길순", "김길동", "윤길동", "박철홍", "홍길동" };

		System.out.println();
		System.out.println("<이름이 홍길동인 사람 검색>");

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("홍길동")) {
				System.out.println(names[i]);
			}
		}
		System.out.println();
		System.out.println("<홍씨성을 가진 사람 검색>");

		for (String name : names) {
			if (name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		System.out.println();
		System.out.println("<이름이 길동인 사람 검색하기>");
		for (String name : names) {
			if (name.endsWith("길동")) {
				System.out.println(name);
			}
		}

		System.out.println();
		System.out.println("<홍이 포함된 사람 검색>");
		for (String name : names) {
			if (name.contains("홍")) {
				System.out.println(name);
			}
		}

		System.out.println();

		str = "Hello World";
		int searchIndex = str.indexOf("o");
		System.out.println("\"o\" indexIf() 위치 : " + searchIndex);

		searchIndex = str.indexOf("o", 5);
		System.out.println("\"o\" indexIf(5) 위치 : " + searchIndex);

		searchIndex = str.lastIndexOf("o");
		System.out.println("\"o\" lastIndexOf() 위치 : " + searchIndex);

		str = "hello world";
		System.out.println("<" + str + "에서 \"ㅣ\" 위치");

		System.out.println();
		
		int searchIndex2 = str.indexOf('l');
		while (searchIndex2 != -1) {
			System.out.println("검색된 위치 : " + searchIndex2);
			searchIndex2 = str.indexOf('l', searchIndex2 + 1);
		}
		// ========================================================
		/*
		searchIndex2 = -1;
		while ((searchIndex2 = str.indexOf('l')) != -1) {
			System.out.println("검색된 위치 : " + searchIndex2);
		}
		*/
		// ========================================================
		/*
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * searchIndex2 = str.indexOf("l", searchIndex2 + 1); if (searchIndex2 < 0)
		 * break; System.out.println("l indexIf() 위치 : " + searchIndex2); }
		 */

	}
}
