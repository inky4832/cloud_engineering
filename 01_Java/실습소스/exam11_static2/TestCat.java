package exam11_static2;

public class TestCat {

	public static void main(String[] args) {

		// 야옹이 2 암컷
		Cat c = new Cat("야옹이", 200, "암컷");
	
		c.setAge(300);
		String name = c.getName();
		int age = c.getAge();
		String gender = c.getGender();
		System.out.printf("이름:%s 나이:%d 성별:%s",name, age, gender);
	}
}
