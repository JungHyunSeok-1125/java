package kr.ac.kopo.day12;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("main start...");

		Random r = new Random();
		int num = r.nextInt(3); // 0~2  사이의 난수
		System.out.println("num : " + num);
		
		String str = null;
		
		try {			
			
			System.out.println("첫번째 문자 : " + str.charAt(0));
			
			System.out.println(10 / num);
//		} catch (ArithmeticException | NullPointerException e) {//오류 띄우고 거기 있던 코드 넣어서 작성, 발생한 정보를 ae가 알고있다. ==> 이유를 알고 싶으면?
		} catch (Exception e) {//묵시적 형변환 통해서 오류 출력
			
			System.out.println("catch 블럭 진입...");
			System.out.println("이유 : " + e.getMessage());
			e.printStackTrace();
		} 
		
		/*
		 * try {
		 * 
		 * System.out.println("첫번째 문자 : " + str.charAt(0));
		 * 
		 * System.out.println(10 / num); } catch (ArithmeticException ae) {//오류 띄우고 거기
		 * 있던 코드 넣어서 작성, 발생한 정보를 ae가 알고있다. ==> 이유를 알고 싶으면?
		 * 
		 * System.out.println("catch 블럭 진입..."); System.out.println("이유 : " +
		 * ae.getMessage()); ae.printStackTrace(); } catch (NullPointerException ne) {
		 * 
		 * System.out.println("catch 블럭 진입..."); System.out.println("이유 : " +
		 * ne.getMessage()); ne.printStackTrace(); }//CATCH :: multi-catch
		 */		
		System.out.println("main end...");
		
	}
}
