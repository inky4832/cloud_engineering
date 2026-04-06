package exam12_상속5_Object_toString;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m = new Manager("홍길동", 2000, "인사");
		Engineer eng = new Engineer("유관순", 1800, "자바");
		System.out.println(m);              // 홍길동	2000	인사
		
//		System.out.println(m.getEmployee()); //홍길동	2000	인사
		
		// 참조변수 출력 
//		System.out.println(m.toString());   // 홍길동	2000	인사
			
		
	}

}
