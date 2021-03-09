package kr.ac.kopo.day03.exam;

/*
 * *****
 *  ****
 *   ***
 *    **
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 * for5 if1
 * for3 if2
 * for3 if1
 * for2 if2
 * */

public class ExamMain05 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			if (i >= 5) {
				for (int j = 9 - i; j >= 0; j--) {
					System.out.print(" ");
				}
				for (int k = i; k >= 5; k--) {
					System.out.print("*");
				}

			} else {
				for (int j = 6 - i; j <= 5; j++) {
					System.out.print(" ");
				}
				for (int l = i; l <= 5; l++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("============================================");
		// 교수님 코드 (참고)
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i - 1; j++) {
					System.out.print('-');
				} // 0 - 1 - 2 - 3 - 4
				for (int j = 1; j <= 6 - i; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print('-');
				}
				for (int j = 1; j <= i - 5; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		System.out.println("============================================");
		// 교수님 코드2 (참고)

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5; j++) {
					if (j < i) {
						System.out.print('-');
					} else {
						System.out.print('*');
					}
				}
				System.out.println();
			} else {
				for (int j = 1; j <= 5; j++) {
					System.out.print(j < 10 - i ? '-' : '*');
				}
				System.out.println();
			}

		}

		System.out.println("============================================");
		// 교수님 코드3 (참고)
		int space = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= space; j++) {// 증감식을 변수명으로 선언
				System.out.print('-');
			}
			for (int j = 1; j <= 5 - space; j++) {// 증감식을 변수명으로 선언
				System.out.print('*');
			}
			System.out.println();

			if (i < 5) {
				space++;
			} else {
				space--;
			}
		}
		System.out.println("============================================");
		// 교수님 코드4 (참고)
		int startCol = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j < startCol) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
			if(i<5) {
				startCol++;
			}else{
				startCol--;
			}
		}

	}
}
