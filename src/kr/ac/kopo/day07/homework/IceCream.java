package kr.ac.kopo.day07.homework;

import java.util.Scanner;


/**
 * 아이스크림
 * 
 * @author JungHyunSeok 2021.03.16
 */
public class IceCream {
	
	String iceCreamName;
	int price;
	
	Scanner sc = new Scanner(System.in);

	/**
	 * 아이스크림 주문 받기
	 */
	void iceCreamSell() {

		System.out.print("아이스크림을 몇개 구입할래?");
		int getsu = sc.nextInt();
		sc.nextLine();

		IceCream[] ice = new IceCream[getsu];//LINE :: 아이스크림 객체 배열 생성

		for (int i = 0; i < ice.length; i++) {
			ice[i] = getIceCreamInformation(i);// LINE :: 아이스크림 구매 정보 받기
		}

		print(ice, getsu);//LINE :: 구매 정보 출력
	}

	/**
	 * 아이스크림 정보 받기
	 * @param i xx번째 아이스크림 정보 받기
	 * @return
	 */
	IceCream getIceCreamInformation(int i) {

		IceCream information = new IceCream();

		System.out.println("*** " + (i+1) + " 번째 아이스크림 구매정보 ***");
		System.out.print("아이스크림명 : ");
		information.iceCreamName = sc.nextLine();
		
		System.out.print("아이스크림 가격 : ");
		information.price = sc.nextInt();
		sc.nextLine();

		return information;
	}

	/**
	 * 아이스크림 구매정보 출력하기
	 * @param ice 아이스크림 객체 배열
	 * @param getsu 아이스크림 갯수
	 */
	void print(IceCream[] ice, int getsu) {
		System.out.println("< 총 " + getsu + "개의 아이스크림 구매정보 출력 >");

		System.out.println("번호	아이스크림명	아이스크림 가격 ");
		for (int i = 0; i < getsu; i++) {
			print(i, ice[i]);
		}
	}
	
	/**
	 * 메소드 오버로딩 통해서 구매 정보 출력
	 * @param i i 번째 아이스크림
	 * @param iceCream 아이스크림 객체 
	 */
	void print(int i, IceCream iceCream) {
		System.out.println(i+"\t"+iceCream.iceCreamName+"\t\t"+iceCream.price);
	}

}
