package exam14_인터페이스;

public class MyServiceTest {

	public static void main(String[] args) {

		//MyService s = new MyService(); // 객체생성 불가
		MyServiceImpl s2 = new MyServiceImpl();
		System.out.println(s2.NUM);
		s2.a();
		s2.b();
		s2.c();
		MyService.d();
		System.out.println(MyServiceImpl.NUM);
		System.out.println(MyServiceImpl.SIZE);
		
		
	}
}
