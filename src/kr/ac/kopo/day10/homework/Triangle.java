package kr.ac.kopo.day10.homework;

public class Triangle extends Figure {

	Triangle() {

	}

	Triangle(int width, int height) {
		super(width, height);
		this.setArea((double)(width * height) / 2);
		this.setFig("삼각형");
	}
	
	public void print() {
		System.out.println("가로 " + this.getGaro() + ", 세로 " + this.getSero() +  "의 " + this.getFig() + "의 면적은 " + this.getArea() + " 입니다.");
	}
	
}
