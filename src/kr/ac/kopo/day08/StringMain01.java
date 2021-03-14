package kr.ac.kopo.day08;

public class StringMain01 {

	public static void main(String[] args) {

		String str = new String();
		String str2 = "";
		// 위와 다르다는 것을 인식해야 한다.
		// str2는 비어있는 문자열을 가리키는 것
		char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String str3 = new String(chars);
		String str4 = new String(chars, 1, 3);
		byte[] bytes = { 97, 98, 99, 100, 101 };
		String str5 = new String(bytes);
		String str6 = new String("Hello");
		String str7 = "Hello";
		// 상수 영역이기 때문에 해당 값의 주소는 동일하다. 해제하고 다시 봐도 동일한 해당 값을 가리킨다.

		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		System.out.println("str3 : [" + str3 + "]");
		System.out.println("str4 : [" + str4 + "]");
		System.out.println("str5 : [" + str5 + "]");
		System.out.println("str6 : [" + str6 + "]");
		System.out.println("str7 : [" + str7 + "]");

	}
}
