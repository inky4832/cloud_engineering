package exam12_상속6_다형성;

public class TestEmployee {

	public static void main(String[] args) {

		// 다형성이 적용 안된 방식
		Manager m = new Manager("홍길동", 2000, "인사");
		Engineer eng = new Engineer("유관순", 1800, "자바");

		System.out.println(m);              // 홍길동	2000	인사
		System.out.println(eng);            // Engineer [skill=자바, name=유관순, salary=1800]

			
		
	}

}
