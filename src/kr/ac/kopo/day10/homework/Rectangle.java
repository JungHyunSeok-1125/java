package kr.ac.kopo.day10.homework;

public class Rectangle extends Figure{

	Rectangle() {
		
	}
	
	Rectangle(int width, int height) {
		super(width, height);
		this.setArea(width * height);
		this.setFig("직사각형");
	}
	
	public void print()	{
		System.out.println("가로 " + this.getGaro() + ", 세로 " + this.getSero() +  "의 " + this.getFig() + "의 면적은 " + this.getArea() + " 입니다.");
	}
	
}
