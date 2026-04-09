package exam18_예외처리;

import java.io.IOException;

class Pet{
	
	public void a() {}
	public void b() throws RuntimeException {}
	public void c() throws RuntimeException {}
}

class Cat extends Pet{
	public void a() throws Exception{}   // 부모보다 확대된 형식으로 지정 불가
	
	public void b()throws ArithmeticException {} // RuntimeException 및 하위클래스 가능

	public void c()throws IOException {}      // 같은 계열만 가능하기 때문에 지정 불가
}



public class ExceptionTest8 {
	public static void main(String[] args) {
		
	}//end main
}
