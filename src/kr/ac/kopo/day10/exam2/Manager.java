package kr.ac.kopo.day10.exam2;

public class Manager extends Employee{

	Employee[] empList;

	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	
}

