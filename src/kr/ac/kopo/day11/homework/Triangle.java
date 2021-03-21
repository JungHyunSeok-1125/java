package kr.ac.kopo.day11.homework;

public class Triangle extends Figure {

	Triangle() {

	}

	Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void calculate() {
		this.setFig("삼각형");
		this.setArea(this.getGaro() * this.getSero() / 2);
	}

	@Override
	public void print() {

		System.out.println("가로 " + this.getGaro() + ", 세로 " + this.getSero() + "인 " + this.getFig() + "의 면적은 " + this.getArea() + " 입니다.");
	}

}
