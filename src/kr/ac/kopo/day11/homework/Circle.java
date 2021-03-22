package kr.ac.kopo.day11.homework;

public class Circle extends Figure {

	Circle() {

	}

	Circle(int width) {
		super(width);
	}

	@Override
	public void calculate() {
		this.setFig("원");
		this.setArea(Figure.PI * this.getGaro() * this.getGaro());
	}

	@Override
	public void print() {
		System.out.println("반지름이 " + this.getGaro() + "의 " + this.getFig() + "의 면적은 " + this.getArea() + " 입니다.");
	}

}
 