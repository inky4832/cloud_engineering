package exam12_상속3_super;

// 관리자
// Manager is a Employee (상속관계)
public class Manager extends Employee{

	

	String depart; // 관리부서
	
	//생성자 작성을 generate으로 ........
	public Manager() {
		super();
	}

	public Manager(String name, int salary) {
		super(name, salary);
	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	//getter
	//setter
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}

	
}
