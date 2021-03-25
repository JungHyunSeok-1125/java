package kr.ac.kopo.day14;

import java.util.Random;

class A {
	private Object obj;

	public A(Object obj) {
		this.obj = obj;
	}

	public void setObject(Object obj) {
		this.obj = obj;
	}
	
	public Object getObject() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : " + obj);
		//System.out.println("obj : " + obj.toString());
		//와 동일하다.
		}
}

/**
 * 제너릭 활용
 */
class B <T> {
	private T obj;
	
	public B(T obj) {
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : " + obj);
		//System.out.println("obj : " + obj.toString());
		//와 동일하다.
		}
	
}

public class GenericMain {
	
	public static void main(String[] args) {
	
		A a01 = new A(new String("hello"));
		A a02 = new A(new Random());
		
		a01.info();
		a02.info();
		
		//System.out.println("길이 : " + a01.getObject());
		//객체가 Object형이라서 length를 사용할 수 없다.
		
		System.out.println("길이 : " + ((String)a01.getObject()).length() );
		//String형으로 형변환 후에 길이를 구할 수 있도록 해준다.

		System.out.println("랜덤 : " + ((Random)a01.getObject()).nextInt() );
		
		
		A[] arr = new A[2];
		arr[0] = a01;
		arr[1] = a02;
		
		B<String> b01 = new B<String>(new String("Hello"));
		B<Random> b02 = new B<Random>(new Random());
		
		b01.info();
		b02.info();
		
		System.out.println("길이 : " + b01.getObj().length());
		System.out.println("랜덤 : " + b02.getObj().nextInt());
		
		//b01 = new B<Random>(new Random());
		
	}

}
