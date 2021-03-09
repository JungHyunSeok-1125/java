package kr.ac.kopo.day02;

public class OperationMain02 {

	public static void main(String[] args) {
		int a =1, b = -1, c = 0;
		
		boolean bool = ++a > 0 && ++b > 0 && ++c >0;
		
		System.out.println("bool : " + bool);
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		
		boolean bool2 = ++a > 0 || b++ > 0 || c++ >0;
		
		System.out.println("bool : " + bool2);
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		
		boolean bool3 = a++ > 0 || b++ > 0 && c++ >0;
		//연산자 우선순위에 따라서 계산. a값만 계산 후 나머지는 무시한다. (나머지 변동 X)
		System.out.println("bool : " + bool3);
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		
		
	}
}
