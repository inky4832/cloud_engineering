package exam12_상속2_상속후;

//엔지니어
// Engineer is a Employee (상속관계)
public class Engineer extends Employee{

	String skill; // 엔지니어의 기술
	
	public Engineer() {}
	public Engineer(String name, int salary, String skill) {
		System.out.println("Enginner 생성자");
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	
	//getter
	//setter
	
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
	}

}
