package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIOMain12 {

	public static void write() {

		UserVo user = new UserVo("홍길동", 26, "010-1111-2222", "서울시 서초구");
		UserVo user2 = new UserVo("구길동", 26, "010-3333-4444", "경기도 광명시 철산동");
		UserVo user3 = new UserVo("윤길동", 26, "010-5555-6666", "서울시 송파구");

		List<UserVo> list = new ArrayList<UserVo>();
		list.add(user);
		list.add(user2);
		list.add(user3);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("iodata/objectData_1.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

			System.out.println("objectData.txt 저장완료");

			fos.close();
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

	public static void read() throws Exception {

		FileInputStream fis = new FileInputStream("iodata/objectData_1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		List<UserVo> user;

		user = (List<UserVo>) ois.readObject();

		System.out.println("파일 로드 완료...");
		System.out.println(user);

		for (int i = 0; i < user.size(); i++) {
			
			System.out.println(user.get(i));
		}

		ois.close();
		fis.close();

	}

	public static void main(String[] args) {

		try {
			write();
			read();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}

