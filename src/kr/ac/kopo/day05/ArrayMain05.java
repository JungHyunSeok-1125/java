package kr.ac.kopo.day05;

import java.util.Arrays;

/*
 int[] a = {10, 20, 30};
 int[] b;
 
 b = a;
 //shallow copy
 //주소 값만 복사한다.
 */
public class ArrayMain05 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30 };
		int[] b;

		b = a; // shallow copy

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		System.out.println();
		++b[0];
		System.out.println("++b[0] 수행 후...");
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));

		// deep copy
		b = new int[a.length];// 바로 0으로 초기화
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		System.out.println();
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		System.out.println();
		++b[0];
		System.out.println("++b[0] 수행 후...");
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		
		System.out.println();
		
		b = new int[a.length];// 바로 0으로 초기화
		System.arraycopy(a, 0, b, 0, a.length);
		
		System.out.println();
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		System.out.println();
		++b[0];
		System.out.println("++b[0] 수행 후...");
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		
		System.out.println();
		
	}
}
