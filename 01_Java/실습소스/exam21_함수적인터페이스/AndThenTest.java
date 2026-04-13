package exam21_함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;



public class AndThenTest {
	public static void main(String[] args) {

		//Function 및 Consumer 인터페이스 사용
		// 기능을 연결하는 andThen()
		
		//1. Consumer 이용
		Consumer<String> c = s-> System.out.println("first 작업:" + s);

		Consumer<String> c2 = s-> System.out.println("Second 작업:" + s);

		//한번에 두가지 작업 처리
		Consumer<String> c3 = c.andThen(c2);
		c3.accept("hello");
		
		
		//2 Function 이용
		// 첫번째 Function의 리턴타입과 두번째 Function의 타입은 반드시 일치해야 된다.
		// ex. "hello"입력받아서 길이를 구하고, 길이에  +10 더하자.
		
		Function<String, Integer> f1 = s-> s.length();
		Function<Integer, Integer> f2 = n->n+10;
		
		Function<String, Integer> f3 = f1.andThen(f2);
		int result = f3.apply("hello");
		System.out.println(result);
		
		
		
	}
}
