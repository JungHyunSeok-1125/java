package kr.ac.kopo.day02;

public class IFMain01 {

	public static void main(String[] args) {

		int a = 10, b = 5;

		System.out.println("MAX : " + (a > b ? a : b));

		if (a > b) { //ctrl + shift + f //명명규칙 자동으로 셋팅
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}
		
		/*
		 *  a가 b보다 크다면 a 출력
		 *  a가 b보다 작다면 b 출력
		 *  a와 b가 같다면 0 출력
		 */
		System.out.println(a > b ? a : (a < b ? b : 0));
		
		if(a > b) {
			System.out.println(a);
		}else {	// a <= b
			if(a < b) {
				System.out.println(b);
			} else {	// a == 0
				System.out.println(0);
			}
		}
//다르게 표현 ==============================>
		if(a >= b) {
			if(a ==b) {
				System.out.println(0);
			}else {				
				System.out.println(a);
			}
		}else {	// a <= b
			System.out.println(b);
		}
//다르게 표현 ==============================>
		if(a > b) {
			System.out.println(a);
		}else if(a < b) {
			System.out.println(b);
		} else {	// a == 0
			System.out.println(0);
			
		}
	}
	//키보드로 2개의 정수를 받고 비교하는 연습을 하도록 해본다. (단계별로 하나씩)
	//코드 안보고 한번 더 해보기
	/*
	 * 3항 연산자 ______?선택1:선택2; 
	 * 			 조건    T    F
	 *  논리형, 관계연산자, 논리 연산자만 조건식에 들어갈 수 있다.
	 * 
	 * sysout( a > b ? a : b); 
	 * 				   _________________ 
	 * sysout( a > b ? a : a < b ? b : 0);
	 * 
	 * 
	 * 	if(조건){ 
	 * 		println(a); 
	 * 	} 
	 * 	if(조건2){ 
	 * 		println(b); 
	 * 	} 
	 * 	ox,xo,oo,xx 경우 생김
	 *
	 *	if(조건){
	 * 		println(a); 
	 * 	}else{ 
	 * 		println(b); 
	 * 	} 
	 * 	ox,xo 경우 생김
	 * 
	 * sysout( a > b ? a : b); 
	 * 
	 * if(a>b){ 
	 * println(a);//참 
	 * }else{ 
	 * println(b);//거짓 
	 * }
	 */
}
