package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {

		int num = 10;
		
		num += 1;
		//num = num + 1; 와 동일하다.
		//복합대입연산자, 배정연산자
		num=10;
		System.out.println(++num);
		//전위증가연산자
		num =10;
		System.out.println(num++);
		//후위증가연산자
		
	}

}
