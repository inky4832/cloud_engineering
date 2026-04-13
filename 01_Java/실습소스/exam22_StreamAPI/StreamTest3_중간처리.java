package exam22_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest3_중간처리 {

	public static void main(String[] args) {
		
		
		// 컬렉션에서 Stream 생성
		List<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("정조");
		list.add("홍장군");
		list.add("선덕여왕");
		list.add("이순신");
		list.add("정조");
		list.add("이순신");
		
		Stream<String> stream = list.stream();
		
		//모두출력
		stream.forEach(System.out::println);
		System.out.println("============================");
		
		//중간처리 - 중복제거 distinct()
//		stream = list.stream();
//		Stream<String> stream2 = stream.distinct();
//		stream2.forEach(System.out::println);
		
		list.stream()
		    .distinct()
		    .forEach(System.out::println);
		
	}
}
