package kr.ac.kopo.day12.inter02;

import java.util.ArrayList;
import java.util.List;

/*
 * 다형성
 * */

public class UseraMain {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		
		TV sam = new SamsungTV();
		
		sam.powerOn();
		sam.channelDown();
		sam.channelUp();
		sam.soundUp();
		sam.soundDown();
		sam.mute();
		sam.soundUp();
		sam.powerOff();
		
		System.out.println("\n=======삼성TV수명이 다함========\n");
		
		TV lg = new LGTV();
		
		lg.powerOn();
		lg.powerOff();
		lg.channelDown();
		lg.channelUp();
		lg.soundUp();
		lg.soundDown();
		
	}
}
