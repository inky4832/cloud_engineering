package exam22_StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest5_Optional {

	public static void main(String[] args) {
		

		//Optional
		
		List<Integer> list = new  ArrayList<Integer>();
		 //데이터가 존재할 때
//		list.add(30);
//		list.add(30);
		
		// int-> double
		ToDoubleFunction<Integer> f = new ToDoubleFunction<Integer>() {

			@Override
			public double applyAsDouble(Integer n) {
				// TODO Auto-generated method stub
				return n;
			}
		};
		ToDoubleFunction<Integer> f2 = n->n;
		
		//최종 코드 아님
		OptionalDouble x =list.stream().mapToDouble(n->n).average();
		System.out.println(x);
//		System.out.println(x.getAsDouble()); // double로 반환
//		System.out.println(x.orElse(0.0)); // 0.0
	   
		//최종 코드
		double avg  = list.stream().mapToDouble(n->n).average().orElse(0.0);
		System.out.println(avg);
		
	}
}



