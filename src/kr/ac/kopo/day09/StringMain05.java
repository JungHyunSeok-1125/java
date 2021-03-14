package kr.ac.kopo.day09;

public class StringMain05 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		int sum = 0;
		String str = "";
		for (int i = 0; i <= 100000; i++) {
			str += i;
			//str = str + i;
			//str = str.concat(String.valueOf(i)));
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");
//--------------------------------------------------------------------------------------
		
		StringBuffer sb = new StringBuffer();// 계속 변하는 문자열에 사용
		start = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");
		
	}
}

/*
 클래스명.변수명 => 접근한다.
 스태틱 선언된 클래스 혹은 변수 내에서는 this를 쓸 수 없다.
 */
 