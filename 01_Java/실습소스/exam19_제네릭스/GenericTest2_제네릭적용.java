package exam19_제네릭스;

// 임의의 데이터를 저장할 수 있는 클래스
class Box2<T>{
	T obj;
	public void setValue(T obj) {
		this.obj= obj;
	}
	public T getValue() {
		return obj;
	}
}//end Box

public class GenericTest2_제네릭적용 {
	public static void main(String[] args) {
		//Box에 데이터저장
		// 제네릭스 사용안한 경우
		Box2 box1 = new Box2();
		box1.setValue("홍길동");
		System.out.println(box1.getValue());
		box1.setValue(10);
		System.out.println(box1.getValue());
		
		// 문자열만 저장 요구 사항 
		Box2<String> box2 = new Box2<String>();
		box2.setValue("홍길동");
//		box2.setValue(10); 
		String s = box2.getValue();
		System.out.println(s +"\t"+s.length());
		
        //정수만 저장 요구사항
		Box2<Integer> box3 = new Box2<Integer>();
		box3.setValue(10);
//	box3.setValue("홍길동");
	
	    int n = box3.getValue();
	    System.out.println(n);
		
		
	}
}
