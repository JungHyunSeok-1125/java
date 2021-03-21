package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;


/**
 * printArea()
 * getArea()
 * 계산하는 메소드 다시 작성
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
	 * @param str 질문
	 * @return 숫자입력받기
	 */
	public int getInt(String str) {

		System.out.print(str);

		int a = sc.nextInt();

		return a;
	}

	/**
	 * 랜덤숫자 생성
	 * @return 랜덤숫자
	 */
	public int makeRandom() {

		Random r = new Random();
		return r.nextInt(9) + 2;
	}


	/**
	 * 설정 및 출력
	 * @param a
	 */
	public void searchFigurebyInt(int a) {


		if (a == 1) {

			Rectangle rectangle = new Rectangle(makeRandom(),makeRandom());
			rectangle.print();//LINE :: 오버라이딩으로 출력 (가로, 세로 유무)
			
		} else if (a == 2) {

			Square square = new Square(makeRandom());
			square.print();
			
		} else if (a == 3) {

			Triangle triangle =  new Triangle(makeRandom(), makeRandom());
			triangle.print();//LINE :: 오버라이딩으로 출력
		} else {

			Circle circle = new Circle(makeRandom());
			circle.print();
			
		}

	}

}
