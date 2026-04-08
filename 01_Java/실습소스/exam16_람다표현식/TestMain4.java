package exam16_람다표현식;


//인터페이스
@FunctionalInterface
interface Flyer4{
  public abstract String fly();
}

public class TestMain4 {

	public static void main(String[] args) {

		//익명클래스
		Flyer4 f = new Flyer4() {
			@Override
			public String fly() {
				return "hello";
			}
		};
		String s = f.fly();
		System.out.println(s);

		//람다표현식 ( =>(자바스크립트), ->(자바) ) 
		
		Flyer4 f2 =()->{return "hello";};
		
		Flyer4 f3 =()->"hello"; // return문장 하나만 존재하면 {}와 return 생략가능
		String s3 = f3.fly();
		System.out.println(s3);
		
	}//end main
}
