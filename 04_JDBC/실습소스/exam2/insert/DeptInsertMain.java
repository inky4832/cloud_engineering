package exam2.insert;

import java.util.Scanner;

public class DeptInsertMain {

	public static void main(String[] args) {
	
		DeptService service  = new DeptServiceImpl();
		service.setDao(new DeptDAO());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("부서번호를 입력하시오");
		int deptno = scan.nextInt();
		System.out.println("부서명 입력하시오");
		String dname = scan.next();
		System.out.println("부서위치 입력하시오");
		String loc = scan.next();
		
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		int n = service.insert(dto);
		if(n>=1)System.out.println("저장성공");
		
	}
}
