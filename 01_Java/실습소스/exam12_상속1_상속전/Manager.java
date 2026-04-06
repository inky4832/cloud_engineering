package exam12_상속1_상속전;

// 관리자
public class Manager {

	String name;
	int salary;
	String depart; // 관리부서
	
	public Manager() {}

	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	//getter
	//setter
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}
}
