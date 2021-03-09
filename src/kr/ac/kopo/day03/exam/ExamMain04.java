package kr.ac.kopo.day03.exam;

/*
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * for 2개 if 1개
 * 3 -20사이의 라인수를 입력하세요 : 11
 * */
public class ExamMain04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = i; j <= 9; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}

}
