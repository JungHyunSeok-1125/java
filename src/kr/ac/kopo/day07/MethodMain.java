package kr.ac.kopo.day07;

/*
 객체가 해야 될 행동을 명시하는 것이 메소드

 클래스 안에 메소드가 있다.
 객체가 나온 행동들을 명시한다.
 
 변수나 메소드가 클래스 밖에서 정의되는 경우가 없다.
 메소드는 소문자로 시작하는 것이 국룰이다.
 
 특수한 경우 제외하고는 활용제한자를 거의 건들지 않는다.
 접근제한자는 public 쓰면 중간 이상은 갈 수 있다.
 
 */
public class MethodMain {
	
	
/*	
   반환형 메소드명 (매개변수)(){
			System.out.println("**********");
	}
*/
	static void printStar(){
		System.out.println("**********");
	}

	public static void main(String[] args) {
		
		printStar();	
		System.out.println("Hello");
		printStar();	
		System.out.println("Hi");
		printStar();	
		System.out.println("GoodBye");
		printStar();	
	
	}
	
}
