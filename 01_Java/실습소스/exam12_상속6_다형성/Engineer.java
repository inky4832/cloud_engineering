package exam12_상속6_다형성;

//엔지니어
// Engineer is a Employee (상속관계)
public class Engineer extends Employee{

	String skill; // 엔지니어의 기술
	
	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}
	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	
	//getter
	//setter

	//Employee의 toString 재정의
	
	@Override
	public String toString() {
		return "Engineer [skill=" + skill + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
