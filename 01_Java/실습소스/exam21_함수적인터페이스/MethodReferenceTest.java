package exam21_함수적인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.Function;

class Test{
	public static int method(int x, int y) {
		return x+y;
	}
	public int method2(int x) {
		return x+100;
	}
	public Test() {}
	public Test(int x) {}
	
}
public class MethodReferenceTest {
	public static void main(String[] args) {

		// Method Reference (메서드 참조)
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer n, Integer n2) {
				return  Test.method(n, n2);
			}
		};
		//람다표현식
		//1. static 메서드 축약: static메서드: 클래스::메서드명
		BinaryOperator<Integer> x2 = (n,n2)->Test.method(n, n2);
		int result = x2.apply(10, 20);
		System.out.println(result);
		
		BinaryOperator<Integer> x3 = Test::method;
		int result2 = x3.apply(10, 20);
		System.out.println(result2);
		
		Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return Integer.parseInt(s);
			}
		};
		int result3 = f.apply("100");
		System.out.println(result3);
		
		//람다 표현식
		Function<String, Integer> f2 = s -> Integer.parseInt(s);
		int result4 = f2.apply("100");
		System.out.println(result4);
		
		//축약된 표현식
		Function<String, Integer> f3 = Integer::parseInt;
		int result5 = f3.apply("100");
		System.out.println(result5);
		
		
	}
}
