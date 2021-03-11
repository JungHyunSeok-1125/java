package kr.ac.kopo.day04.homework;

import java.util.Random;
import java.util.Scanner;

/* 	
 2. 4개의 정수를 입력받아 가장 큰 수를 출력
  	4개의 정수를 입력하세요 : 12 6 2 54
  	가장 큰 수 : 54

 */
public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tmp = 0;// LINE :: 가장 큰 수 저장할 변수

		System.out.println("2. 4개의 정수를 입력받아 가장 큰 수를 출력");

		for (int i = 0; i <= 3; i++) {
			System.out.print(i + 1 + "번째 정수를 입력하세요 :");
			int num = sc.nextInt();
			if (i == 0 || tmp < num) {
				tmp = num;
			} // LINE :: 입력받은 정수와 비교하여 더 큰 경우 저장
		}

		System.out.println("가장 큰 수 : " + tmp);

		System.out.println("--------------------------");

		Random r = new Random();

		int num1 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100
		int num2 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100
		int num3 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100
		int num4 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100
		System.out.print(num1 + ", " + num2 + ", " + num3 + ", " + num4);
		System.out.println();

		int max1 = num1 > num2 ? num1 : num2;
		int max2 = num3;

		if (num4 > num3) {
			max2 = num4;
		}
		System.out.println("가장 큰 수 : " + (max1 > max2 ? max1 : max2));

		System.out.println("--------------------------");

		int num5 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100
		int num6 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100
		int num7 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100
		int num8 = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100

		System.out.print(num5 + ", " + num6 + ", " + num7 + ", " + num8);
		System.out.println();

		int max = num5 > num6 ? num5 : num6;
		if (max < num7) {
			max = num7;
		}
		if (max < num8) {
			max = num8;
		}
		System.out.println("가장 큰 수 : " + max);
	}
}
