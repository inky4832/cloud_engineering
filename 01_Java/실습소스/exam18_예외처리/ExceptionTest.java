package exam18_예외처리;

public class ExceptionTest {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");	
	    
		int n=0;
		int result = 10/n;  // java.lang.ArithmeticException 예외 클래스 이용해서 예외처리 가능
		System.out.println("결과:"+result);
		
		System.out.println("프로그램 정상종료");	
	}//end main
}
