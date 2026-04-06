package exam12_상속2_상속후;

public class Employee {  //  자동으로 extends Object 가 지정됨
	
	String name;
	int salary;
	
	public Employee() {
		System.out.println("Employee 생성자");
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	//getter
	//setter
	public String getEmployee() {
		return name+"\t"+salary;
	}
}
