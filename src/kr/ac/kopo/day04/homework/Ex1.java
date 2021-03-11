package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 1. 3개의 정수를 입력받아 큰 수 에서 작은 수 순으로 출력한다.
 	3개의 정수를 입력하세요 : 12	7	39
 	(따로 받아도 된다.)
 	
 	39 12 7
 */
public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tmp;

		System.out.println("3개의 정수를 입력받아 큰 수 에서 작은 수 순으로 출력한다.");
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();

		if (num1 <= num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}//IF::num1, num2 비교
		if (num1 <= num3) {
			tmp = num1;
			num1 = num3;
			num3 = tmp;
		}//IF::num2, num3 비교
		if (num2 <= num3) {
			tmp = num2;
			num2 = num3;
			num3 = tmp;
		}//IF::num1, num3 비교

		System.out.print(num1 + "  ");
		System.out.print(num2 + "  ");
		System.out.print(num3 + "  ");
	}
}
