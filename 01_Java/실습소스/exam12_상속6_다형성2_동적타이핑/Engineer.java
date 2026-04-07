package exam12_상속6_다형성2_동적타이핑;

// 관리자
// Manager is a Employee (상속관계)
public class Engineer extends Employee{

	
	@Override
	public void a() {
		System.out.println("Engineer a()");
	}
	public void c() {
		System.out.println("Engineer c()");
	}
	
}
