package kr.ac.kopo.day05.homework;

import java.util.Random;
import java.util.Scanner;

/*


 	
 6. 숫자맞추기 게임 구성
 	컴퓨터가 1-100사이의 랜덤 숫자 알고있다.
 	1 - 100 : 30
 	30보다 큰 수 입니다.
 	기회는 4번 남았습니다.
 	
 	31 - 100 : 70
 	70보다 작은 수 입니다.
 	기회는 3번 남았습니다.
 	
 	31 - 69 : 80
 	31 - 69 : 55
 	55보다 큰 수 입니다.
 	기회는 2번 남았습니다.
 	 	
 	56 - 69 : 60
 	60보다 큰 수 입니다.
 	기회는 1번 남았습니다.
 	
 	61 - 69 : 63
 	63보다 작은 수 입니다.
 	기회는 0번 남았습니다.
 	
 	아쉽습니다..기회를 다 소진하셨습니다.
 	정답은 61입니다.
 	
 ----------------------------------------------------
   	56 - 69 : 61
   
   	축하합니다. 정답입니다.
   	

*/
public class Ex6 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자맞추기 게임 구성");
		System.out.println("컴퓨터가 1-100사이의 랜덤 숫자 알고있다.");

		int compNum = r.nextInt(100) + 1; // (0 ~ 99) + 1 ==> 1 ~ 100

		int min = 1;
		int max = 100;
		int chance = 4;

		while (true) {
			System.out.print(min + " - " + max + "사이의 숫자를 입력하세요 : ");
			int userNum = sc.nextInt();

			
			
			if (compNum < userNum ) {
				chance--;
				System.out.println(userNum + "보다 작은 수 입니다. \n기회는 " + (chance + 1) + "번 남았습니다.\n");
				max = userNum;
			} else if (compNum > userNum) {
				chance--;
				System.out.println(userNum + "보다 큰 수 입니다. \n기회는 " + (chance + 1) + "번 남았습니다.\n");
				min = userNum;
			} else if (compNum == userNum) {
				System.out.println("축하합니다 정답입니다.");
				break;
			}
			
			if (chance < 0) {
				System.out.println("아쉽습니다..기회를 다 소진하셨습니다.");
				System.out.println("정답은 " + compNum + " 입니다.");
				break;
			}
			

		}

	}

}
