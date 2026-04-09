package exam17_유틸리티;

class Calendar2{
	
	private static Calendar2 cal;
	
	private Calendar2() {}
	
	public static Calendar2 getInstance() {
		if(cal==null) cal = new Calendar2();
		return cal;
	}
}


public class SingleTonDesignTest {

	public static void main(String[] args) {
		// 싱글톤 디자인 패턴 : 단 하나의 인스턴스만 만들 때 사용 ex. 지구, 대한민국,....
		
		Calendar2 cal = Calendar2.getInstance();
		Calendar2 cal2 = Calendar2.getInstance();
		System.out.println(cal == cal2);// true
		
	}

}
