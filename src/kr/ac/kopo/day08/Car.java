package kr.ac.kopo.day08;

/*
 생성자의 이름
 1. 클래스명과 동일
 2. 반환형이 존재하지 않는다.
 3. 디폴트 생성자를 지원
 4. 생성자 오버로딩을 지원한다.
 5. 객체의 초기화 담당
 */
public class Car {

	Car() {
		System.out.println("Car() 생성자 호출");
	}//JVM이 자동으로 만들어 주는 것 (다른 생성자가 없는 경우)

	Car(String s) {
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(int i, String s) {
		System.out.println("Car(int, String) 생성자 호출");
	}
	
	void Car() {
		System.out.println("일반 메소드 Car() 호출..");
	}
	//생성자는 반환형이 존재하지 않는다.
	//일반 메소드로 인식을 한다. (생성자가 존재하기 때문에)
	
}
