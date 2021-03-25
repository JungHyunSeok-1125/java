package kr.ac.kopo.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map : key, value의 쌍으로 구성된 데이터의 집합, 키에 대한 중복 (X), 순서(X)
 *  구현 클래스 : HashMap, TreeMap
 */
public class MapMain01 {

	public static void main(String[] args) {

		// Map<Id, Password> Key: id, Value: password
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");

		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경서비스입니다.");
		System.out.println("ID를 입력하세요 : ");
		String id = sc.nextLine();

		if (!map.containsKey(id)) {
			System.out.println("입력하신 ID [" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();

		if (!map.get(id).equals(password)) {
			System.out.println("패스워드가 다릅니다");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}

		System.out.print("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword); // id에 있는 기존 데이터를 마지막에 입력받은 데이터로 교체된다.

		System.out.println("<< 전체 회원정보 출력 >> ");
		Set<Entry<String, String>> entrySet = map.entrySet();
		// import java.util.Map.Entry; 하면 Map.Entry 안써도 된다.

		for (Entry<String, String> e : entrySet) {
			System.out.println("ID : " + e.getKey() + ", PASSWORD : " + e.getValue());
		}//LINE 47 ~ 53 :: MAP 전체 정보 출력하는 방법 1 
		System.out.println();
		Set<String> keys =  map.keySet(); //키들만 모아둔 SET으로 저장 가능.
		
		for(String key : keys) {
			System.out.println("ID : " + key + ", PASSWORD : " + map.get(key));
		}//LINE 55 ~ 59 :: MAP 전체 정보 출려가는 방법 2
	}
}
