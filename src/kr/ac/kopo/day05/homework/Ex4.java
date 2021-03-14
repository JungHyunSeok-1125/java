package kr.ac.kopo.day05.homework;

import java.util.Arrays;

/*


 4. 2 - 100 사이의 소수를 출력 (교수자가 설명한 규칙으로 코드를 작성할 것)
	
  	
*/
public class Ex4 {

	public static void main(String[] args) {

		int[] arr = new int[99];

		for (int i = 2; i <= 100; i++) {
			arr[i - 2] = i;

		} // FOR :: 2 - 100 배열 대입

		System.out.println("100개 짜리 배열 : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != 0) {// IF :: 해당 숫자가 0이 아니라면
				for (int j = 2; j <= arr[i]; j++) {
					if (arr[i] % j != 0 || i == 0) {// FOR, IF :: 소수 찾는 과정
						for (int k = i; k < arr.length; k++) {// FOR :: 반복문 통해서 배수인지 판별 후 0으로 변환
							if (k != i && arr[k] % arr[i] == 0) {
								arr[k] = 0;
							}
						}
					}
					break;
				}
			}
		}

		System.out.println("배열 : " + Arrays.toString(arr));
		System.out.print("0 빼고 출력 : ");
		for (int i : arr) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n_______________________________________________");

		int[] nums = new int[99]; // LINE :: 2-100 숫자 저장하기 위한 배열

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 2;
		}
		
		for(int i=0;i<nums.length;i++) {
			if(arr[i] != 0) {
				for(int j = i+1;j<nums.length;j++) {
					if (nums[j] % nums[i] ==0) {
						nums[j] = 0;
					}
				}
			}
		}
		for (int i :nums) {
			System.out.print(i+" ");
		}
	/*
	 소수를 찾는 과정에서 배열 내부에 숫자에 반복문에 들어갔을 때 
	 0이 아니라면 이미 소수임이 판정되었으므로 소수 판별하는 for문을 지우도록 함.
	 */
	}

}
