package kr.ac.kopo.day04.homework;

/*
 5.	2 ~ 100 사이의 소수를 출력
 	2	3	7	11	13	17 ...	97
 	----------------------------------
 	(한 라인에 5개씩 출력)
 	2	3	5	7	11
 	13	17	...
 	
 */
public class Ex5 {

	public static void main(String[] args) {

		boolean bool = false;

		System.out.println("2 ~ 100 사이의 소수를 출력");
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					bool = true;
				} // IF :: 나머지가 0이면 bool변경
			}
			System.out.print(bool ? "" : i + " ");// LINE :: bool이 false이면 출력
			bool = false;
		}
		

		int count = 0;

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					bool = true;
				} // IF :: 나머지가 0이면 bool변경
			}
			if(!bool) {
				System.out.print(i + " ");
				count ++;
				if(count % 5 ==0) {
					System.out.println();
				}
			}//IF :: bool이 false이면 출력, 출력 갯수가 5의 배수이면 줄내림
			bool = false;//LINE :: bool 초기화
		}
	}
}
