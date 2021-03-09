package kr.ac.kopo.day03.exam;

/*   
 * 7) 
 * 
 * 			*
 * 		   ***
 *        *****
 * 		 *******
 * 	    *********
 * 	     *******
 * 		  *****
 * 		   ***
 * 			*
 * 
 *
 * */
public class ExamMain07 {

	public static void main(String[] args) {
		for (int i = 1, l = 1; i <= 9; i++) {

			if (i < 5) {
				for (int j = 1; j < 6 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= l; j++) {
					System.out.print("*");
				}
				l += 2;
			} else {
				for (int j = 1; j <= i - 5; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= l; j++) {
					System.out.print("*");
				}
				l -= 2;
			}
			System.out.println();
		}

		System.out.println("================================================");
		int n = 1;
		for (int i = 1, l = 1; i <= 9; i++) {
			for (int j = 1; j <= 5 - n; j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= 2 * n - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

			if (i < 5) {
				n++;
			} else {
				n--;
			}
		}

		System.out.println("================================================");
		int space = 4;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= space || j >= 10 - space) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (i < 5) {
				space--;
			} else {
				space++;
			}
		}

	}

}
