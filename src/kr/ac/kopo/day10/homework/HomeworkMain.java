package kr.ac.kopo.day10.homework;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class HomeworkMain {

	public static void main(String[] args) {
		
		IceCreamShop iceCreamShop = new IceCreamShop();
		FigureMain figure = new FigureMain();
		
		System.out.println("1. 다음의 결과를 보이는 프로그램을 작성하세요");
		iceCreamShop.iceCreamService();
		
		System.out.println("2. 다음의 결과를 보이는 프로그램을 작성하세요");
		figure.figureService();
		
	}
}
