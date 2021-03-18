package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;

public class FigureMain extends Figure {

	Scanner sc = new Scanner(System.in);

	public void figureService() {

		int figure = getInt("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원)");
		
		Figure fig;

		if (figure == 1) {
			fig = new Figure(makeRandom(), makeRandom());
		} else if (figure == 2) {
			fig = new Figure(makeRandom());
		} else if (figure == 3) {
			fig = new Figure(makeRandom());
			fig.setArea(fig.getArea() / 2);
		} else {
			fig = new Figure(makeRandom(), Figure.PI);
		}

		print(fig);
	}

	public int getInt(String str) {

		System.out.print(str);

		int a = sc.nextInt();

		return a;
	}

	public int makeRandom() {

		Random r = new Random();
		return r.nextInt(10) + 1;
	}

	public void print(Figure a) {
		System.out.println("가로 " + a.getGaro() + "의 도형의 면적은 " + a.getArea());

	}

}
