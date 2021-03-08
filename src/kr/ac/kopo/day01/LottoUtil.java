//선언부
package kr.ac.kopo.day01;

import java.util.*;

/**
 * 
 * 로또와 관련된 기능들을 제공하는 기능클래스
 * 
 * @author JungHyunSeok
 * 2021.03.08
 * 
 */

//참조클래스
public class LottoUtil {
	//내용부
	
	//맴버변수
	private int lottoNum;//변수
	
	//메소드
	/**
	 * 오늘의 로또 확률을 출력해주는 메소드
	 */
	public void todayLotto() {

		Random r = new Random();
		//java.util.Random r = new Random();
		//import로 해결
		
		System.out.println("오늘의 로또 확률 : " + r.nextInt(101) + "%입니다.");
		//101로 나누었을 때 나머지 값 추출하는 형태
		
		//Project -> Generate javadoc -> jdk설정 후
		//-locale ko_KR -charset utf-8 -encoding utf-8 -docencoding utf-8
	}
	
	/**
	 * 1-45사이의 로또 번호를 알려주는 메소드
	 * @return 추출된 로또번호
	 */
	public int getNum() {
		
		Random r = new Random();
		return r.nextInt() + 1;
	}
}
