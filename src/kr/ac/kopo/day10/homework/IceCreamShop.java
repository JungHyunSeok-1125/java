package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class IceCreamShop extends IceCream {

	private static int amount;
	private static int total;
	private static int customer;

	Scanner sc = new Scanner(System.in);

	public IceCreamShop() {

	}

	public IceCreamShop(int amount, int total, int customer) {
		super();
		this.amount = amount;
		this.total = total;
		this.customer = customer;
	}

	public void iceCreamService() {

		while (true) {

			int amount = getInt("아이스크림 몇개 구입할래?");

			addAmount(amount);// LINE :: 전체 갯수 더하기

			IceCream[] ice = new IceCream[amount];
			for (int i = 0; i < amount; i++) {
				System.out.println((i + 1) + "번");
				ice[i] = buy();
			}
			print(ice);

			if (!buyMore("계속 구매할래?")) {
				break;
			} else {
				customer++;
			}

		} // WHILE 종료
		receipt();

	}

	public int getInt(String str) {

		System.out.print(str);

		int a = sc.nextInt();
		sc.nextLine();

		return a;
	}

	public char getChar(String str) {

		System.out.print(str);

		char a = sc.nextLine().charAt(0);

		return a;
	}

	public String getString(String str) {

		System.out.print(str);

		String a = sc.nextLine();

		return a;
	}

	public void addAmount(int a) {

		this.amount += a;
	}

	public void addTotal(int a) {

		this.total += a;
	}

	public IceCream buy() {
		IceCream iceCream = new IceCream(getString("아이스크림명 : "), getInt("아이스크림가격 : "));
		addTotal(iceCream.getPrice());
		return iceCream;
	}

	public void print(IceCream[] ice) {
		for (int i = 0; i < ice.length; i++) {
			System.out.println((i + 1) + "번\n아이스크림명 : " + ice[i].getName());
			System.out.println("아이스크가격 : " + ice[i].getPrice());
		}
	}

	public boolean buyMore(String str) {

		while (true) {
			char ans = getChar(str);
			
			if (ans == 'Y' || ans == 'y') {
				return true;
			} else if ((ans == 'N' || ans == 'n')) {
				return false;
			} else {
				System.out.println("다시 입력하세요");
			}
		}

	}

	public void receipt() {

		System.out.println("총 " + (customer+1) + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + amount + "개");
		System.out.println("총 판매액 : " + total + "원");
	}

}
