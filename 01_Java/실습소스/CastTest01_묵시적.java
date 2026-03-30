package exam03_데이터형변환;

public class CastTest01_묵시적 {

	public static void main(String[] args) {

		//1. 수치형
		// byte > short > int > long > float > double  ( 작은타입이 큰타입으로 자동변경 가능 )
		
		  byte b= 10;
		  short b2 = b;  // byte 타입의 b가 short 타입으로 변경됨
		  int b3 = b2;
		  long b4= b3;
		  
		  float f = b4;
		  double f2 = f;
		  
		  //byte x = f2;  // 역은 불가
		
		// char  > int  ( 문자가 정수인 int로 자동변경 가능, 아스키코드값 )
		  char c = 'A';
		  int n = c;
		  System.out.println(n);  // 65 (외우기)
		  System.out.println(c+1);  // 문자연산이 가능함
		  
		  int x = 'A';  // 'A'문자가 자동으로 int로 저장되어 저장됨
		  
		  char c2 ='a';
		  int n2= c2;
		  System.out.println(n2); // 97 (외우기)
		  
		  
		  //2.  정수형중에서 int보다 작은 타입의 연산결과는 int 로 형변환되어 반환된다.
		  short s = 10;
          short s2 =20;
	      //short s3 = s+s2; //에러, 각각은 short지만 연산된 s+s2 결과값은 int임
	      int s4 = s+s2;

	      //3 작은타입과 큰타입이 연산하면 결과가 큰 타입으로 반환
	      int k =10;
	      double k2= 20;
//	      int k3 = k+k2; // k+k2 타입은 double로 반환
	      double k4 = k + k2;
		  
	}

}
