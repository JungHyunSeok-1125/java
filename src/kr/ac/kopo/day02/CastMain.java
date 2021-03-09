package kr.ac.kopo.day02;
/*
 * 중위표현식
 * 컴퓨터는 후위표현식*/
public class CastMain {

	public static void main(String[] args) {
		
		
		/*
		 * 형변환은 묵시적 형변환과 명시적 형변환이 있다.*/
		System.out.println(10 + 20);
		//왼쪽이 정수형(int가 디폴트) => int형 값이 출력된다.
		
		System.out.println('A' + 20);
		//문자 + int => 둘 중 하나는 맞춰줘야 한다. (별다른 말이 없으면 큰 쪽의 타입을 따라간다, A를 int로 인식)
		//System.out.println((int)'A' + 20); ==> 이걸 알아서 해준다는 느낌 (묵시적 형변환)
		
		System.out.println(12.3 + 45);
		//double + int ==> double 로 인식한다.
		//System.out.println(12.3 + (double)45); ==>동일하다.
		
		System.out.println((int)12.7 + 45);
		//앞의 실수를 정수로 강제 형변환 (명시적 형변환) ==>생략할 수 없다.
		
		//명시적 VS 묵시적 ==> 같은 문법이지만 생략 가능 여부에 따라서 다르다.
		
		double num = 12;
		//num은 double, 12는 int형
		//double num = (double)12; ==> 동일하다. (묵시적 형변환)
		int num2 = (int)12.34;
		//double형이 더 큰 타입이다.(에러 추출)
		//강제적 형변환 통해서 값을 출력하도록 지시
	}

}
