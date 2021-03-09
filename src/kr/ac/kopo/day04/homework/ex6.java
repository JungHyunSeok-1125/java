package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 	----------배열 문제----------
 6. 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
 	
 	1's 정수 : 12
 	2's 정수 : 3
 	3's 정수 : 45
 	4's 정수 : 7
 	5's 정수 : 23
 	6's 정수 : 56
 	7's 정수 : 10
 	8's 정수 : 8
 	9's 정수 : 3
 	10's 정수 : 55
 	
 	<짝수>
 	12	56	10	8
 	짝수의 총합:	XXX
 	<홀수>
 	3 	45	7	23	3	55
 	홀수의 총합:	XXX
 
 */
public class ex6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "'s 정수 : ");
			num[i] = sc.nextInt();
		} // 숫자 10개 입력받기

		int sum1 = 0, sum2 = 0; //LINE :: 더해진 수 저장할 변수
		
		System.out.println("<짝수>");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + "  ");
				sum1 += num[i];
			}
		}//FOR :: 짝수인 부분 출력 및 더하기
		System.out.println("\n짝수의 총합 : "+sum1);
		
		System.out.println("<홀수>");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.print(num[i] + "  ");
				sum2 += num[i];
			}
		}//FOR :: 홀수인 부분 출력 및 더하기
		System.out.println("\n홀수의 총합 :"+sum2);
		

	}
}
