package kr.ac.kopo.day01;

/*
 * 상수 : 5가지
 * 1. 정수형 상수 : 10, 20, -123
 * 2. 실수형 상수 : 1.2, 3.14
 * 3. 문자형 상수 : '3', 'a', 'm', '!', '가'
 * 4. 문자열 상수 : "abc", "A"
 * 5. 논리형 상수 : true, false
 * 
 * 
 */
public class ConstMain {

	public static void main(String[] args) {

		final boolean BOOL = true;
		//상수를 고정해 버린다. (bool이란 값은  true만 가질 수 있다.)  => bool = false; 하려고 하면 오류 뜬다.
		//변수처럼 보이니까 전부다 대문자로 수정한다. (명명규칙)
		System.out.println(BOOL);
		
		System.out.println('A' +'B');//131출력 (유니코드)
		System.out.println('A' +10);//75출력 (유니코드)
		
		System.out.printf("%c%c\n",'A','B'); // 정상출력 (원하는대로)
		
		
	}

}
