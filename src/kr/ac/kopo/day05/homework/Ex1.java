package kr.ac.kopo.day05.homework;

import java.util.Scanner;

/*

1. 0~99사이의 정수를 5개 입력받아 다음과 같이 출력하는 코드를 작성하시오
	1's 정수 : 36	
	2's 정수 : 1000
	//0-99사이의 정수만 입력하시오
	2's 정수 : 92
	3's 정수 : 20
	4's 정수 : 8
	5's 정수 : -2
	
	< PRINT >
	36 92 20 8 62
	
	< REVERSE >
	26 80 2 29 63

*/
public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];

		System.out.println("1. 0~99사이의 정수를 5개 입력받아 다음과 같이 출력하는 코드를 작성하시오");

		for (int i = 0; i < nums.length; i++) {

			System.out.print((i + 1) + "'s 정수 : ");
			nums[i] = sc.nextInt();
			if (nums[i] < 100 && nums[i] >= 0) {

			} else {
				System.out.println("0 - 99 사이의 정수만 입력하시오");
				i--;
			} // ELSE :: 예외처리
		}
		System.out.println("< PRINT >");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println("\n" + "< REVERSE >");
		for (int i = 4; i >= 0; i--) {
			int a = nums[i] % 10;// LINE :: 일의 자리 수
			if (a != 0) {
				System.out.print(a + ((nums[i] - a) / 10 + " "));
			} else {
				System.out.print((nums[i] - a) / 10 + " ");
			}
			// IF-ELSE :: 십의 자리 숫자가 0인 경우 예외처리
		}
	}

}
