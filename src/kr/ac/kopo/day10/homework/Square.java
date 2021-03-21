package kr.ac.kopo.day10.homework;

public class Square extends Figure {

	Square() {

	}

	Square(int a) {
		super(a);
		this.setArea(a * a);
		this.setFig("정사각형");
	}
}
