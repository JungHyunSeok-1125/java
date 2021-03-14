package kr.ac.kopo.day09;

public class Employee {

	private String name;
	private int salary;
	private String grade;// 직급
	private static int totalEmployee ;//인스턴스 객체당 하니씩은 필요 없고 공유
	
	
	Employee() {
		++Employee.totalEmployee;
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		
		++Employee.totalEmployee;
	}

	void info() {
		System.out.println("사원명 : " + this.name + ", 연봉 : " + this.salary + ", 직책 : " + this.grade);
		printTotalEmployee();
	}	
	
	static void printTotalEmployee() {
		System.out.println("총 사원수 : " + Employee.totalEmployee + "명");
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getSalary(){
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getGrade(){
		return this.grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	/*
	 static는 인스턴스가 생성되기 전에 만들어 진다고 생각을 하고 사용한다.
	 static이 생성되는 시점에 다른 멤버 변수가 생성되었다는 보장이 되어있지 않으므로 static 메소드에서 멤버변수를 사용할 수 없다. 
	 하지만 non-static 메소드에서 사용하는 경우에는 무조건 static가 생성되어 있다는 보장이 있으므로 사용이 가능하다.
	 
	 프로그램 실행 ==> static 변수, static 메소드 생성 ==> 인스턴스 생성
	  
	  접근 제한자
	  
	  private ==> 내 클래스에서만 접근 가능
	  일반적인 멤버 변수
	  public ==> 누구나 접근이 가능하다
	  일반적인 메소드
	 */
}
