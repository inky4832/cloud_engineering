package exam21_함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/*
@FunctionalInterface
public interface Function<T,R>{
  R apply(T t);   // public abstract R apply(T t); 동일
}
*/

public class FunctionTest {
	public static void main(String[] args) {

		//Function 인터페이스 사용
		//익명클래스
		
		Function<String, Integer> f  = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		int n = f.apply("hello");
		System.out.println("Function:" + n);
		
		//람다표현식
		Function<String, Integer> f2  = t->t.length();
		int n2 = f2.apply("hello");
		System.out.println("Function:" + n2);
		
		
		
	}
}
