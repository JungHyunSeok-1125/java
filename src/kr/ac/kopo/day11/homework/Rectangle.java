package kr.ac.kopo.day11.homework;

public class Rectangle extends Figure {

	Rectangle() {

	}

	Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void calculate() {
		this.setFig("직사각형");
		this.setArea(this.getGaro() * this.getSero());
	}

	@Override
	public void print() {

		System.out.println("가로 " + this.getGaro() + ", 세로 " + this.getSero() + "인 " + this.getFig() + "의 면적은 " + this.getArea() + " 입니다.");
	}

}
