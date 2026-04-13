package exam22_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest2_forEach {

	public static void main(String[] args) {
		
		
		// 컬렉션에서 Stream 생성
		List<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		
		List<String> list2 = Arrays.asList("이순신1","이순신2","이순신3");
		Stream<String> stream = list.stream();
		
		
		//forEach로 반복처리
		// 익명클래스
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		//람다표현식
		Consumer<String> c2 = s-> System.out.println(s);
		//메서드 참조
		Consumer<String> c3 = System.out::println;
		
		//최종 완성된 코드
		stream.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		Set<String> set = new HashSet<String>();
		set.add("홍길동1");
		set.add("홍길동1");
		set.add("홍길동2");
		
		Stream<String> stream2 = set.stream();
		//최종 완성된 코드
		stream2.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		//배열에서 Stream 생성
		String [] names = {"이순신1","이순신2","이순신3"};
		Stream<String> stream3 = Arrays.stream(names);
		stream3.forEach(System.out::println);
		
	}
}
