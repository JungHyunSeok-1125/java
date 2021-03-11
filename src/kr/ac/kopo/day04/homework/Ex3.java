package kr.ac.kopo.day04.homework;

/*
 
  	
 3. 달팽이가 100m 깊이의 우물에 빠졌습니다.
 	달팽이는 3M/hour 우물을 기어오릅니다.
 	달팽이도 힘들어서 미끌어 질 수 있으므로 올라간 높이가 50m미만일 때 -1M/hour
 										   50m이상일 때 -2M/hour
 	달팽이는 몇시간만에 우물을 탈출할까요?
 	
 	[1시간후] 달팽이가 올라간 총 높이 : 2M 
 	[2시간후] 달팽이가 올라간 총 높이 : 4M
 	.
 	.
 	.
 	[XX시간 후]달팽이가 올라간 총 높이 : 100M or 101M or 102M
  
 */
public class Ex3 {

	public static void main(String[] args) {

		System.out.println("달팽이가 100m 깊이의 우물에 빠졌습니다. \n 달팽이는 3M/hour 우물을 기어오릅니다.");
		System.out.println("달팽이도 힘들어서 미끌어 질 수 있으므로 올라간 높이가 50m미만일 때 -1M/hour, 50m이상일 때 -2M/hour");
		System.out.println("달팽이는 몇시간만에 우물을 탈출할까요?");
		
		int time=1;
		int height = 0;
		
		while (true) {
			height += 3;
			if (height < 50) {
				height -= 1; 	//IF::50미만 미끄러진 경우
			} else if (height >= 50) {
				height -= 2;	//IF::50이상미끄러진 경우
			}
					
			System.out.println("[" + time + "시간 후] : " + height + "M");
			time++;
			if(height >= 100) {
				break;
			}//IF :: 100이상인 경우 무한루프 탈출
		}
			
			
			

		}

	
}
