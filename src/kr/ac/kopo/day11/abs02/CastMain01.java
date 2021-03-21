package kr.ac.kopo.day11.abs02;

public class CastMain01 {

	/*
	 * public static void print(Child01 c) { c.info(); }
	 * 
	 * public static void print(Child02 c) { c.info(); }
	 * 
	 */
	public static void print(Parent c) {
		
		c.info();

		System.out.println("p instanceof Child01 : " + (c instanceof Child01));
		System.out.println("p instanceof Child02 : " + (c instanceof Child02));
		System.out.println("p instanceof Parent : " + (c instanceof Parent));
		// 상속 관계이거나 같은 클래스 인경우에 instanceof사용 가능
		
		if(c instanceof Child01) {
			Child01 c2 = (Child01)c;
			c2.sleep();
			c2.study();
		}
		
		
	}
	// 매개변수 자체가 묵시적 형변환이 이루어 지고 있다.
	// 오버로딩 하는 행위를 줄일 수 있다.

	public static void main(String[] args) {

		Child01 c01 = new Child01();
		System.out.println(c01.name + ", " + c01.age);
		c01.info();
		System.out.println();

		Parent p = new Parent();
		System.out.println(p.name + ", " + p.age);
		p.info();
		System.out.println("----------------------------------");
		System.out.println();

		Parent p2 = new Child01();// 묵시적 형변환 발생
		System.out.println(p2.name + ", " + p2.age);
		p2.info();

		System.out.println("----------------------------------");
		System.out.println();
		/*
		 * 묵시적 형변환을 언제 쓸것인가?
		 */

		Child01 c02 = new Child01();
		print(c02);

		Child02 c03 = new Child02();
		print(c03);

		Parent p3 = new Parent();
		print(p3);

	}
}
