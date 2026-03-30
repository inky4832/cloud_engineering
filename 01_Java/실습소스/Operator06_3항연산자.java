package exam04_연산자;

public class Operator06_3항연산자 {
	
	public static void main(String[] args) {

		//3항 연산자
		// 변수 = (조건식)?참:거짓;
		
		int num = 10;
		
		int result = (num > 2)?100:200;
		System.out.println(result);
		
		String result2 = (num > 20 )?"홍길동":"이순신";
		System.out.println(result2);
		
		//중첩가능
		int result3 = (num > 2)? (num<29)?10:20 :200;
		System.out.println(result3);
		
		
	}
}
