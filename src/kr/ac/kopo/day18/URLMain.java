package kr.ac.kopo.day18;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLMain {

	public static void main(String[] args) {

		try {
			URL urlObj = new URL("https://www.naver.com");
			// URL("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=java&oquery=java&tqi=h62SzlprvTossLfcQC0ssssstLK-362811");

			System.out.println("프로토콜 : " + urlObj.getProtocol());
			System.out.println("호스트 : " + urlObj.getHost());
			System.out.println("포트 : " + urlObj.getPort());
			System.out.println("경로 : " + urlObj.getPath());
			System.out.println("쿼리 : " + urlObj.getQuery());

			System.out.println("==========================================================");
			URLConnection uc = urlObj.openConnection();
			InputStream is = uc.getInputStream();
			
			//InputStream is = urlObj.openStream();// 글자 깨지므로 문자 스트림으로 변경해 준다.
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			while (true) {
				int c = isr.read();
				if (c == -1)
					break;
				System.out.print((char) c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
