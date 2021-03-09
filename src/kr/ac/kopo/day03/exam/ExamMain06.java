package kr.ac.kopo.day03.exam;

/* 6)
 * *********	0-9
 *  *******		1-7
 *   *****		2-5
 *    ***		3-3
 *     *		4-1
 *     
 
 * */
public class ExamMain06 {

	public static void main(String[] args) {
		for (int i = 1, k = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j < 11 - k; j++) {
				System.out.print("*");
			}
			k += 2;
			System.out.println();
		}
	}

}
