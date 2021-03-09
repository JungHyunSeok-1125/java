package kr.ac.kopo.day03.exam;

/*
 2) 
 56789
 45678
 34567
 23456
 12345

 */
public class ExamMain02 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j < i + 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
