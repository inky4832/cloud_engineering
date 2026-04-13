package exam19_제네릭스;

// 임의의 데이터를 저장할 수 있는 클래스
class Box{
	Object obj;
	
	public void setValue(Object obj) {
		this.obj= obj;
	}
	public Object getValue() {
		return obj;
	}
}//end Box

public class GenericTest {
	public static void main(String[] args) {

		//Box에 데이터저장
		Box box1 = new Box();
		box1.setValue("홍길동");
		System.out.println(box1.getValue());
		box1.setValue(10);
		System.out.println(box1.getValue());
		
		//이름만 저장해야되는 요구 발생
		Box box2 = new  Box();
		box2.setValue("홍길동");
  box2.setValue(10);              // 1.잘못된 데이터가 저장될 수 있음. 컴파일시 체크 안됨.
  						          //  실행시 체크됨
        Object obj = box2.getValue();
        String s = (String)obj;  //2. 반드시 형변환
        System.out.println(s +"\t"+ s.length());
        
		
		
	}
}
