package kr.ac.kopo.day15;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIoMain01 {

	public static void main(String[] args) /* throws Exception */ {
		
		System.out.println("입력을하세요. ctrl + z 입력하시면 종료됩니다.");
		
	//	InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(System.in);
	//	바이트로 날아가는 것을 문자로 잡아주는 느낌이라고 생각한다.
		try {
			while (true) {				
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			}
			   
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		InputStream is = System.in;//표준 입력장치 => 바이트 단위로 데이터를 받는다.
		
		while (true) {
			//키보드는 버퍼 단위로 정보를 받고 한번에 우르르르 출력해준다.
			int c = is.read();//하나씩(한 바이트씩)읽어온 값.
			//숫자로 리턴된다. (아스키 코드값으로)
			//한글은 유니코드라서 쓸 수가 없다. 한글 인식하기 위해서는 바이트로 들어온 것 2바이트씩 묶어서 문자스트링으로 인식
			//변환해 주는 클래스를 InputStreamReader
			
			if(c == -1) break; //종료는 라인의 첫 열에서 입력해 주어야 한다.
			System.out.print((char)c);
		}
		 */
		
	}
}
