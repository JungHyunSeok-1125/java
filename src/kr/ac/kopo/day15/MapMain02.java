package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;

class Member {
	
	private String name;
	private String phone;
	
	
	public Member() {
		super();
	}
	
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	
/*
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		Member mem = (Member)obj;
		//명시적 형변환
		
		if(name.equals(mem.name) && phone.equals(mem.phone)) {
			result = true;
		}
		
		return result;
	}
 */
	
	
	
	
}

class Car {
	
	private String name;
	private String id;
	
	public Car() {
		super();
	}
	
	public Car(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}

class Test {
	
	public Object[] returnTest() {		
		
		Member m = new Member();
		Car c = new Car();
		
		Object[] arr = new Object[2];
		arr[0] = m;
		arr[1] = c;
		
		return arr;
	}
	
	public Map<String, Object> returnTest2() {
		
		Member m = new Member();
		Car c = new Car();
		
		Map<String, Object> map = new HashMap<>();
		map.put("member", m);
		map.put("car", c);
		
		return map;
	}
	
	/*
	 * public MemberInfo reutrnTest3() {
	 * 
	 * Member m = new Member(); Car c = new Car();
	 * 
	 * MemberInfo info = new MemberInfo(m,c);
	 * 
	 * return info; }
	 */
}
public class MapMain02 {
	
	public static void main(String[] args) {
		
		
		Map<Member, Car> carList = new HashMap<Member, Car>();
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "12소1212"));
		carList.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "12가1212"));
		carList.put(new Member("박길동", "010-5555-6666"), new Car("그랜저", "34고3434"));
		carList.put(new Member("강길동", "010-7777-8888"), new Car("카니발", "56도5656"));

		System.out.println("등록대수 : " + carList.size());
		carList.put(new Member("홍길동", "010-8888-9999"), new Car("SM3", "25다3434"));
		System.out.println("등록대수 : " + carList.size());
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "23소1123"));
		System.out.println("등록대수 : " + carList.size());
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "62소1413"));
		//키값이 동일하므로 해당 키에서 동일한 부분이 업데이트 된다.
		//equals도 같으면서 Hash코드 값도 동일해야 된다.
		
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		
		if(m.equals(m2)) { //Object에 있는 equals는 주소 값을 비교하면서 다른 사람이 출력된다. ==> 오버라이딩 통해서 문자열 비교할 수 있도록 한다.
			System.out.println("같은 사람입니다.");
		} else {
			System.out.println("다른 사람입니다.");	
		}
	}
}
