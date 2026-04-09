package exam17_유틸리티;

import java.util.Arrays;

public class EnumTest {

	public static void main(String[] args) {
		
		//switch 문 사용 예
		
		Day day = Day.SUNDAY;
		
		switch (day) {
		case SUNDAY: System.out.println("일요일");break;
		case MONDAY: System.out.println("월요일");break;
		case SATURDAY: System.out.println("토요일");break;

		default:System.out.println("default");break;
		}
		// Day의 enum의 메서드
		System.out.println("name:" + day.name());
		System.out.println("ordinal:" + day.ordinal());
		Day[] days = day.values();
		System.out.println(Arrays.toString(days));
	}
}
