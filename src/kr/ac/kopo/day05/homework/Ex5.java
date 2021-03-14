package kr.ac.kopo.day05.homework;

import java.util.Scanner;

/*



 5. 별그리기 관련 문제를 라인수를 입력받아 출력하는 코드를 작성
 	3- 20사이의 라인수를 입력받고, 짝수 입력시 하나작은 홀수로 구성 
 	ex) 20라인 받으면 19줄 모양으로 구성
 	
 	----*	4	1
 	---**	3	2
 	--***	2 	3	
 	-****	1	4
 	*****	0	5
 	
 	*****5		*********	0 9
 	**** 4		 *******	1 7
 	***	 3		  *****		2 5
 	**	 2		   ***		3 3
 	*	 1			*		4 1
 	**	 2		   ***		3 3
 	***	 3		  *****		2 5
 	**** 4		 *******	1 7	
 	*****5      *********	0 9
 	
  	
*/
public class Ex5 {

	public static void main(String[] args) {

		System.out.println("별그리기 관련 문제를 라인수를 입력받아 출력하는 코드를 작성");
		System.out.println("3- 20사이의 라인수를 입력받고, 짝수 입력시 하나작은 홀수로 구성 ");
		System.out.println("ex) 20라인 받으면 19줄 모양으로 구성");

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해 주세요");
		int val = sc.nextInt();
		int halfVal = val / 2;
		if (val % 2 == 0) {
			val -= 1;
		} // IF :: 짝수인 경우 -1

		for (int i = 0; i < val; i++) {

			for (int k = val - 2; k >= i; k--) {
				System.out.print("-");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // FOR :: val줄 만큼 반복
		System.out.println("----------------------");

		for (int i = 0; i < val; i++) {

			if (i >= halfVal) {
				for (int k = i; k > halfVal -1; k--) {
					System.out.print("*");
				}

			} else {
				for (int l = i; l <= halfVal; l++) {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		System.out.println("----------------------");

		for (int i = 0; i < val; i++) {
			if (i < halfVal) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = val; j - 1 > 2 * i - 1; j--) {
					System.out.print("*");
				}
			} else {
				for (int j = val; j > i+1; j--) {
					System.out.print(" ");
				}
				
				for (int j = 0; j <= (2 * i) - val+1; j++) {
					System.out.print("*");

				}

			}

			System.out.println();

		}
	}
}
