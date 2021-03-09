package kr.ac.kopo.day03.exam;

/*  
 * 8)
 * 	*-------*	1 7 1		
 * 	**-----**	2 5 2		
 * 	***---*** 	3 3 3		
 * 	****-****	4 1 4		
 * 	*********	
 * 	****-****	4 1 4
 * 	***---***	3 3 3		
 * 	**-----** 	2 5 2		
 *	*-------*	1 7 1		
 *
 * */
public class ExamMain08 {

	public static void main(String[] args) {

		for (int i = 1, k = 1; i <= 9; i++) {
			if (i <= 4) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				for (int j = 1; j <= 8 - k; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				k += 2;
			} else if (i == 5) {
				for (int j = 1; j <= 9; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print("*");
				}
				for (int j = 1; j <= k - 8; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print("*");
				}
				k += 2;

			}
			System.out.println("");
		}
		System.out.println("=======================================");

		int star = 1;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= star || j >= 10-star ) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				/*				
  				if (j <= star ) {
					System.out.print("*");
				}else if(j<10-star) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
				*/
			}
			System.out.println();
			if (i < 5) {
				star++;
			} else {
				star--;
			}
		}
	}

}
