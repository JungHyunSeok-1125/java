package kr.ac.kopo.day07.exam;

import java.util.Scanner;

public class IceCreamMarket {

	IceCream[] iceArr;
	Scanner sc = new Scanner(System.in);

	int inputInt(String msg) {

		System.out.println(msg);

		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	String inputString(String msg) {

		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}

	void doSomething() {
		// 손님 아이스크림 구매
		buy();

		info();
		// 구매정보 출력
	}

	void buy() {
		int count = inputInt("아이스크림 몇개 구입할래? : ");

		iceArr = new IceCream[count];

		for (int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 입력 ***");

			String name = inputString("아이스크림명 : ");
			int price = inputInt("아이스크림 가격");

			iceArr[i] = new IceCream();
			iceArr[i].set(name, price);

			/*
			 * iceArr[i].name = name; iceArr[i].price = price;
			 */
		}

	}

	void info() {
		System.out.println("<총 " + iceArr.length + "구매 정보 입력");
		System.out.println("<번호\t아이스크림명\t아이스크림가격");
		int no = 1;
		for (IceCream ice : iceArr) {
			System.out.println(no + "\t" + ice.name + "\t\t" + ice.price);
			no++;
		}
	}
}
