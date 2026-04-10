package exam21_함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/*

@FunctionalInterface
public interface Supplier<T>{
   T get();  // public abstract T get() 동일
}
*/

public class SupplierTest {
	public static void main(String[] args) {

		//Supplier 인터페이스 사용
		//익명클래스
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "홍길동";
			}
		};
		String m = s.get();
		System.out.println("Supplier:"+m);
	   //람다표현식
		Supplier<String> s2 =()->"홍길동";
		String m2 = s2.get();
		System.out.println("Supplier:"+m2);
		
		
		// DoubleSupplier: 리턴타입 double
		// 익명클래스
		DoubleSupplier s3 = new DoubleSupplier() {
			@Override
			public double getAsDouble() {
				return 3.14D;
			}
		};
		double d = s3.getAsDouble();
		System.out.println("DoubleSupplier:"+d);
		
		//람다표현식
		DoubleSupplier s4 = ()->3.14D;
		double d2 = s4.getAsDouble();
		System.out.println("DoubleSupplier:"+d2);
		
	}
}
