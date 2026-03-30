package exam05_scanner;
import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		
		System.out.println("age:" + age);
		System.out.println("name:" + name);

		scan.close();
	}

}
