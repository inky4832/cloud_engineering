package exam04_연산자;

public class Operator02_대입연산자 {

	public static void main(String[] args) {

		int n = 10;
		int n2 = 3;
		
		n+=n2;  // n과 n2를 더해서 다시 n에 저장.  n = n + n2 동일
		System.out.println(n+"\t"+n2);
		n-=n2;  //  n = n - n2 동일
		System.out.println(n+"\t"+n2);
		n*=n2;  //  n = n * n2 동일
		System.out.println(n+"\t"+n2);
		n/=n2;  //  n = n / n2 동일
		System.out.println(n+"\t"+n2);
		n%=n2;  //  n = n % n2 동일 
		System.out.println(n+"\t"+n2);
	}

}
