package kr.ac.kopo.day12;

import java.util.Random;

/*
 final 메소드는 오버라이드(재정의) 할 수 없다
 final 클래스는 부모 클래스가 될 수 없다
 */

/*final */class Super { // extends 오류

	private /* final */ int MAX = 100;// 변수값 수정 불가 (오류)

	public /* final */ void info() { // 오버라이드 금지
		System.out.println("Super클래스에서 정의된 메소드");
		MAX = 50;
	}
}

class Sub extends Super {

	@Override
	public void info() {
		System.out.println("Sub클래스에서 정의된 메소드...");
	}
}

class MyRandom extends Random {

	/**
	 * bound가 10일때 1 ~ 10 사이의 난수 추출
	 * @param bound 추출 정수 범위
	 * @return 1~bound 사이의 난수
	 */
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}
	
}

//class MyString extends String {}
//String 클래스가 final클래스 이므로 변경할 수 없다.


public class FinalMain {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100 사이의 난수를 발생시켜 출력하는 코드를 작성
		 */
		Random r = new MyRandom();
		int random = r.nextInt(100);
		System.out.println("추출된 정수 : " + random);
	}
}
