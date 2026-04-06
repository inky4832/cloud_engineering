package exam12_상속3_super;

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
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
	}

}
