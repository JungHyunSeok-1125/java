package kr.ac.kopo.day07;

public class MethodMain01 {

	/**
	* 임의의 문자를 반복하여 출력하는 기능
	 * @param cm 출력할 문자
	 * @param count 출력회수
	 * @return 그냥 숫자
	 */
	static int printStar(char cm, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(cm);
		}
		
		System.out.println();
		
		return 10;
	}

	public static void main(String[] args) {

		int data = printStar('#', 10);
		System.out.println("Hello");
		printStar('-', 12);
		System.out.println("Hi");
		printStar('$', 4);
		System.out.println("GoodBye");
		printStar('@', 20);

	}

}
