package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {

	
	public LGTV() {
		System.out.println("엘지 TV 구매");
	}

	@Override
	public void powerOn() {
		System.out.println("엘지 TV 전원을 켭니다...");		
	}

	@Override
	public void powerOff() {
		System.out.println("엘지 TV 전원을 끕니다...");		
	}

	@Override
	public void channelUp() {
		System.out.println("엘지 TV 채널을 올립니다...");		
	}

	@Override
	public void channelDown() {
		System.out.println("엘지 TV 채널을 내립니다...");		
	}

	@Override
	public void soundUp() {
		System.out.println("엘지 TV 볼륨을 올립니다...");		
	}

	@Override
	public void soundDown() {
		System.out.println("엘지 TV 볼륨을 내립니다...");		
	}

	@Override
	public void mute() {
		System.out.println("엘지 TV 조용히...");		
	}


}
