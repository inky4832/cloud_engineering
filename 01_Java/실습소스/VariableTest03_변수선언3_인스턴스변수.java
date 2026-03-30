package exam02_변수;

public class VariableTest03_변수선언3_인스턴스변수 {

	
		int size = 20; //인스턴스 변수
	
	
	public static void main(String[] args) {

		//로컬변수
		int num = 10;
		System.out.println(num);
		
		//인스턴스 변수
		//System.out.println(size);  // 객체생성전이기 때문에 사용불가
		
		VariableTest03_변수선언3_인스턴스변수  t =
				new  VariableTest03_변수선언3_인스턴스변수();
		System.out.println(t.size);  // 객체생성후이기 때문에 사용가능
		
		
	}

}
