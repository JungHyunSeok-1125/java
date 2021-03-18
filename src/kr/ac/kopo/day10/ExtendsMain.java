package kr.ac.kopo.day10;

/*
extends 하고 상속받은 멤버 변수에 접근할 때,
this 사용 가능하다.

new Manager();
// extends Employee 경우
상속받고 인스턴스 객체 만들 때 부모공간 자식공간이 같이 만들어 진다.
상속받은 부분까지 전부 Manager 영역이라고 인식하기 때문에
this라는 키워드로 모두 접근 가능하다.

new Manager();
Employee()영역이 만들어 지고 Manager() 공간이 만들어 진다.
이 전체를 Manager()로 인식을 하게 된다.
this.no ==> 2중에 가장 가까운 no를 인식.

내 클래스에 영역에 선언한 멤버 변수에 접근하게 된다.
부모 클래스의 no에 접근하고 싶을 때, super.no (상속 관계에서의 부모 클래스)
==> super 키워드

Manager(){
	super();//생략되어 있다.
	} // 자동으로 만들어 지는 메소드
부모의 영역이 먼저 만들어 지고, 자식의 공간이 만들어 진다.

모든 생성자에는 super을 가지고 있다. (숨김되어 있다.)
==> 오버 로딩된 this 키워드 사용가능하다.
			
 */

class One{
	int text;
	
	One(){
		System.out.println("One 생성자 호출...");
	}
}

class Two extends One{
	Two(){
		super();//생략되어 있다.
		System.out.println("Two 생성자 호출...");
	}
}
//Two 클래스가 One 클래스 상속받았다.

class Three extends Two{
	Three(){
		System.out.println("Three 생성자 호출...");
		
	}
	public void test(){
		System.out.println("THIS IS TEST");
	}
}

public class ExtendsMain {

	public static void main(String[] args) {
		
		Three a = new Three();
		//Two 객체만 만들었는데 One까지 출력이 되었음을 확인할 수 있다.
	}
}
