package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 2개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성");
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (int)(num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (int)(num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + num1*num2);
		
		if(num2!=0) {			
			System.out.printf("%d / %d = %.2f (소수 둘째자리까지 출력)\n", num1, num2, (double)num1/num2);
		}else {
			System.out.println("두 번째 정수는 0이 될 수 없습니다.");
		}
		
		if(num2!=0) {			
			System.out.println(num1 + " % " + num2 + " = " + num1%num2);
		}else {
			System.out.println("두 번째 정수는 0이 될 수 없습니다.");
		}
		
	}

}
