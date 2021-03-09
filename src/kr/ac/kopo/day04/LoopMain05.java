package kr.ac.kopo.day04;

public class LoopMain05 {

	public static void main(String[] args) {

		loop01: for (int i = 1, k = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {

				System.out.print(j);
				if (j == 3) {
					break loop01;
				}
			}
		} // LINE :: loop01 종료
		System.out.println();
	}

}
//배열 : 연속적인 공간에 같은 타입의 변수들의 집합
//크기 고정
//	int[] arr = new int[4];
//	int[] arr = {10, 20, 30, 40}; =>배열의 초기화
//	int[] arr = new int[] {0, 20, 30, 40}; =>배열의 초기화2