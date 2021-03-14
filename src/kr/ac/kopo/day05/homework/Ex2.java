package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

/*

	
2. 다음과 같은 결과를 보이는 프로그램 작성
 	짝수 몇개 입력 : 5
 	홀수 몇개 입력 : 4
 	
 	num1 : 12
 	num2 : 9
 	num3 : 67
 	num4 : 20
 	num5 : 9
 	num6 : 31
 	num7 : 24
 	num8 : 5
 	num8 : 11
 	num8 : 10
 	num9 : 6
 	
 	< PRINT >
  	12	 20	 24	 10	 6	 31	 9	 67	 9
  
*/
public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("2. 다음과 같은 결과를 보이는 프로그램 작성");

		System.out.print("짝수 몇개 입력 : ");
		int jjagsu = sc.nextInt();
		System.out.print("홀수 몇개 입력 : ");
		int holsu = sc.nextInt();

		int[] jjagsu_nums = new int[jjagsu];// LINE ::짝수 저장 배열
		int jjagsu_loc = 0;// LINE :: 짝수 저장 위치
		int[] hol_nums = new int[holsu];// LINE :: 홀수 저장 배열
		int hol_loc = 0;// LINE :: 홀수 저장 배열

		for (int i = 1; i <= jjagsu + holsu || (jjagsu_loc < jjagsu) && (hol_loc < holsu); i++) {
			System.out.print("num" + i + " : ");
			int a = sc.nextInt();
			if (a % 2 == 0 && jjagsu_loc < jjagsu) {
				jjagsu_nums[jjagsu_loc] = a;
				jjagsu_loc++;
			} else if (a % 2 != 0 && hol_loc < holsu) {
				hol_nums[hol_loc] = a;
				hol_loc++;
			} else {
				i--;
			}
			// IF :: 조건 해당 되면 배열에 넣고 위치 ++ㄴ
			// ELSE :: 조건 충족 안되면 --

		}
		for (int a : jjagsu_nums) {
			System.out.print(a + " ");
		}//FOR :: 짝수 순서대로 출력
		for (int i = hol_nums.length; i > 0; i--) {
			System.out.print(hol_nums[i-1] + " ");
		}//FOR :: 홀수는 역순으로 출력
		
		System.out.println("_______________________________________________");
		
		System.out.print("짝수 몇개 입력 : ");
		int evenNum = sc.nextInt();
		System.out.print("홀수 몇개 입력 : ");
		int oddNum = sc.nextInt();
		
		int[] nums = new int [evenNum + oddNum];
		/*
		 * 짝수 : nums[0] ~ nums[evenNum -1]
		 * 홀수 : nums[evenNum] ~ nums[num.length -1]
		 * */
		int evenIdx = 0, oddIdx = nums.length -1;
		
		for (int i=0;i<nums.length;i++) {
			System.out.print("num : " + (i+1) + " : " );
			int num = sc.nextInt();
			
			if(num % 2 ==0 && evenIdx <evenNum) {
				nums[evenIdx++] = num;
			} else if(num %2 ==1 && oddIdx >= evenNum){
				nums[oddIdx--] = num;
			} else {
				i--;
			}
			
		}
		System.out.println("<총 " + nums.length + "개 정수 출력 >");
		for(int num : nums){
			System.out.print(num+ " ");
		}
	}

}
