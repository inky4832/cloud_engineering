package exam12_상속6_다형성2_동적타이핑;

// 관리자
// Manager is a Employee (상속관계)
public class Manager extends Employee{

	String name;
	
	@Override
	public void a() {
		System.out.println("Manager a()");
	}

	public void b() {
		System.out.println("Manager b()");
	}
	
}
