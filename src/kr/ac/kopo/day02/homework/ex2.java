package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.141592;
		
		System.out.println("1. 반지름을 입력받아 원둘레와 원넓이를 출력하는 코드를 작성 (단, 원주율을 상수변수를 사용하여 작성하시오.)");
		System.out.print("반지름 입력 : ");
		int num = sc.nextInt();
		System.out.println("반지름이 "+num+"일 때, 원 둘레는 "+2*pi*num+"이고, 원넓이는 "+pi*num*num+"이다.");
		
		
	}

}
