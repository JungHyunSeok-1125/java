package kr.ac.kopo.day05.homework;

import java.util.Random;
import java.util.Scanner;

/*

   	
 7. 사용자가 생각하는 숫자를 컴퓨터가 맞추는 프로그램을 작성하세요.
 	1 - 100  
 	사용자가 생각하는 숫자가 [88]입니까? (맞으면 0, 작은수면 1, 큰수면 2) ==> 1
 	
  	
*/
public class Ex7 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int compNum = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100

		int min = 1;
		int max = 100;
		 
		System.out.println("사용자가 생각하는 숫자를 컴퓨터가 맞추는 프로그램을 작성하세요.\n1 - 100");

		while (true) {
			
			System.out.print("사용자가 생각하는 숫자가 [" + compNum + "]입니까? (맞으면 0, 작은수면 1, 큰수면 2) ");
			int value = sc.nextInt();

			if (value == 1) { //IF :: 작은 경우
				max = compNum; 
				compNum = min + r.nextInt(max-min);
			} else if (value == 2) {
				min = compNum;//ELSE-IF :: 큰경우
				compNum = min + r.nextInt(max-min);
			} else if (value == 0) { //ELSE-IF :: 정답
				System.out.println("수고하셨습니다");
				break;
			} else {//ELSE :: 오류
				System.out.println("알 수 없는 오류입니다.");
				break;
			}//ELSE IF 
		
		}//WHILE :: 반복 
	}

}
