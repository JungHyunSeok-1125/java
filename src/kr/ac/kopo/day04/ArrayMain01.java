package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {

		int[] arr;

		arr = new int[5]; // 배열명[정수]
							// arr[0] ~ arr[4]
		System.out.println("arr : " + arr);
		// 결과값 : arr : [I@182decdb ==> 주소값
		System.out.println("arr : " + arr + ", 원소개수 : " + arr.length);// 정수값 초기화가 0으로 된다.

		System.out.println("첫번째 정수 : " + arr[0]);// 정수값 초기화가 0으로 된다.
		System.out.println("두번째 정수 : " + arr[1]);// 정수값 초기화가 0으로 된다.
		System.out.println("세번째 정수 : " + arr[2]);// 정수값 초기화가 0으로 된다.
		System.out.println("네번째 정수 : " + arr[3]);// 정수값 초기화가 0으로 된다.
		System.out.println("다섯번째 정수 : " + arr[4]);// 정수값 초기화가 0으로 된다.
		// 이걸 아래와 같이 반복문 통해서 인덱스에 접근
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 정수 : " + arr[i]);
		}
		
		arr = new int[3];
		System.out.println("arr : " + arr + ", 원소개수 : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 정수 : " + arr[i]);
		}
	}

}
