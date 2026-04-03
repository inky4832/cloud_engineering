package exam10_method2;

public class TestCat {

	public static void main(String[] args) {

		// 야옹이 2 암컷
		Cat c = new Cat("야옹이", 2, "암컷");
		
		// c.name="망치";  //접근불가
		c.setName("망치");
		String name = c.getName();
		System.out.println(name);
	}
}
