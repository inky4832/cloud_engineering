package exam12_상속6_다형성;

public class Employee {  //  자동으로 extends Object 가 지정됨
	
	String name;
	int salary;
	
	public Employee() {
//		System.out.println("Employee 생성자");
	}
	public Employee(String name, int salary) {
//		System.out.println("Employee (String name, int salary)생성자");
		this.name = name;
		this.salary = salary;
	}
	//getter
	//setter

	//Object의 toString 재정의
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}	
}
 