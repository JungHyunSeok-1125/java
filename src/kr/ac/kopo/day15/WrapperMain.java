package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.List;

/*
 기본 자료형 	Wrapper클래스
 
 boolean	Boolean
 char		Character
 byte		Byte
 short		Short
 int 		Integer
 long		Long
 float		Float
 double		Double
  
 
 */
public class WrapperMain {

	public static void main(String[] args) {
		
		//List<Integer> list = new ArrayList<>();
		
		//wrapper class 확인  ==> java.lang 패키지에 있다.
		int i = 123;
		Integer i2 = new Integer(123);
		Integer i3 = 123;	//auto-boxing
		int i4 = new Integer(123); //auto-unboxing
		
		System.out.println("i : " + i);
		System.out.println("i2 : " + i2);
		System.out.println("i3 : " + i3);
		
		String str = "10234";
		
		int num = Integer.parseInt(str);
			num = Integer.valueOf(str); // 참조 자료형 반환
		System.out.println(num + 100);
		
	}
}
