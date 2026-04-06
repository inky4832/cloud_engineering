package exam12_상속1_상속전;

//엔지니어
public class Engineer {

	String name;
	int salary;
	String skill; // 엔지니어의 기술
	
	
	public Engineer() {}
	public Engineer(String name, int salary, String skill) {
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
