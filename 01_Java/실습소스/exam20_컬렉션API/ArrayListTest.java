package exam20_컬렉션API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListTest {

	public static void main(String[] args) {

		// List 계열: 순서있고 중복가능

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//데이터 추가
		list.add(100);
		list.add(200);
		list.add(300);
		
		//데이터 출력 방법1- get(index), getFirst(), getLast()
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println("=========================");
		
		//데이터 출력 방법2 - toString()
		System.out.println(list); // [100, 200, 300]
		System.out.println("=========================");

		//데이터 출력 방법3 - 향상된 for문
		for(int n: list) {
			System.out.println(n);
		}
		System.out.println("=========================");
		//데이터 출력방법4: Iterator<E> iterator()
		Iterator<Integer> ite = list.iterator();
		while(ite.hasNext()) {
			int s = ite.next();
			System.out.println(s);
		}
		
		//메서드 
		//현재: [100, 200, 300]
		
		//중간삽입
		list.add(0, 900);
		
		//수정
		list.set(1, 1000);
		
		//삭제
		list.remove(0); //인덱스로 삭제
		list.remove(new Integer(1000)); //값으로 삭제
		System.out.println(list); // 
		
	}

}
