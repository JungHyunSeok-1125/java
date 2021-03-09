package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/* 	
 2. 4개의 정수를 입력받아 가장 큰 수를 출력
  	4개의 정수를 입력하세요 : 12 6 2 54
  	가장 큰 수 : 54

 */
public class ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tmp = 0;//LINE :: 가장 큰 수 저장할 변수

		System.out.println("2. 4개의 정수를 입력받아 가장 큰 수를 출력");
		
		for (int i = 0; i <= 3; i++) {
			System.out.print(i+1 +"번째 정수를 입력하세요 :");
			int num = sc.nextInt();
			if(tmp < num) {
				tmp = num;
			}//LINE :: 입력받은 정수와 비교하여 더 큰 경우 저장
		}

		System.out.print("가장 큰 수 : " + tmp);

	}
}
