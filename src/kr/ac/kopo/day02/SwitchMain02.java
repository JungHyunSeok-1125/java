package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 좋아하는 계절을 입력 : spring
 * 봄은 3월 ~ 5월 까지 입니다.
 * 
 */
public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 계절을 입력 : ");
		String season = sc.nextLine();
		
		switch(season) { //jdk 7버전 이상부터 가능 (문자열 사용하기)
		case "spring" :
		case "SPRING":
		case "Spring":	
		case "봄":	
			System.out.println("봄은 3월 ~ 5월까지 입니다.");
			break;
		case "summer" :
			System.out.println("봄은 6월 ~ 8월까지 입니다.");
			break;
		case "fall" :
			System.out.println("봄은 9월 ~ 11월까지 입니다.");
			break;
		case "winter" :
			System.out.println("봄은 12월 ~ 2월까지 입니다.");
			break;
		} 
		
		/////////////
		
		if(season.equals("spring") ) {
			System.out.println("봄은 3월 ~ 5월까지 입니다.");
		}else if (season.equals("summer")) {
			System.out.println("여름은 6월 ~ 8월까지 입니다.");			
		} else {
			System.out.println("ERROR");						
		} 
	}

}
