package kr.ac.kopo.day10.homework;

public class Circle extends Figure {

	Circle() {

	}

	Circle(int width) {
		super(width);
		this.setArea(Figure.PI * width * width);
		this.setFig("원");
	}

	
}
