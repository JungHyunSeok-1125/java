package kr.ac.kopo.day14.homework;

/*
 1. 로또 게임
게임수를 입력하세요 : 3
게임 1 : [2, 6, 13, 25, 20, 7]
게임 2 : [2, 9, 3, 7, 38, 13]
게임 3 : [40, 10, 38, 39, 42, 18]

로또추출 알고리즘 최소 4개이상
 */
public class Hw1 {

	public static void main(String[] args) {

		System.out.println("1. 로또 게임");

		InputUtil input = new InputUtil();
		LottoGame lotto;
		int count = input.getInt("게임수를 입력하세요 ");
		int game = 0;

		//FOR :: 랜덤 게임
		for (int i = 0; i < count; i++) {
			
			game = input.getRandomNum(4); //LINE :: 1 ~ 4까지의 랜덤숫자 추출
			System.out.print("게임"+(i+1) + " : ");
			//game = 3;
			switch(game) {
			
			case 1:
				lotto = new LottoGameAlgorithm01();
				lotto.lottoGame();
				break;
			case 2:
				lotto = new LottoGameAlgorithm02();
				lotto.lottoGame();
				break;
			case 3:
				lotto = new LottoGameAlgorithm03();
				lotto.lottoGame();
				break;
			case 4:
				lotto = new LottoGameAlgorithm04();
				lotto.lottoGame();
				break;
			default :
				System.out.println("알 수 없는 오류입니다.");
				break;
			}
		
		}//FOR :: 횟수만큼 반복 종료
	}

	
}
