package kr.ac.kopo.day06;

// 실행클래스 
public class CarMain {
	
	public static void main(String[] args) {

		Car c  = new Car();
		Car c2 = new Car();
		//new Car(); 힙영역에 자동차 한대가 만들어 진다.
		//공간 만들었을 뿐이지, 주소값에 접근하기 위한 변수가 하나 필요
		//Car c앞에 작성한다.
		
		c.name = "소나타";
		c.price = 3200;
		c.company = "현대";
		
		c2.name = "K5";
		c2.price = 3000;
		c2.company = "기아";
		
		System.out.println("주소 : " + c);
		System.out.println("이름 : " + c.name);
		System.out.println("가격 : " + c.price);
		System.out.println("제조사 : " + c.company);
		
		System.out.println();
		
		System.out.println("주소 : " + c2);
		System.out.println("이름  : " + c2.name);
		System.out.println("가격 : " + c2.price);
		System.out.println("제조사 : " + c2.company);
	}
}
