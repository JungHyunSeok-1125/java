package kr.ac.kopo.day08;

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member("홍길동");
		Member m3 = new Member("강길동", 20);
		Member m4 = new Member("박길동", 33, "AB");
		m.info();
		//생성자를 사용하지 않으면 널값에 대한 내용이 들어가게 된다.
		//널값이라는 내용은 사용자(고객)은 이해할 수 없는 값이다.
		//==> null 대신에 알 수 없음으로 초기화(원하는 값으로 초기화)
		System.out.println("=========");
		m2.info();
		System.out.println("=========");
		m3.info();
		System.out.println("=========");
		m4.info();
		
	}
}
