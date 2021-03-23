package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV {

	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle;	
	private int currentVolumeSize;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매완료...");
		modelName = "삼성TV";
		power = false;
		volumeSize = 10;
		channelNo = 3;
		muteToggle= false;
	}
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("삼성 TV 전원을 켭니다...");	
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("삼성 TV 전원을 끕니다...");		
	}

	@Override
	public void channelUp() {
		System.out.println("삼성 TV 채널을 올립니다...");		
		channelNo = ++ channelNo % 101;
		channelNo++;
		info();
	}

	@Override
	public void channelDown() {
		System.out.println("삼성 TV 채널을 내립니다...");		
		channelNo--;
		if(channelNo == 0)
			channelNo = 100;
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("삼성 TV 볼륨을 올립니다...");		
		if(muteToggle) {
			volumeSize = currentVolumeSize;
			muteToggle = false;
		} else {
			
		}
		
		if(volumeSize < TV.MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("삼성 TV 볼륨을 내립니다...");	
		if(volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void mute() {
		System.out.println("삼성 TV 조용히...");	
		
		if(muteToggle) { 
			System.out.println("음소거 해제");
			muteToggle = false;
		} else { 
			muteToggle = true;
			System.out.println("음소거 중");
			
		}
		volumeSize = TV.MIN_VOLUME_SIZE;
		info();
	}
	
	private void info() {
		System.out.println("채널 번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}

}
