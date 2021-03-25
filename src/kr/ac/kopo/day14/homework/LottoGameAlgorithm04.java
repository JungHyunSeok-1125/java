package kr.ac.kopo.day14.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 배열에 숫자 구분 지어서 중복 제거 하여 로또 번호 추출
 * 
 */
public class LottoGameAlgorithm04 implements LottoGame{

	@Override
	public void lottoGame() {

		List<String> numList = new ArrayList<>();	
		InputUtil input = new InputUtil();
		PrintUtil printUtil = new PrintUtil();
		int[] nums = new int[45];//LINE :: 45개 배열 선언 (0으로 초기화)

		for (int i = 0; i < 6; i++) {
			int randNum = input.getRandomNum(45);
			if (nums[randNum] == 1) {
				i--;
			} else {
				nums[randNum] = 1;
			}
		}//FOR :: 45개 배열에서 랜덤 숫자의 인덱스를 1로 변경. 1이면 i 감소
		
		for (int k = 0; k < nums.length; k++) {
			if(nums[k] == 1) {
				numList.add(Integer.toString(k));
			}
		}//FOR :: 리스트에 인덱스 숫자를 추가한다.
		
		printUtil.print(numList);
	}

}
