package kr.ac.kopo.day11.abs02;

public class CastMain02 {

	public static void main(String[] args) {
		
		//Child01 c = new Parent();
		//좌변과 우변의 타입이 다른데 Parent타입의 크기가 더 작다.
		
		
		Parent p = new Child02();
		//1. 묵시적 형변환
		p.info();
		
		Child02 c = (Child02)p;
		//2. 명시적 형변환
		c.info();
		c.sing();
		c.play();
		
		/*
		 언제 쓸 수 있는지?
		 */
		
		
	}
}
