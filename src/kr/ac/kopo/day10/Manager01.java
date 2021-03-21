package kr.ac.kopo.day10;

public class Manager01 {

	int 		no;
	String 		name;
	int 		salary;
	String 		grade;
	Employee[] 	empList; // 관리사원 목록
	
	Manager01(int no, String name, int salry, String grade, Employee[] empList){
		this.no = no;
		this.name = name;
		this.salary = salry;
		this.grade = grade;
		this.empList = empList;
		
	}
	
	void info() {
		System.out.println("사원 번호 : " + no + ", 이름 : "+ name + ", 연봉 : "+ salary + ", 직급 : "+ grade);
		System.out.println("============================================");
		System.out.println("\t관리사원 목록");
		System.out.println("============================================");
		for(Employee e:empList){
			e.info();
		}
		System.out.println("============================================");
	}
	
}
