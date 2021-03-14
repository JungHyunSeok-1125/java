package kr.ac.kopo.day05.homework;

import java.util.Arrays;

/*
 3. 소수는 1 ~ (판단정수) 사이의 소수로만 나누어 약수가 존재하지 않는다라는 규칙성을 이용함
  	2 ~ 100사이의 소수를 구분 및 출력하는 코드를 작성(배열)
 	//2 ~ 100까지의 소수를 다 구하는데, 
 	 *  ex) 55보다 작은 소수를 구해서 다 나눠본다. ==> 소수인지 여부 판단
 
*/
public class Ex3 {

	public static void main(String[] args) {

		System.out.println("소수는 1 ~ (판단정수) 사이의 소수로만 나누어 약수가 존재하지 않는다라는 규칙성을 이용함");
		System.out.println("2 ~ 100사이의 소수를 구분 및 출력하는 코드를 작성(배열)");

		boolean bool = false;
		boolean sosu = false;
		int[] decimal = new int[34];

		int sosuLoc = 0;

		int i, j, k;
		for (k = 2; k < 100; k++) {
			for (i = 2; i < k; i++) {
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						bool = true;
					}
				} // FOR :: i 보다 작은 소수 출력 (판단 정수)
				if (k % j == 0 && bool == false) {
					sosu = true;
				} // IF :: 소수로 나누어 지면 true로 변경
			} // LINE :: 보다 작은 정수 출력
			if (sosu == false) {
				decimal[sosuLoc] = k;
				sosuLoc++;
			} // IF :: 배열에 대입
			bool = false;
			sosu = false;
			// bool값들 초기화
		} // FOR :: 현재 수

		System.out.println(Arrays.toString(decimal));

		System.out.println("_______________________________________________");
		int[] prime = new int[30];
		int loc = 0;

		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			for (int a = 0; a < loc; a++) {
				if (num % prime[a] == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				prime[loc] = num;
				loc++;
			}
		}
		for(int b=0 ; b<loc;b++) {
			System.out.print(prime[b] + " ");
			
		}
	}

}
