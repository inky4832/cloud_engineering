package exam10_method5_가변인자;

import java.util.Arrays;

class Test{
	public void a(int n) {
		
	}
    public void b(int ... n) { // 가변인자,내부적으로 배열로 관리
		System.out.println(Arrays.toString(n));
	}
}

public class VariableArgumentTest {
	
	public static void main(String[] args) {

		Test t = new Test();
		t.a(10);
		
		t.b(1);
		t.b(1,2);
		t.b(1,3,4,5);
		t.b(1,5,6,7,8,98);
		
	}
}
