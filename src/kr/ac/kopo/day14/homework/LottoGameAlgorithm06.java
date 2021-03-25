package kr.ac.kopo.day14.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 활용한 로또 번호 추출
 * Value값 활용
 */
public class LottoGameAlgorithm06 implements LottoGame{

	Map<Integer, Integer> nums = new HashMap<>();
	InputUtil input = new InputUtil();
	@Override
	public void lottoGame() {

		int randNum;
		int count = 0;
		
		while (true) {
			if (nums.containsKey(5)) break;// IF :: ID 체크하여 갯수확인

			randNum = input.getRandomNum(45);

			if (count == 0) {// IF :: 처음에 0 인경우
				nums.put(count, randNum);
				count++;
			} else {
				if (checkOverlap(count, randNum)) {
					nums.put(count, randNum);
					count++;
				} // IF :: 중복 체크 하여 true이면 추가
			} // ELSE :: 0 제외한 나머지 경우
		} // WHILE :: 숫자 채울때 까지 반복

		Set<Integer> keys = nums.keySet(); // 키들만 모아둔 SET으로 저장 가능.
		System.out.print("[");
		for (Integer key : keys) {
			System.out.print(nums.get(key));
			if (key != 5) System.out.print(", ");//마지막 점표시
		}
		System.out.println("]");
	}

	public boolean checkOverlap(int count, int randNum) {
		for (int i = 0; i < count; i++) {
			if (nums.get(i) == randNum) {
				return false;
			} // IF :: 중복 숫자 있으면 false 반환ㄴ
		} 
		return true;
	}
}
