package kr.ac.kopo.day12.homework;

import java.util.Random;

public class ScissersRockPaper implements Game {

	final static int SCISSERS = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	@Override
	public int startGame(int you) {
		Random r = new Random();
		int me = r.nextInt(3) + 1;//LINE  :: 랜덤 숫자 생성

		//me => 컴퓨터, you => 사용자 
		if (me == you) {//IF :: 숫자가 동일하여 비긴 경우
			System.out.println("DRAW");
			return 2;
			
		} else if (me == SCISSERS && you == ROCK || me == ROCK && you == PAPER || me == PAPER && you == SCISSERS) {
			System.out.println("YOU WIN");
			return 1;
			//ELSE-IF :: 사용자가 가위바위보 이긴 경우 1 반환
			
		} else if (me == SCISSERS && you == PAPER || me == ROCK && you == SCISSERS || me == PAPER && you == ROCK) {
			System.out.println("YOU LOSE");
			return 0;
			//ELSE-IF :: 사용자가 진 경우 0 반환
			
		} else {
			System.out.println("오류입니다.");
			return -1;
		}//ELSE :: 이상한 경우 예외

	}
}
