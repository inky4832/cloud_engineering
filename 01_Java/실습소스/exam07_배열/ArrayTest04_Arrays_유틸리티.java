package exam07_배열;

import java.util.Arrays;

public class ArrayTest04_Arrays_유틸리티 {

	public static void main(String [] args) {

		//1. 배열을 문자열로 모두 출력
		// 문법: Arrays.toString(배열);
		int [] num = {10,20,30};
		String s = Arrays.toString(num); // "[10, 20, 30]"
		
		System.out.println(Arrays.toString(num)); // "[10, 20, 30]"
		
		//2. 배열을 오름차순 정렬
		// 문법: Arrays.sort(배열);
		int [] num2 = {8,3,10,20,30,1};
		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2)); // "[1, 3, 8, 10, 20, 30]"
		
		//3. 배열을 특정값으로 채우기
		// 문법: Arrays.fill( 배열, 변경할값);
		String [] name = {"A","B","C",",D","2","E","F"};
		Arrays.fill(name, "X");
		System.out.println(Arrays.toString(name));
		
		//4. 배열을 일부분을 특정값으로 채우기'
		// 문법: Arrays.fill( 배열, 시작위치, 끝위치-1, 변경할값);
		String [] name2 = {"A","B","C",",D","2","E","F"};
		Arrays.fill(name2, 0, 3, "X");
		System.out.println(Arrays.toString(name2)); // [X, X, X, ,D, 2, E, F]
		
		
	}
}
