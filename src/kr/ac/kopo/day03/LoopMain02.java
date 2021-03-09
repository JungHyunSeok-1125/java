package kr.ac.kopo.day03;

/*
 	*****
 	*****
 	*****
*/

//오늘은 sysout을 사용하면 문자를 1개만 쓸 수 있도록 한다.
public class LoopMain02 {

	public static void main(String[] args) {

		/*
		 * for (int i=0;i<3;i++) { System.out.println("*****"); }
		 */

		// i,j,k,l 순서대로 변수를 사용한다.
		for (int i = 0; i < 3; i++) {// 행

			for (int j = 0; j <= 5; j++) {// 열
				System.out.print("*");
			}

			System.out.println();
		} // FOR :: 이중for문

	}

}
