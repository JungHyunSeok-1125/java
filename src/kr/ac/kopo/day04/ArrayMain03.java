package kr.ac.kopo.day04;

public class ArrayMain03 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[2][4];
		
		System.out.println("arr : " + arr);//이차원 배열의 주소값
		System.out.println("arr.length : " + arr.length); //이차원 배열의 주소값
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] : " + arr[i]); //주소값 출력
		}

		int[][] arr2 = new int[2][];
		arr2[0] = new int[5];
		arr2[1] = new int[3];
		System.out.println("arr2 : " + arr2);//이차원 배열의 주소값
		System.out.println("arr2.length : " + arr2.length); //이차원 배열의 주소값
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]); //주소값 출력
			System.out.println("arr2["+i+"].length : " + arr2[i].length); 
		}
	}
}
