package kr.ac.kopo.day14.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Map 활용한 로또 번호 추출 
 * 키값의 중복 활용
 */
public class LottoGameAlgorithm03 implements LottoGame{
	
	Map<Integer, Integer> nums = new HashMap<>();
	InputUtil input = new InputUtil();
	PrintUtil printUtil = new PrintUtil();

	@Override
	public void lottoGame() {

		int randNum;
		
		while (true) {
			
			randNum = input.getRandomNum(45);
			nums.put(randNum, randNum);//LINE :: 키는 중복 X
			
			if (nums.size() == 6) break;
		
		} // WHILE :: 숫자 채울때 까지 반복

		printUtil.print(nums);
	}
}
