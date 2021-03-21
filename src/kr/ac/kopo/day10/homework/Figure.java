package kr.ac.kopo.day10.homework;

public class Figure {

	static final double PI = 3.141592;
	
	private int garo;
	private int sero;
	private double area;
	private String fig;
	
	Figure() {

	}

	public Figure(int garo) {
		this.garo = garo;
	}

	public Figure(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
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

	public String getFig() {
		return fig;
	}

	public void setFig(String fig) {
		this.fig = fig;
	}
	
	public void print()	{
		System.out.println("가로 " + this.getGaro() + "의 " + this.getFig() + "의 면적은 " + this.getArea() + " 입니다.");
	}
	
}
