package kr.ac.kopo.day13;

import java.util.Scanner;

/*
 	등록할 ID를 입력하세요 : hello1234
 	ID는 최대 8글자만 가능합니다.
 	
 	등록할 ID를 입력하세요 : hello123
 	ID를 등록하였습니다.
 	
 */
public class ExceptionMain06 {

	static void register() throws CheckIDException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 ID를 입력하세요 : ");
		String id  = sc.nextLine();
		
		if(id.length() > 8) {			
			throw new CheckIDException("ID는 최대 8글자만 가능합니다.");
		}
			System.out.println("ID를 등록하였습니다.");
	}
	
	public static void main(String[] args) {
		
		try {
			register();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("등록할 ID를 입력하세요 : "); String id = sc.nextLine();
		 * 
		 * try { if(id.length() > 8) { throw new CheckIDException("ID는 최대 8글자만 가능합니다.");
		 * // throw new Exception("ID는 최대 8글자만 가능합니다."); }
		 * 
		 * System.out.println("ID를 등록하였습니다."); } catch(Exception e) {
		 * e.printStackTrace(); //System.out.println(e.getMessage()); }
		 */
		
		/*
		if(id.length() > 8) {
			System.out.println("ID는 최대 8글자만 가능합니다.");
		} else {			
			System.out.println("ID를 등록하였습니다.");
		}
		 */
	}
}
/*
 static => 공유
 this, super
 다형성 ==> 내용부 다르게 해서 ==> 메소드 오버라이딩
 추상메소드 ==> 오버라이드 강제성 부여, 너만의 기능에 이것을 추가해라 강제성 부여하고 싶다.
 형변환 ==> 대입연산자 기준으로 데이터 타입 다른경우 (좌변과 우변의 인스턴스가 상속관계인 경우)
 인터페이스 ==> 상수와 추상메소드만 가질 수 있다 (기능의 집합)      public static final
 final ==> 변수 메소드 클래스 붙이는 경우에서의 차이(PDF 61)
 예외처리 ==> 프로그램이 실행되는 동안에 발생하는 예기치 않은 에러
 	직접처리, 간접처리
 
 
 */
 