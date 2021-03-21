package kr.ac.kopo.day11.homework;

public class Circle extends Figure {

	Circle() {

	}

	Circle(int width) {
		super(width);
	}

	public void calculate() {

		this.setArea(Figure.PI * this.getGaro() * this.getGaro());
	}

	public void print() {

		System.out.println("원 넓이 : " + this.getArea());
	}

}
