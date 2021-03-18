package kr.ac.kopo.day09.homework;

public class StringUtilMain {

	public static void main(String[] args) {
	
		
		StringUtil strUtil = new StringUtil();
	
		System.out.println("1. 대문자인지 확인할 문자를 입력 ");
		System.out.println(strUtil.isUpperChar(strUtil.getChar("문자 하나를 입력하세요 : ")));
		
		System.out.println("=======================");
		System.out.println("2. 소문자인지 확인할 문자를 입력");
		System.out.println(strUtil.isLowerChar(strUtil.getChar("문자 하나를 입력하세요 : ")));
		
		System.out.println("=======================");
		System.out.println("3. 비교할 두 숫자를 입력하세요");
		System.out.println("더 큰 숫자 : " + strUtil.max(strUtil.getInt("첫번째 숫자 : "), strUtil.getInt("두번째 숫자 : ")));
		
		System.out.println("=======================");
		System.out.println("4. 비교할 두 숫자를 입력하세요");
		System.out.println("더 작은 숫자 : " + strUtil.min(strUtil.getInt("첫번째 숫자 : "), strUtil.getInt("두번째 숫자 : ")));
		
		System.out.println("=======================");
		System.out.println("5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오");
		System.out.println("거꾸로 변경 : " + strUtil.reverseString(strUtil.getString("문자를 입력하세요 : ")));
		
		System.out.println("=======================");
		System.out.println("6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오");
		System.out.println("대문자로 변경 : " + strUtil.toUpperString(strUtil.getString("문자를 입력하세요 : ")));
		
		System.out.println("=======================");
		System.out.println("7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오");
		System.out.println("소문자로 변경 : " + strUtil.toLowerString(strUtil.getString("문자를 입력하세요 : ")));
		 
		System.out.println("=======================");
		System.out.println("8. 다음은 주어진 문자열에서 문자를 찾는 문제입니다. 입력값에 따라 다음과 같은 출력이 나오도록 해당 char 의 개수를 리턴하는 checkChar 메소드를 작성하시오.");
		String strData = strUtil.getString("입력스트링 : ");
		char ch = strUtil.getChar("문자를 입력하세요 : ");		
		System.out.println("ch = \'"+ ch +"\'인 경우 " + " => "+ StringUtil.checkChar(strData, ch) + " 리턴");
		
		System.out.println("=======================");
		System.out.println("9. 다음은 주어진 문자열에서 특정 문자를 제거하는 문제입니다.");
		strData = strUtil.getString("입력스트링 : ");
		ch = strUtil.getChar("문자를 입력하세요 : ");		
		System.out.println("delChar = \'"+ ch +"\'인 경우 " + " => "+ StringUtil.removeChar(strData, ch) + " 리턴");
		
		
	}
}
