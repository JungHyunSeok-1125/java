package kr.ac.kopo.day05;

public class ArrayMain07 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("_______________");
		
		for (int num : a) {
			System.out.println(num);
		}
		
		System.out.println("_______________");

		// a 배열의 모든 요소에 100을 더하자
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + 100;
			System.out.println(a[i]);
		}
		System.out.println("_______________");
		
		for(int num : a) {//값을 출력하거나 보는 용도로만 사용하도록 한다.
			
			num = num +100;
			System.out.println(num);
		}
		
	}
}
