package exam06_제어문;
public class Statement10_중첩반복문 {

	public static void main(String[] args) {

		// 구구단 출력
		/*
		 *    2  * 1 = 2
		 *    2  * 2 = 4
		 *    2  * 3 = 6
		 *    
		 *    9 *  1 = 9
		 *    ..
		 *    9  * 9 = 81
		 * 
		 */
		
		for(int dan=2; dan <=9 ; dan++) {
		  for(int n = 1; n <= 9; n++) {
			 System.out.printf("%d * %d = %d \n", dan, n, (dan*n));
		  }
		}
		
	}
}
