package kr.ac.kopo.day06;

public class HandPhoneMain {

	public static void main(String[] args) {

		// "홍길동", "010-1111-2222", "삼성"을 가지는 HandPhone 객체 hp를 생성
		HandPhone hp = new HandPhone();

		hp.name = "홍길동";
		hp.phone = "010-1111-2222";
		hp.company = "삼성";

		// "윤길동", "010-3333-4444", "애플" 가지는 hp2 생성
		HandPhone hp2 = new HandPhone();
		hp2.name = "윤길동";
		hp2.phone = "010-3333-4444";
		hp2.company = "애플";

		// "윤길동", "010-5555-6666", "엘지" 가지는 hp3 생성
		HandPhone hp3 = new HandPhone();
		hp3.name = "한길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "엘지";

		System.out.println("소유주명 : " + hp.name + ", 전화번호 : " + hp.phone + ", 제조사 : " + hp.company);
		System.out.println(hp2.name + " " + hp2.phone + " " + hp2.company);
		System.out.println(hp3.name + " " + hp3.phone + " " + hp3.company);

		System.out.println("=================================================");

		HandPhone[] hpArr = { hp, hp2, hp3 };

		for (int i = 0; i < hpArr.length; i++) {
			System.out
					.println("소유주명 : " + hpArr[i].name + ", 전화번호 : " + hpArr[i].phone + ", 제조사 : " + hpArr[i].company);

		}
		System.out.println("=================================================");
		
		for (HandPhone arr : hpArr) {
			System.out.println("소유주명 : " + arr.name + ", 전화번호 : " + arr.phone + ", 제조사 : " + arr.company);

		}
	}
}
