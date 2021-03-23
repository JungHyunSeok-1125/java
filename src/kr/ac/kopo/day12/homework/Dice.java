package kr.ac.kopo.day12.homework;

import java.util.Random;

public class Dice implements Game{

	@Override
	public int startGame(int you) {

		Random r = new Random();
		int randNum = r.nextInt(6)+1;
		
		if(randNum == you) { //IF :: 숫자가 동일한 경우
			System.out.println("You win");
			return 1;
		} else if(you >= 7 || you <= 0) { //ELSE-IF :: 사용자가 이상한 숫자 입력한 경우
			System.out.println("Dice Err");
			return -1;
		} else {//ELSE :: 숫자가 다른경우
			System.out.println("You lose");
			return 0;
		}
	}

}
