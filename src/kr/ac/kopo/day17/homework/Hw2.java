package kr.ac.kopo.day17.homework;

import java.util.Random;

/*


2. 홍수로 이재민 발생
방송국에서 이재민을 위한 성금 모집
방송중 콜센터 1~4번까지 전화걸어 성금 해주시길 바랍니다
방송이 종료디면 모금된 성금 총액을 알려드리겠습니다.

제약조건>
1~4번 콜센터 각각 10통 전화 받을 수 있음
성금은 1000원 ~10000원 사이, 1000단위로 랜덤하게 추출된다 가정
콜센터에서는 10통으 ㅣ전화를 받은 후 각 콜센터의 총성금을 출력하고 마지막으로 4개의 콜센터 성금 총 액 출력

콜센터 1~4번까지 1000~10000원 단위로 성금 적립
3번 콜센터 : 7000원 받았습니다.
4번 콜센터 : 2000원 받았습니다.
1번 콜센터 : 9000원 받았습니다.
4번 콜센터 : 3000원 받았습니다.
3번 콜센터 : 7000원 받았습니다.
...
1번 콜센터 총성금액 : ~~원
2번 콜센터 : 1000원 받았습니다.
2번 콜센터 총성금액 : ~~원
3번 콜센터 총성금액 : ~~원
...
국민들이 보내주신 총 성금액 : ~~원


 */
public class Hw2 {

	public static void main(String[] args) {

		CallCenter centerEmployee1 = new CallCenter("1번 ");
		CallCenter centerEmployee2 = new CallCenter("2번 ");
		CallCenter centerEmployee3 = new CallCenter("3번 ");
		CallCenter centerEmployee4 = new CallCenter("4번 ");
		
		centerEmployee1.start();
		centerEmployee2.start();
		centerEmployee3.start();
		centerEmployee4.start();
		
		try {
			centerEmployee1.join();
			centerEmployee2.join();
			centerEmployee3.join();
			centerEmployee4.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
	 int total = centerEmployee1.total()+centerEmployee2.total()+centerEmployee3.total()+centerEmployee4.total();
	 System.out.println("전국민이 보내주신 성금 총액 : " +total+"입니다");
	}

}

class CallCenter extends Thread {

	private String employee;
	private int donation;
	
	public CallCenter() {
	}
	
	public CallCenter(String employee) {
		super();
		this.employee = employee;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			int donationAmount = donation();
			System.out.println(employee + "콜센터 : " + donationAmount + "원 받았습니다.");
			donation += donationAmount;
		}
		
		System.out.println(employee +"콜센터 총 성금액 : " + donation + "원");
	}
	
	public int donation() {
		Random rand = new Random();
		int num = (rand.nextInt(9)+1)*1000;
		return num;
	}
	
	public int total() {
		return this.donation;
	}
	
}

