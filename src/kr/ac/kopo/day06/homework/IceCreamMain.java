package kr.ac.kopo.day06.homework;

import java.util.Scanner;

/*
 * 다음의 결과를 보이는 프로그램을 작성하시오
 * 
 * 아이스크림 몇개 구입할꺼야? : 4
 * 
 * ***1번째 아이스크림 구매 정보 입력 ****
 * 아이스크림명 : 비비빅 (입력)
 * 아이스크림 가격 : 800
 * 
 * ***2번째 아이스크림 구매 정보 입력 ****
 * 아이스크림명 : 브라보콘
 * 아이스크림 가격 : 1500

 * ***3번째 아이스크림 구매 정보 입력 ****
 * 아이스크림명 : 구구콘
 * 아이스크림 가격 : 2000
 *
 * ***4번째 아이스크림 구매 정보 입력 ****
 * 아이스크림명 : 메로나
 * 아이스크림 가격 : 800
 * 
 * < 총 4개의 아이스크림 구매정보 출력>
 * 번호	아이스크림명	아이스크림 가격 
 * 1	비비빅		  800
 * 2	브라보콘		1500
 * 3	구구콘		2000
 * 4	메로나		800
 * 
 * 총계 : 5100원
 * */

public class IceCreamMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("다음의 결과를 보이는 프로그램을 작성하시오");

		System.out.print("아이스크림 몇개 구입할꺼야?");
		int count = sc.nextInt();

		IceCream[] iceCreamArr = new IceCream[count];
		// LINE :: 배열 생성
		
		sc.nextLine();
		
		for (int i = 0; i < count; i++) {
			
			iceCreamArr[i] = new IceCream();

			System.out.println("***"+(i+1)+"번째 아이스크림 구매 정보 입력 "+"***");
			System.out.print("아이스크림명 : ");
			String iceName = sc.nextLine();//LINE :: String형 받기
			
			System.out.print("아이스크림 가격 : ");
			int num = Integer.parseInt(sc.nextLine());
			int icePrice = sc.nextInt();
			
			iceCreamArr[i].iceCreamName = iceName;
			iceCreamArr[i].price = icePrice;
			System.out.println();
		}//FOR :: 배열에 값 넣기
		
		System.out.println("< 총 4개의 아이스크림 구매정보 출력>");
		System.out.println("번호	아이스크림명	아이스크림 가격 ");
		
		int k=1;
		int price = 0;
		for(IceCream iceResult : iceCreamArr) {
			System.out.println(k+"\t"+iceResult.iceCreamName+"\t\t"+iceResult.price);
			k++;
			price += iceResult.price;//LINE :: 가격 더하기
		}//FOR :: 출력
		System.out.println();
		System.out.println("총계 : " + price);
	}

}
