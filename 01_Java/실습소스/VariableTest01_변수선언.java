package exam02_변수;

public class VariableTest01_변수선언 {

	public static void main(String[] args) {

		// 저장할 데이터:  홍길동  20  서울  180.3   67.4  결혼여부?
		
		//1. 변수 선언
		String name;  // 4byte 크기 영역 확보
		int age;      // 4byte 크기 영역 확보
		String address; // 4byte 크기 영역 확보
		float height;   // 4byte 크기 영역 확보
		double weight;  // 8byte 크기 영역 확보
		boolean isMarried; // 1byte 크기 영역 확보
		
		
		//2. 변수 초기화
		name = "홍길동";
		age = 20;
		address = "서울";
		height = 183.3F;   //  4byte 크기 = 8byte값 불가. 따라서 183.3F 지정
		weight = 67.4;     //  8byte 크기 = 8byte값 가능
		isMarried = false;
		
		//3. 변수 사용
		// 출력 포맷:  이름: 홍길동
		System.out.println("이름:"+ name); // 문자열 연결
		System.out.printf("이름:%s \n", name); 
		System.out.printf("나이:%d \n", age); 
		System.out.printf("주소:%s \n", address); 
		System.out.printf("키:%.2f \n", height); 
		System.out.printf("체중:%.2f \n", weight); 
		System.out.printf("결혼?:%b \n", isMarried); 
		
		//4. 변수값 변경
		age = age + 1;
		System.out.printf("내년 나이:%d \n", age); 
		
	}

}
