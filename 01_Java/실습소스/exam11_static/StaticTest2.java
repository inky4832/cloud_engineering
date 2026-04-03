package exam11_static;

class Count{
	
	int num; // 인스턴스
	static int count; // static 변수
	public Count() {
		num++;
		count++;
	}
}

public class StaticTest2 {
	public static void main(String[] args) {
		
		System.out.println(Count.count);
		//Count를 객체생성 시 생성횟수를 카운트하자.
		Count c1 =new Count();
//		System.out.println(c1.num);
		System.out.println(Count.count);
		Count c2 =new Count();
//		System.out.println(c2.num);
		System.out.println(Count.count);
	}
}
