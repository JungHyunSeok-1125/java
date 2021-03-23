package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exceptionmain04 {
	/*
	 직접처리(try-catch), 간접처리(throws)의 차이점은 알고 있어야 한다.
	 try-catch ,throws
	 throws를 사용하면 예외가 발생하면 나머지 코드를 실행하지 않는다. 
	 사용하는 것은 용도에 따라서 적절하게 사용하면 된다.
	 */
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("a.txt"); 
			//checked exception  :: 컴파일 시점의 예외처리 (무조건 에러에 대한 예외처리를 하라고 지시를 한다.)
			//보통 메모리가 아닌 외부장치를 사용할 때 checked exception이 무조건 발생하게 된다.
		} catch (FileNotFoundException e) {
				try {
					FileWriter fw = new FileWriter("error.log");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
		
		
		
	}
}
