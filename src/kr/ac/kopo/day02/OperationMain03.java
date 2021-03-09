package kr.ac.kopo.day02;

import java.util.Scanner;
//자동 import : ctrl + shift + o

/*
 * 정수를 입력하세요 : 12
 * 12의 짝수유무 : true
 * 
 * 정수를 입력하세요 : 5
 * 5의 짝수유무 : false
 * 
 * 단, 0이나 음수인 경우는 false 출력
 * */
public class OperationMain03 {

	public static void main(String[] args) {
		   
		Scanner sc = new Scanner(System.in);
		//scanner 객체 가져온다. 
		//키보드 표준 입력 장치 그냥 외워서 쓰세요

		//"정수를 입력하세요 : "문장을 출력
		System.out.print("정수를 입력하세요 : ");
		
		//키보드로 정수를 입력
		int num = sc.nextInt();
		//키보드로 정수 입력받는 메소드 (받은 정수를 num에 저장한다.)
		
		//결과를 출력
		boolean result = (num > 0 && num % 2 == 0) ;
		System.out.println(num + "의 짝수 유무 : " + result);
		
	}

}
