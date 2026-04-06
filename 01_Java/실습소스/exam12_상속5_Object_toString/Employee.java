package exam12_상속5_Object_toString;

public class Employee {  //  자동으로 extends Object 가 지정됨
	
	String name;
	int salary;
	
	public Employee() {
		System.out.println("Employee 생성자");
	}
	public Employee(String name, int salary) {
		System.out.println("Employee (String name, int salary)생성자");
		this.name = name;
		this.salary = salary;
	}
	//getter
	//setter
	public String getEmployee() {
		return name+"\t"+salary;
	}
}
 