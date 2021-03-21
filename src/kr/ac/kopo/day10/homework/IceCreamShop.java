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

	/**
	 * 정수 입력 받기
	 * @param str
	 * @return
	 */
	public int getInt(String str) {

		System.out.print(str);

		int a = sc.nextInt();
		sc.nextLine();

		return a;
	}

	/**
	 * 문자 입력 받기
	 * @param str
	 * @return
	 */
	public char getChar(String str) {

		System.out.print(str);

		char a = sc.nextLine().charAt(0);

		return a;
	}

	/**
	 * 문자열 입력 받기
	 * @param str
	 * @return
	 */
	public String getString(String str) {

		System.out.print(str);

		String a = sc.nextLine();

		return a;
	}

	/**
	 * amount증가
	 * @param a
	 */
	public void addAmount(int a) {

		this.amount += a;
	}

	/**
	 * 전체 갯수 증가
	 * @param a
	 */
	public void addTotal(int a) {

		this.total += a;
	}

	/**
	 * 아이스크림 구매 
	 * @return
	 */
	public IceCream buy() {
		IceCream iceCream = new IceCream(getString("아이스크림명 : "), getInt("아이스크림가격 : "));
		addTotal(iceCream.getPrice());
		return iceCream;
	}

	/**
	 * 구매한 아이스크림 배열 출력
	 * @param ice
	 */
	public void print(IceCream[] ice) {
		for (int i = 0; i < ice.length; i++) {
			System.out.println((i + 1) + "번\n아이스크림명 : " + ice[i].getName());
			System.out.println("아이스크가격 : " + ice[i].getPrice());
		}
	}

	/**
	 * 더 구매할지에 관련한 메소드
	 * @param str
	 * @return
	 */
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

	/**
	 * 전체 아이스크림 저장관련 메소드
	 */
	public void receipt() {

		System.out.println("총 " + (customer+1) + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + amount + "개");
		System.out.println("총 판매액 : " + total + "원");
	}

}
