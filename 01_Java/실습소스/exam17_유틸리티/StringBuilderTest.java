package exam17_유틸리티;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder 클래스의 메서드 정리
		
	     StringBuilder sb = new StringBuilder("helLO");
	     
	     System.out.println("1. 값출력: " + sb);
	     System.out.println("1. 값출력: " + sb.toString());

	     System.out.println("2. 값 추가: " + sb.append("world"));
	     System.out.println("2. 값 추가: " + sb.append(100));
	     System.out.println("2. 값 추가: " + sb.append(true));
	     System.out.println("2. 값 추가: " + sb.append('X'));
	     
	     System.out.println("3. 값 삽입: " + sb.insert(0, "홍길동"));
	     
	     System.out.println("4. 값 삭제: " + sb.deleteCharAt(0));
	     System.out.println("4. 값 삭제: " + sb.delete(0,3)); // 0~2 까지 삭제
		
	     System.out.println("5. 값 거꾸로: " + sb.reverse());	   
	    
	     //String에서도 제공된 메서드
	     System.out.println("6. 길이: " + sb.length());	   
	     System.out.println("7. 특정문자 얻기: " + sb.charAt(0));	   
	     System.out.println("8. 부분열: " + sb.substring(3));	   
	     
	     
	     String s = sb.toString();
	     System.out.println("최종사용:" + s);
	}

}
