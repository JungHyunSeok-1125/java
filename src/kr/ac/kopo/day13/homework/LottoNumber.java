package kr.ac.kopo.day13.homework;

/*
 과제1>
   좋아하는 로또 번호를 입력하세요 : 34
   34를 포함해서 로또번호들을 추출하겠습니다

   좋아하는 로또 번호를 입력하세요 : 77
   LottoNumberException : 1 - 45사이만 가능합니다. 77은 올바르지 않습니다 
 */
public class LottoNumber {

	public static void main(String[] args) {

		InputUtil input = new InputUtil();

		int lottoNum = input.getInt("좋아하는 로또 번호를 입력하세요 :");

		try {
			if (lottoNum > 45 || lottoNum < 1) {
				throw new LottoNumberException("1 - 45사이만 가능합니다. " + lottoNum + "은 올바르지 않습니다.");
			} else {
				System.out.println(lottoNum + "를 포함해서 로또번호들을 추출하겠습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
