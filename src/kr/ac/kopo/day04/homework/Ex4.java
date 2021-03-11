package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 4. 소수의 정의 : 1과 자기자신 외에는 약수가 존재하지 않는 양의 정수
 	정수를 입력하세요 : 23
 	23은 소수입니다.
 	
 	정수를 입력 : 12
 	12는 소수가 아닙니다.
 	
 
 */
public class Ex4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("소수의 정의 : 1과 자기자신 외에는 약수가 존재하지 않는 양의 정수");
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		boolean bool = false;

		for (int i = 2; i < num; i++) {
			// for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				bool = true;
			} // IF :: 나누어서 0 이나오는 경우 bool값 변경해준다.
		}

		System.out.println(bool ? num + "은 소수가 아닙니다." : num + "은 소수입니다");
		// LINE :: bool이 true인 경우에 소수가 아님
		System.out.println("\n" + "======================================");

		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + ": 소수입니다");
		} else {
			System.out.println(num + ": 소수가 아닙니다");
		}
		System.out.println("\n" + "======================================");

		int count2 = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count2++;
				break;
			}
		}
		if (count2 == 2) {
			System.out.println(num + ": 소수입니다");
		} else {
			System.out.println(num + ": 소수가 아닙니다");
		}
		System.out.println("\n" + "======================================");

		int i = 2;
		while (i <= num - 1 && num % i != 0) {
			i++;
		}
		
		//while (i <= num - 1 && num % i++ != 0);
		
		if (i == num) {
			System.out.println(num + " : 소수입니다");
		} else {
			System.out.println(num + ": 소수가 아닙니다");
		}

	}

}
