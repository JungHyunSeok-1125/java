package kr.ac.kopo.day02;

import java.util.Scanner;

//ctrl + d 삭제. ctrl + alt +방향키 복사
/*
 * 1 - 3 사이 정수 입력 : 1
 * ONE
 * 1 - 3 사이 정수 입력 : 2
 * TWO
 * 1 - 3 사이 정수 입력 : 3
 * THREE
 * 1 - 3 사이 정수 입력 : 4
 * ERROR
 *  */
public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3 사이의 정수 : ");
		int num = sc.nextInt();
				
		if(num == 1) {
			System.out.println("IF_ONE");
		} else if(num == 2) {
			System.out.println("IF_TWO");
		} else if(num == 3) {
			System.out.println("IF_THREE");
		} else {
			System.out.println("IF_ERROR");
		}
//==================================>		
		switch(num) {
		case 1 :
			System.out.println("SWITCH_ONE");
			break;
		case 2 :
			System.out.println("SWITCH_TWO");
			break;
		case 3 :
			System.out.println("SWITCH_THREE");
			break;
		default :
			System.out.println("SWITCH_ERROR");
			break;
		}
	}

}
