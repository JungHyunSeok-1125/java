package kr.ac.kopo.day04.homework;

/*
 5.	2 ~ 100 사이의 소수를 출력
 	2	3	7	11	13	17 ...	97
 	----------------------------------
 	(한 라인에 5개씩 출력)
 	2	3	5	7	11
 	13	17	...
 	
 */
public class ex5 {

	public static void main(String[] args) {

		boolean bool = false;
		
		int[] arr = new int[100];
		
		System.out.println("2 ~ 100 사이의 소수를 출력");
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0 ) {
					bool = true;
				}
			}
			System.out.print(bool ? "" : i + " " );
			bool = false;
		}
		System.out.println("\n"+"======================================");
		int count=1;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0 ) {
					bool = true;
				}
			}
			if(bool) {				
				System.out.print(i + " " );
				count++;
				bool = false;
				if(count%5 == 0) {
					System.out.println();
				}
			}
			
		}
		
	}
}
