package exam17_유틸리티;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance(); // 싱글톤디자인 패턴
		 
		//현재 날짜 출력
		System.out.println("년도:" + cal.get(Calendar.YEAR));
		System.out.println("월:" + (cal.get(Calendar.MONTH)+1));
		System.out.println("일:" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("시:" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분:" + cal.get(Calendar.MINUTE));
		System.out.println("초:" + cal.get(Calendar.SECOND));
		
		//특정 날짜 설정
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2036, 0, 12);
		System.out.println("년도:" + cal2.get(Calendar.YEAR));
		System.out.println("월:" + (cal2.get(Calendar.MONTH)+1));
		System.out.println("일:" + cal2.get(Calendar.DAY_OF_MONTH));
		
		
		
	}
}
