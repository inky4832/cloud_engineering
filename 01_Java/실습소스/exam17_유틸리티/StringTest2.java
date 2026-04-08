package exam17_유틸리티;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		// String 클래스의 메서드 정리
		
		String s = "helLO";
		
		int n = s.length();
		System.out.println("1. 문자열 길이:" + n);
		System.out.println("1. 문자열 길이:" + s.length()); // 5
		
		char c = s.charAt(0);
		System.out.println("2. 특정위치의 문자얻기:" + c); // h
		
		System.out.println("3. 부분열:" + s.substring(1));    // 1붙 끝까지 elLO
		System.out.println("3. 부분열:" + s.substring(1, 4)); // 1~3까지   elL
		
		System.out.println("4. 대문자로 변경:" + s.toUpperCase()); // HELLO
		System.out.println("5. 소문자로 변경:" + s.toLowerCase()); // hello
		
		String s2 = "     world     ";
		System.out.println("6. 양쪽 공백제거:" + s2.strip()); // 
		System.out.println("6. 양쪽 공백제거후 길이:" + s2.strip().length()); // 
		System.out.println("6. 왼쪽 공백제거:" + s2.stripLeading()); // 
		System.out.println("6. 오른쪽 공백제거:" + s2.stripTrailing()); //

		System.out.println("7. 문자열 연결:" + (s+"world")); // + 연결연산자 이용
		System.out.println("7. 문자열 연결:" + s.concat("world")); // concat 메서드 이용
		
		String s3 = "helLO";
		System.out.println("8. 문자열 포함여부:" + s3.contains("he") ); //  true
		System.out.println("8. 문자열 포함여부:" + s3.contains("ex") ); //  false
		
		System.out.println("9. 문자열 치환:" + s3.replace('h', 'H')); //  HelLO
		System.out.println("9. 문자열 치환:" + s3.replace("LO", "XY")); //  helXY

		System.out.println("10. 특정문자의 위치:" + s3.indexOf('e')); //  1
		System.out.println("10. 특정문자의 위치:" + s3.indexOf('x')); //  -1 ( 일치하는 문자가 없는 경우 -1 리턴 )
		
		String x = "hello";
		String x2 = new String("hello");
		String x3 = "Hello";
		
		// x와 x2가 같은 문자열이냐?
		System.out.println("11. 문자열 비교:" + (x==x2)); // false, ==는 주소값비교
		System.out.println("11. 문자열 비교:" + x.equals(x2)); // true, equals는 실제 문자열 비교
		
		System.out.println("11. 문자열 비교:" + x.equals(x3)); // false, equals는 대소문자 엄격하게 비교
		System.out.println("11. 문자열 비교(대소문자무시):" + x.equalsIgnoreCase(x3)); // true
		
		//특정 구분자로 분리
		String ss = "홍길동/이순신/유관순";
		String [] names = ss.split("/");
		System.out.println("12. 구분자로 분리:" + Arrays.toString(names)); // [홍길동, 이순신, 유관순]
		
		// 비문자열 ========> 문자열
		// ex.  10-->"10" , 3.15 --> "3.14" ,  true ---> "true"
		System.out.println("13. 비문자열 ========> 문자열:" + String.valueOf(10)); // "10"
		System.out.println("13. 비문자열 ========> 문자열:" + String.valueOf(3.14)); // "10"
		System.out.println("13. 비문자열 ========> 문자열:" + String.valueOf(true)); // "10"
		System.out.println("13. 비문자열 ========> 문자열:" + String.valueOf(new char[] {'A','B'})); // "AB"
		
		//원본 문자열의 변경 여부
		System.out.println(s);
		
	}

}
