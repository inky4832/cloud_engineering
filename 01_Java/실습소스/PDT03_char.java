package exam01_기본형;

public class PDT03_char {

	public static void main(String[] args) {
		/*
		 *  char (2byte)
		 *   
		 *     - 반드시 한글자 처리
		 *     - ''
		 *     - escape 문자 지원
		 *        \n
		 *        \t
		 *        \"
		 *        \'
		 *        \\ <== 경로설정시 주로사용 ex.  c:\\temp ===> c:\temp
		 * 
		 */
		
		System.out.println('남');  // char 관리
		System.out.println('여');
//		System.out.println('여자');
		System.out.println("여자"); // 여러 글자(문자열)는 "" 사용	, String 클래스가 관리
		
		System.out.println("================================");
		// escape 문자
		System.out.println("안녕하세요");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\"하세요");
		System.out.println("안녕\'하세요");
		System.out.println("안녕\\하세요");
		System.out.println("c:\\amp");
		System.out.print('\t');
		System.out.print("adasdfs");
		
		
		
	}

}
