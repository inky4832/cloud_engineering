package p4;

import p2.Parent;
import p3.Parent2;

public class Child2 {

	public void method() {
		//다른 클래스에서 접근
		Parent2 p = new Parent2();
		System.out.println(p.n1);
//		System.out.println(p.n2);
//		System.out.println(p.n3);
//		System.out.println(p.n4); //private 접근불가
	}
}
//상속 관계
class Child3 extends Parent2{
	
	public void method() {
		System.out.println(n1);
		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4); //private 접근불가
	}
}