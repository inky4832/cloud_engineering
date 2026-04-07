// default 패키지

import p1.MyHello;

public class MyHelloTest {

	public static void main(String[] args) {

		//1. import 없이 패키지 직접 지정하는 방법
		p1.MyHello h = new p1.MyHello();
		h.method();
		p1.MyHello h2 = new p1.MyHello();
		h2.method();
		p1.MyHello h3 = new p1.MyHello();
		h3.method();
		
		//2. import 사용
		MyHello h4= new MyHello();
		h4.method();
		MyHello h5= new MyHello();
		h5.method();
		
	}
}
