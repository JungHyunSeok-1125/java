package kr.ac.kopo.day06;

public class HandPhoneMain02 {

	public static void main(String[] args) {		

		//HandPhone[] hpArr = new HandPhone[3];
		HandPhone[] hpArr = new HandPhone[] {
				new HandPhone(), new HandPhone(), new HandPhone()};
		
		hpArr[0].name ="홍길동";
		hpArr[0].phone ="00-1111-2222";
		hpArr[0].company ="삼성";
		
		hpArr[1].name ="윤길동";
		hpArr[1].phone ="00-2222-3333";
		hpArr[1].company ="애플";
		
		hpArr[2].name ="한길동";
		hpArr[2].phone ="00-5555-6666";
		hpArr[2].company ="엘지";
		
		for(int i=0 ; i<hpArr.length ; i++) {
			System.out.println(hpArr[i].name);
			System.out.println(hpArr[i].phone);
			System.out.println(hpArr[i].company);
		}
		for(HandPhone hp:hpArr) {
			System.out.println("소유주명 : " + hp.name);
			System.out.println("전화번호 : " + hp.phone);
			System.out.println("제조사 : " + hp.company);
		}
		
	}
}
