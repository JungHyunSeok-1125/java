package kr.ac.kopo.day08;

public class Member {

	String name;
	int age;
	String bloodType;
	
	
	Member() {
		this("알 수 없음");
	}
	
	Member(String name){
		this(name, -1);
	}
	
	Member(String name, int age){
		this(name, age, "알 수 없음");
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
		
	/*
	Member(String name){
		this.name = name;
		//name = name이라 적으면 애매...
		//this에 대하여 ==> 지역변수와 멤버변수에 대한 구분을 할 수 있다.
		this.age = -1;
		this.bloodType = "알 수 없음";
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		this.bloodType = "알 수 없음";
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	//오버로딩을 통해서 각각 구현할 수 있다.
	*/
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("혈액형 : " + bloodType);
	}
}
