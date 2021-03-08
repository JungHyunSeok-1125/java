package kr.ac.kopo.day01;

import java.lang.System;

public class HelloMain {

	public static void main(String[] args) {
		
		System.out.println("HelloWorld");
		System.out.print(20);
		System.out.print("\r\n");
		System.out.print("\n");//new line
		System.out.println(21);
		System.out.printf(10 + "\n" + 20);
		System.out.print("\n");
		System.out.printf("%d%c%d", 10, '\n', 20);
		System.out.print("\n");
		System.out.println("빼빼로" + "\t" + 1500);//정해진 탭의 위치가 있어서 가장 가까운 탭으로 이동한다.
		System.out.println("빠다코코넛" + "\t" + 2500);
		System.out.println("초코로 만든 홈런볼" + "\t" + 3500);
		
		System.out.printf("[%15s]%d\n","빼빼로",1500);
		System.out.printf("[%15s]%d\n","빠다코코넛",2500);
		System.out.printf("[%15s]%d\n","초코로 만든 홈런볼",3500);
		
		System.out.printf("[%-15s]%d\n","빼빼로",1500);
		System.out.printf("[%-15s]%d\n","빠다코코넛",2500);
		System.out.printf("[%-15s]%d\n","초코로 만든 홈런볼",3500);
		
		System.out.printf("%-15s%6d\n","빼빼로",1500);
		System.out.printf("%-15s%6d\n","빠다코코넛",2500);
		System.out.printf("%-15s%6d\n","초코로 만든 홈런볼",3500);
		
		System.out.println(10.0/3.0);
		System.out.printf("%f \n", 10.0/3.0);
		System.out.printf("%.2f \n", 10.0/3.0);
		java.lang.System.out.println("클래스명 앞에는 패키지명이 붙어야 된다. import안해도 되는 이유는 해서하면서 기본적으로 JVM이 자동으로 로드");
		// https://docs.oracle.com/en/java/javase 
		
		/*
		 * 출력메소드
		 * System.out.print()
		 * System.out.println() 
		 * System.out.printf() - jdk 1.5등장
		 * 
		 * 	%[-][간격]알파벳
		 *  %[전체자리수][.소수점이하자리수]f
		 * 	정수	%d
		 * 	실수	%f
		 * 	문자	%c
		 * 	문자열 %s
		 * 	논리값 %b	
		 * */
	}

}
