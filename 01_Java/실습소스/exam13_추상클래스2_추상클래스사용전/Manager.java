package exam13_추상클래스2_추상클래스사용전;

public class Manager extends Employee {

	String depart;

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	// name과 salary, depart를 리턴하는 메서드가 필요하다고 order가 옴
//	public String getNameSalaryDepart() {
//		return depart+"\t"+name+"\t"+salary;
//	}
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return depart+"\t"+name+"\t"+salary;
	}
}
