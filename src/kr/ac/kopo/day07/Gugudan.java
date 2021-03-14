package kr.ac.kopo.day07;

import java.util.Scanner;

/*
 * 구구단 관련 클래스 만들기
 */
/**
 * 구구단과 관련된 여러가지 기능을 가지는 기능 클래스
 * 
 * @author JungHyunSeok
 */
public class Gugudan {

	Scanner sc = new Scanner(System.in);
	
	void print(int dan) {

		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	}

	/*
	 * 메소드 오버로딩 ==> 위의 print와 매개변수의 갯수가 다르므로 오버로딩이 성립할 수 있다.
	 */
	void print() {

		// this.print(2); //이거지만 생략할 수 있다.
		/*
		 * for (int i = 1; i <= 9; i++) { print(i); }
		 */
		print(2, 9);
		// print (int)와 동일한 코드

		/*
		 * for (int dan = 2; dan <= 9; dan++) { System.out.println("*** " + dan +
		 * "단 ***"); for (int i = 1; i <= 9; i++) { System.out.println(dan + " X " + i +
		 * " = " + (dan * i)); } }
		 */
	}

	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * 
	 * @param sDan 시작단
	 * @param eDan 종료단
	 */
	void print(int sDan, int eDan) {

		for (int i = sDan; i <= eDan; i++) {
			print(i);
		}

	}

	int getDan() {

		int dan = sc.nextInt();
		sc.nextLine();

		return dan;
	}

	int getDan(String msg) {
		
		System.out.print(msg);
		int dan = getDan();
		
		return dan;
	}

}
