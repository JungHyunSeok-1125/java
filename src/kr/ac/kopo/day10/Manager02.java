package kr.ac.kopo.day10;

public class Manager02 extends Employee{

	Employee[] 	empList; // 관리사원 목록
	
	Manager02(int no, String name, int salry, String grade, Employee[] empList){
		super();
		this.no = no;
		this.name = name;
		this.salary = salry;
		this.grade = grade;
		this.empList = empList;
		
	}
	
	//상위 클래스의 메소드를 하위 클래스에서 동일한 메소드 선언을 하고 내용부를 다르게 정의함.
	//메소드 오버라이딩은 이름, 매개 변수 등 모든 것이 동일한 경우에 사용할 수 있다. (접근 제한자는 다를 수 있다.)
	//@Override어노테이션 달아서 오류체크도 할 수 있다. (어노테이션 붙이고 매개변수 달면 오류 체크 해준다.)
	@Override
	void info() {
		super.info();//this가 생략되어 있다 ==> 계속 자기자신을 불러오게 되므로 super선언해서 정리
		System.out.println("============================================");
		System.out.println("\t관리사원 목록");
		System.out.println("============================================");
		for(Employee e:empList){
			e.info();
		}
		System.out.println("============================================");
	}
	
}
