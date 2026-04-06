package exam12_상속6_다형성;

public class TestEmployee3 {

	public static void main(String[] args) {

		// 다형성이 적용된 방식
		
		// 1. 배열 활용
		
//		Employee e = new Employee("홍길동", 2000);
//		Employee e2 = new Engineer("이순신", 4300, "자바");
//		Employee e3 = new Manager("유관순", 4000, "관리");
//		Employee [] emp = { e, e2, e3 };
		
		
		Employee [] emp = { new Employee("홍길동", 2000), 
				            new Engineer("이순신", 4300, "자바"), 
				            new Manager("유관순", 4000, "관리")
							};
		
		//확장되면 Object 배열로 모든 데이터 저장이 가능해짐.
		Object [] obj = { new Employee("홍길동", 2000), 
	                      new Engineer("이순신", 4300, "자바"), 
	                      new Manager("유관순", 4000, "관리"),
	                      "Hello",
	                      20,
	                      3.14,
	                      true
		                  };
			
		
	}

}
