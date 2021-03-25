package kr.ac.kopo.day14.homework;

import java.util.HashSet;
import java.util.Set;

/**
 * SET 활용한 로또 추출
 */
public class LottoGameAlgorithm02 implements LottoGame{

	@Override
	public void lottoGame() {

		Set<String> nums = new HashSet<>();
		InputUtil input = new InputUtil();
		PrintUtil printUtil = new PrintUtil();
		
		String randNum;
		int count = 0;

		while (count < 6) {

			randNum = Integer.toString(input.getRandomNum(45));// LINE :: 1 ~ 45랜덤 숫자 입력받기

			boolean bool = nums.add(randNum);
			if (bool) {
				count++;
			} // IF :: Set은 중복을 허용하지 않는다. 중복되지 않은 숫자가 더해질 떄, true 반환됨을 활용.
		} // WHILE :: 종료

		printUtil.print(nums);
	}

}
