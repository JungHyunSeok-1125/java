package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean bool;
		System.out.println("4. 두개의 정수를 입력받아 첫번째 정수가 두번째 정수의 배수인지를 판단하는 프로그램을 작성하시오 (조건 연산자, if문을 이용하여 작성)");
		System.out.print("첫 번째 정수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력 : ");
		int num2 = sc.nextInt();
		
		String boolString;
		if(num1 == 0 || num2 == 0 || num1%num2 != 0 ) {			
			bool = false;
			boolString = "거짓";
		} else {
			bool = true;
			boolString = "참";			
		} 
		System.out.println(num1+"(이)가 "+num2+"의 배수인지 여부 판단 결과 :" + bool);
		System.out.println(num1+"(이)가 "+num2+"의 배수인지 여부 판단 결과 :" + boolString);
		/********************************************************************************************************/
		System.out.println("comment : "+num1+"(이)가 "+num2+"의 배수인지 여부 판단 결과 :" + (num2 > 0 && num1 % num2 ==0));	
		System.out.println("comment : "+num1+"(이)가 "+num2+"의 배수인지 여부 판단 결과 :" + (num2 > 0 && num1 % num2 ==0 ? "참" : "거짓"));	
		/********************************************************************************************************/
		//삼항 연산자
		if(num1 != 0 && num2 != 0 ) {						
			boolString = (num1%num2 == 0) ? "참":"거짓";
			System.out.println(num1+"(이)가 "+num2+"의 배수인지 여부 판단 결과 :" + boolString);	
		} else {	
			boolString = "거짓";
			System.out.println(num1+"(이)가 "+num2+"의 배수인지 여부 판단 결과 :" + boolString);				
			
		}
			
		
		
	}
	
}