package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Calculator {

	Scanner sc = new Scanner(System.in);
	
	int[] num = new int[2];
	int result;
	double result2;

	int[] getNum() {
		for (int i = 0; i < num.length; i++) {
			num[i] = getInt("정수 : ");
		}
		return num;
	}

	/**
	 * 사칙연산 정수 받기
	 * @param str 앞에 "정수 : "
	 * @return 입력받은 정수
	 */
	int getInt(String str) {
		
		System.out.print(str);
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}

	/**
	 * int형 계산
	 * @param num 계산기 객체
	 * @param result 결과
	 * @param str 연산식
	 */
	void calculate(int[] num, int result, String str) {
		
		System.out.println(num[0] +" "+ str + " " + num[1] + " = " + result);
	}
	
	/**
	 * double형 계산
	 * @param num 계산기 객체
	 * @param result 결과
	 * @param str 연산식
	 */
	void calculate(int[] num, double result, String str) {
		
		System.out.println(num[0] +" "+ str + " " + num[1] + " = " + result);
	}
	
	
	/**
	 * 소수체크
	 * @param 객체 배열
	 */
	void prime(int[] num) {
		
		for(int i=0;i<num.length;i++) {		
			boolean bool = checkPrime(num[i]);
			System.out.print(num[i] + " 소수체크 : " + bool);
			System.out.println();
		}
	}

	/**
	 * 객체 확인 후 결과 반환
	 */
	boolean checkPrime(int i) {
		if(i % 2 == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	
}
