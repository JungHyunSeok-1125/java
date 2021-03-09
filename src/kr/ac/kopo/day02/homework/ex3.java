package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("3. 2960원어치 물건을 사고 5000원을 입력했을 때 거스름돈의 액수와 1000원, 500원, 100원, 50원, 10원의 개수를 출력하는 코드를 작성");
		System.out.print("물건값을 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("지불한 액수를 입력 : ");
		int num2 = sc.nextInt();
		
		int money;
		System.out.println("<방식1>");
		money = (num2-num1);
		if(money > 0) {			
				System.out.println("거스름돈 : " + money);	
				System.out.println("1000원 : " + money/1000);
				money = money % 1000;
				//money -= (money/1000) * 1000;		
				System.out.println("500원 : " + money/500);
				money = money % 500;
				//money -= (money/500) * 500;
				System.out.println("100원 : " + money/100);
				money = money % 100;
				//money -= (money/100) * 100;	
				System.out.println("50원 : " + money/50);
				money = money % 50;
				//money -= (money/50) * 50;
				System.out.println("10원 : " + money/10);
				money = money % 10;
				//money -= (money/10) * 10;
			
		} else {
			System.out.println((num1-num2)+"원이 부족합니다.");
		}
		
		money = (num2-num1);
		System.out.println("<방식2>");
		if(money > 0) {			
			System.out.println("거스름돈 : " + money);
			if(money/1000 != 0) {			
				System.out.println("1000원 : " + money/1000);
				money = money % 1000;
				//money -= (money/1000) * 1000;
			}
			if(money/500 != 0) {			
				System.out.println("500원 : " + money/500);
				money = money % 500;
				//money -= (money/500) * 500;
			}
			if(money/100 != 0) {	
				System.out.println("100원 : " + money/100);
				money = money % 100;
				//money -= (money/100) * 100;
			}
			if(money/50 != 0) {		
				System.out.println("50원 : " + money/50);
				money = money % 50;
				//money -= (money/50) * 50;
			}
			if(money/10 != 0) {		
				System.out.println("10원 : " + money/10);
				money = money % 10;
				//money -= (money/10) * 10;
			}
			
		}else {
			System.out.println((num1-num2)+"원이 부족합니다.");
		}
		
	}

}

/*
	현석씨...
	money -= (money/1000) * 1000;
	이 코드는
	money = money % 1000; 
	이렇게 대체할 수 있을 거 같아요... 왜 그런지 생각해봅시다~~~
	
	네 이해하고 수정하였습니다 감사합니다
*/
