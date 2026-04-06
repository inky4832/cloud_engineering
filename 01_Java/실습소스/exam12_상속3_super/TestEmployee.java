package exam12_상속3_super;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m = new Manager("홍길동", 2000, "인사");
		Engineer eng = new Engineer("유관순", 1800, "자바");
		
		System.out.println(m.getManager());
		System.out.println(eng.getEngineer());
		

	}

}
