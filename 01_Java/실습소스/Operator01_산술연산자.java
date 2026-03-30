package exam04_연산자;

public class Operator01_산술연산자 {

	public static void main(String[] args) {

		int n = 10;
		int n2 = 3;
		
		//연산결과를 변수에 저장 가능
		int sum = n + n2;
		System.out.println(sum);
		
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		System.out.println(n/n2);
		System.out.println(n%n2);
		
		//추가 정리
		System.out.println(10/3);
		System.out.println(10/3.0);
	}

}
