package exam10_method;

public class TestMethod {

	public static void main(String[] args) {

		// 객체생성
		Method m = new Method();
		
		m.method();
		
		m.method2(10, "홍길동");
		
		int result = m.method3();
		System.out.println("리턴값:"+ result);
		
		int result2 = m.method4(1, 2);
		System.out.println("리턴값:"+ result2);
	}

}
