package kr.ac.kopo.day14.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 오버로딩 통한 출력
 *
 */
public class PrintUtil {
	
	
	public void print(List<String> nums) {
		System.out.println(nums.toString());
	}
	
	public void print(Set<String> nums) {
		Object[] arr = nums.toArray();
		System.out.println(Arrays.toString(arr));
	}
	
	public void print(Map<Integer, Integer> nums) {
		Set<Integer> keys = nums.keySet(); // 키들만 모아둔 SET으로 저장 가능.
		Object[] arr = keys.toArray();
		System.out.println(Arrays.toString(arr));
	}
	
}
