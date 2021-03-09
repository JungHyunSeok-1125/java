package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		// 1, 2, 3, 4, 5를 가지는 배열 arr 생성
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// arr원소 출력
		System.out.println("< PRINT 1 >");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 : " + arr[i]);
		}

		int[] arr2 = { 1, 2, 3, 4, 5 };

		System.out.println("< PRINT 2 >");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i + "번째 : " + arr2[i]);
		}

		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("< PRINT 3 >");
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(i + "번째 : " + arr3[i]);
		}

		int[] arr4 = new int[] { 1, 2, 3, 4, 5 }; // 선언과 동시에 선언하는 경우 작성

		arr4 = new int[] { 10, 20, 30, 40, 50, 60, 70 }; // 어디에서나 초기화 적용 방식
		// arr4 = { 10, 20, 30, 40, 50, 60, 70 }; //==> 오류 출력
		System.out.println("< PRINT 4 >");
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(i + "번째 : " + arr4[i]);
		}

		/*
		 * 배열의 전체 요소를 출력하는 방식 3가지 
		 * 1. 인덱스를 이용한 출력 
		 * 2. 1.5버전의 for문을 이용한 출력 
		 * 3.java.util.Arrays.toString() 메소드 이용한 출력
		 */

		int[] array = new int[] { 1, 2, 3, 4, 5 }; // 선언과 동시에 선언하는 경우 작성

		array = new int[] { 10, 20, 30, 40, 50, 60, 70 }; // 어디에서나 초기화 적용 방식
		System.out.println("< 방식 1 >");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "번째 : " + array[i]);
		}

		System.out.println("< 방식 2 >");
		for (int num : array) {
			System.out.println(num);
		}
		
		System.out.println("< 방식 3 >");
		System.out.println(Arrays.toString(array));
		

	}
	/*
	 * 이차원 배열 그림그리기 연습 ㄱㄱ
	 * 스택 영역 / 힙 영역 그려서 연습
	 * */

}
