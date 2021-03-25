package kr.ac.kopo.day14.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 활용한 로또 추출
 */
public class LottoGameAlgorithm01 implements LottoGame{

	@Override
	public void lottoGame() {

		List<String> nums = new ArrayList<>();
		InputUtil input = new InputUtil();
		PrintUtil printUtil = new PrintUtil();
		String randNum;
		int count = 0;//숫자 저장할 변수	
		
		while(count < 6) {
			
			randNum = Integer.toString(input.getRandomNum(45));// LINE :: 1 ~ 45랜덤 숫자 입력받기 (문자열 변환)
			
			if(!nums.contains(randNum)) {
				nums.add(randNum);
				count++;	
			}//IF :: ArrayList에서 contains 활용. 리스트 안에 중복된 숫자가 있으면 count 증가 X
			
		}//WHILE :: 종료
		
		printUtil.print(nums);
		
	}

}
