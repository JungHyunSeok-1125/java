package kr.ac.kopo.day02;

public class ConstMain02 {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		ch = 65;//문자열 자료형 선언한 후에 숫자로 설정하면 유니코드에서 찾아서 알아서 출력한다.
		
		ch = '\u0041';
		// ch = '\uAC00';
		// '/u'유니코드의 형태를 찍겠다. 2Byte => 16진수로 4자리 표현한다.
		// 65를 프로그래밍용 계산기 찍어서 확인해 보기
				
		System.out.println("문자 : " + ch);
		// 앞에 문자열 인식하여 의도한 대로 출력이 된다.
		System.out.println('A' + 'B');//아스키 코드로 출력
		System.out.println("" + 'A' + 'B');//문자열 출력(앞에 문자열 둠.)
		
		int code = ch;
		System.out.println(code);
		//자료형 int 형에 문자형 대입하여 출력시킨다.
		System.out.println((int)ch);
		//형변환 (연산자 기준으로 좌변과 우변의 타입이 다른경우 발생한다.)
		//명시적 형변환(강제적 형변환), 묵시적 형변환이 있다.
		
	}
}
