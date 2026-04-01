package exam08_Random;

import java.util.Random;

public class RamdomTest {

	public static void main(String[] args) {

		Random r = new Random();
		
		// seed 고정: 항상 동일한 값 반환
		r.setSeed(1234);
		
		int n = r.nextInt();
		float f= r.nextFloat();
		boolean b = r.nextBoolean();
		
		int n2= r.nextInt(3);
		
		System.out.println(n);
		System.out.println(f);
		System.out.println(b);
		System.out.println(n2);
				
		
	}

}
