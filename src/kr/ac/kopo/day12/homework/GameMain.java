package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char menu = 0;//문자형 선택지 저장할 변수
		int choose = 0;//정수형 선택지 저장할 변수

		int countDraw = 0;
		int countLose = 0;
		int countWin = 0;
		//승, 무 패에 적용한 변수
		
		int gameResult = 0;
		//게임 결과 저장할 변수
		
		Game game = null;

		while (true) {

			if (menu != 'C') {//IF :: 종료선택 할때까지 반복되도록..
				System.out.println("게임을 선택하세요");
				System.out.println(" A. 가위바위보");
				System.out.println(" B. 주사위 값 맞추기");
				System.out.println(" C. 종료");

				menu = sc.nextLine().charAt(0);

				switch (menu) {

				case 'A':
					System.out.println("가위바위보 게임입니다.\n가위바위보 중 하나를 선택하세요.\n(1:가위 2:바위 3:보)");

					choose = sc.nextInt();
					sc.nextLine();

					game = new ScissersRockPaper();
					//형변환 통해서 startGame() 구현
					
					gameResult = game.startGame(choose);
					//LINE :: 인터페이스 상속받은 게임을 구현. (가위바위보)

					if (gameResult == 2)
						countDraw++;
					else if (gameResult == 1)
						countWin++;
					else if (gameResult == 0)
						countLose++;
					break;
					//IF-ELSE :: 결과에 따라서 카운트를 늘린다. (음수인 경우는 이상한 숫자 입력한 경우이므로 무시한다.)
					
				case 'B':
					System.out.println(">주사위 값 맞추기 게임입니다.\n주사위를 선택하세요. (1~6값 중 하나)");

					choose = sc.nextInt();
					sc.nextLine();
					
					game = new Dice();
					//형변환 통해서 startGame() 구현
					
					gameResult =game.startGame(choose);
					//LINE :: 인터페이스 상속받은 게임을 구현 (주사위 게임)
					
					if (gameResult == 2)
						countDraw++;
					else if (gameResult == 1)
						countWin++;
					else if (gameResult == 0)
						countLose++;
					break;
					//IF-ELSE :: 결과에 따라서 카운트를 늘린다. (음수인 경우는 이상한 숫자 입력한 경우이므로 무시한다.)
				case 'C':
					break;
				default:
					System.out.println("다시 입력하세요");

				}// LINE :: SWITCH-CASE 종료

			} else {
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은 " + countWin + "승 " + countLose + "패 " + countDraw + "무 입니다");
				//LINE :: 전적에 대하여 저장한 결과값을 출력해 준다.
				break;
			} // IF-ELSE 종료
		} // WHILE 종료
	}

}
