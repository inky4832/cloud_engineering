package exam2.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

// 로직처리 + 트랜잭션처리( con.commit() )
// Connection 얻어서 DeptDAO와 연동
public class DeptServiceImpl implements DeptService {

	//인스턴스 변수
	 String driver = "com.mysql.cj.jdbc.Driver"; // 핵심이 되는 클래스명
     String url = "jdbc:mysql://localhost:3306/testdb";
     String userid ="root";
     String passwd = "1234";
     
     //DeptDAO 설정
     DeptDAO dao;
     // set메서드로 초기화 ( main에서 설정함)
     @Override 
     public void setDao(DeptDAO dao) {
    	 this.dao = dao;
     }
     
     //기본생성자에서 드라이브 로딩처리
 	public DeptServiceImpl() {
 	       try {
 				Class.forName(driver);
 			} catch (ClassNotFoundException e) {
 				e.printStackTrace();
 			}
	}//end 생성자
     
	@Override
	public List<DeptDTO> list() {
		List<DeptDTO> list = null;
		Connection con = null;
		 try {
			con = DriverManager.getConnection(url, userid, passwd);
			//DeptDAO연동해서 list()호출
			list = dao.list(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;  // DeptSelectMain에 리턴
	}//end list()


}//end class
