package kr.ac.kopo.day14.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 활용한 로또 번호 추출 
 * 키값의 중복 활용
 */
public class LottoGameAlgorithm05 implements LottoGame{

	Map<Integer, Integer> nums = new HashMap<>();
	InputUtil input = new InputUtil();

	@Override
	public void lottoGame() {

		int randNum;
		
		while (true) {
			
			randNum = input.getRandomNum(45);
			nums.put(randNum, randNum);//LINE :: 키는 중복 X
			
			if (nums.size() == 6) break;
		
		} // WHILE :: 숫자 채울때 까지 반복

		Set<Integer> keys = nums.keySet(); // 키들만 모아둔 SET으로 저장 가능.
		Object[] arr = keys.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
