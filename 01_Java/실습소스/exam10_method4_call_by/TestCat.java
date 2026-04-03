package exam10_method4_call_by;

//Cat 클래스
class Cat{
	String name;
	int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
}//end Cat

public class TestCat {
	
	// call by value: 인자값이 기본형
	public static void pdt(int n) {  // static 지정하면 객체생성없이 메서드 호출가능
		n = 20;
	}
	// call by value reference : 인자값이 참조형
	public static void rdt(Cat c) {
		c.age = 20;
	}
	public static void main(String[] args) {
		
		// call by value reference 실습
		Cat c = new Cat("야옹이", 2);
		System.out.println("변경 전 나이 :" + c.age ); // 2
		rdt(c); 
		System.out.println("변경 후 나이 :" + c.age ); // 20
		
		
		//call by value 실습
		int num =10;
		System.out.println("변경 전:" + num ); // 10
		pdt(num);
		System.out.println("변경 후:" + num ); // 10


	}
}
