package exam06_제어문;
public class Statement04_switch문 {

	public static void main(String[] args) {

		int num=100;
		
		switch(num) {
		
		case 5: System.out.println("5"); break;
		case 10: System.out.println("10"); break;
		case 15: System.out.println("15"); break;
		case 20: System.out.println("20"); break;
		default: System.out.println("default");
		}//end switch
		
		char c='남';
		switch(c) {
		case '남': System.out.println("남"); break;
		case '여': System.out.println("여"); break;
		default: System.out.println("default");
		}//end switch
		
		String name="A";
		switch(name) {
		case "A": System.out.println("A"); break;
		case "B": System.out.println("B"); break;
		default: System.out.println("default");
		}//end switch
	}
}
