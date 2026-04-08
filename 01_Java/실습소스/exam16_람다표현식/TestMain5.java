package exam16_람다표현식;


//인터페이스
@FunctionalInterface
interface Flyer5{
  public abstract int fly(int n , int n2);
}

public class TestMain5 {

	public static void main(String[] args) {

		//익명클래스
		Flyer5 f = new Flyer5() {
			@Override
			public int fly(int n , int n2) {
				return n+n2;
			}
		};
		int n = f.fly(10,20);
		System.out.println(n);

		//람다표현식 ( =>(자바스크립트), ->(자바) ) 
		Flyer5 f2 =(int x , int x2)->{return x+x2;};

		Flyer5 f3 =(x , x2)->{return x+x2;};
		
		Flyer5 f4 =(x , x2)->x+x2;
		int n4 = f4.fly(10,20);
		System.out.println(n4);
		
	}//end main
}
