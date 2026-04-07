package exam12_상속6_다형성2_동적타이핑;

public class TestEmployee3 {

	
	//다형성 적용
	public static void method(Employee e) {
		// Manager만 출력하시오
		if ( e instanceof Manager) {
			Manager m = (Manager)e;
			m.b();
			//((Manager) e).b();
		}
	}
	
	public static void main(String[] args) {

	    method(new Manager());
	    method(new Engineer());
	    method(new Engineer());
	    method(new Manager());
	    method(new Manager());
		 
	}
}
