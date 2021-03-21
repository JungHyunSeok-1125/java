package kr.ac.kopo.day11.homework;

public class Square extends Rectangle {

	Square() {

	}

	Square(int a) {
		super(a, a);
	}
	
	@Override
	public void calculate() {
		this.setFig("정사각형");
		this.setArea(this.getGaro() * this.getGaro());
	}
	
	//직사각형을 상속받으면서 출력하는 메소드 같이 활용가능하여 print() 작성 X
}
