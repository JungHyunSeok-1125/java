package kr.ac.kopo.day03;

/*
 * HelloWorld
 * HelloWorld
 * HelloWorld
 * HelloWorld
 * HelloWorld
 * HelloWorld
 * */

/*
 *  반복을 위한 기본 요소
 *  1. 반복할 문장
 *  2. 시작값
 *  3. 증가 / 감소
 *  4. 종료 조건
 *  
 * */

//f11 누르면 디버그 기능 활성화
//예외처리 이전에 내용까지는 알아야 된다.
//상속이 있었어? 상속이 무엇이고 무엇이다 말을 할 수 있어야 된다.

public class LoopMain01 {

	public static void main(String[] args) {

		// 연속적으로 반복되는 문장으로 구성되는 경우
		int cnt = 1;

		while (cnt <= 5) {
		
			System.out.println("Hello World by while");
			++cnt;
		} // while 종료
		System.out.println("------------------------------");

		for (int cnt2 = 1; cnt <= 3; ++cnt) {

			System.out.println("Hello World by for");
		}

		System.out.println("------------------------------");

		// for(int cnt3 =0; cnt3 <= 2; ++cnt3) {
		// for(int cnt3 =3; cnt3 >= 3; --cnt3) {
		// for(int cnt3 =3; cnt3 <= 5; ++cnt3) {
		for (int cnt3 = 100; cnt3 < 102; ++cnt3) {
			
			System.out.println("Hello World by for.v2");
		}
		
		System.out.println("------------------------------");

	}
}
