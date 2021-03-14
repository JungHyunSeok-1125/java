package kr.ac.kopo.day07.homework;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.num = cal.getNum();
		
		System.out.println();
		
		cal.calculate(cal.num,cal.num[0]+cal.num[1], "+");
		cal.calculate(cal.num,cal.num[0]-cal.num[1], "-");
		cal.calculate(cal.num,cal.num[0]*cal.num[1], "*");
		cal.calculate(cal.num,(double)cal.num[0]/cal.num[1], "/");
		System.out.println();

		cal.prime(cal.num);
		
		
	}


	
}
