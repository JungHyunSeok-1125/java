package kr.ac.kopo.day17;


class AAA extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("\t\tgo!!!!");
		}
	}
	
}

class BBB extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("\tstop!!!!");
		}
	}
	
	
}

public class ThreadMain01 {

	public static void main(String[] args) {
		AAA ta = new AAA();
		BBB tb = new BBB();
		
		ta.start();
		tb.start();
		
	}
}
