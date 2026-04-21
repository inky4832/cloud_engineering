package exam2.insert;

public class DeptInsertMain {

	public static void main(String[] args) {
		// 사용자가 deptno,dname,loc 입력함
		int deptno = 52;
		String dname = "개바";
		String loc = "서울";
		
		DeptDTO dto = new  DeptDTO(deptno, dname, loc);
//		 if(n>=1) System.out.println("저장성공");
	}

}
