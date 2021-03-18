package kr.ac.kopo.day10.homework;

public class Figure {

	static final double PI = 3.141592;
	
	private int garo;
	private int sero;
	private double area;
	
	Figure() {

	}

	public Figure(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		this.area = garo * sero;
	}
	
	public Figure(int garo) {
		this.garo = garo;
		this.area = garo * garo;
	}
		
	public Figure(int garo, double a) {
		this.garo = garo;
		this.area = garo * garo * a;
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	

}
