package kr.ac.kopo.day12.inter01;

public class UseraMain {

	public static void main(String[] args) {

		SamsungTV sam = new SamsungTV();
		sam.powerOn();
		sam.volumeDown();
		sam.volumeUp();
		sam.channelDown();
		sam.channelUp();
		sam.powerOff();
		
		System.out.println("\n=======삼성TV수명이 다함========\n");
		
		LGTV lg = new LGTV();
		lg.turnOn();
		lg.soundDown();
		lg.soundUp();
		lg.channelDown();
		lg.channelUp();
		lg.turnOff();
		
	}
}
