package kr.ac.kopo.day11.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * printArea() getArea() 계산하는 메소드 다시 작성
 * 
 * @author HP
 *
 */
public class FigureMain {

	Scanner sc = new Scanner(System.in);

	public void figureService() {

		searchFigurebyInt(getInt("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원)"));

	}

	/**
	 * 숫자 입력기
	 * 
	 * @param str 질문
	 * @return 숫자입력받기
	 */
	public int getInt(String str) {

		System.out.print(str);

		int a = sc.nextInt();
		sc.nextLine();

		return a;
	}

	/**
	 * 랜덤숫자 생성
	 * 
	 * @return 랜덤숫자
	 */
	public int makeRandom() {

		Random r = new Random();
		return r.nextInt(9) + 2;
	}

	/**
	 * 설정 및 출력
	 * 
	 * @param a
	 */
	public void searchFigurebyInt(int a) {

		Figure figure = new Error();

		if (a == 1) {
			figure = new Rectangle(makeRandom(), makeRandom());
		} else if (a == 2) {
			figure = new Square(makeRandom());
		} else if (a == 3) {
			figure = new Triangle(makeRandom(), makeRandom());
		} else if (a == 4) {
			figure = new Circle(makeRandom());
		}
		//IF-ELSE :: 묵시적 형변환
		
		
		if(!(figure instanceof Error)) {			
			
			figure.calculate(); //LINE :: 넓이 계산 및 어떤 도형인지 저장.
			figure.print(); //LINE :: 출력문
			//IF :: 묵시적 형변환을 사용하여 오버라이딩된 메소드 호출.
		}else {
			
			Error err = (Error)figure;
			err.errorMessage();
			//ELSE :: 명시적 형변환 활용하여 출력
		}

	}

}
