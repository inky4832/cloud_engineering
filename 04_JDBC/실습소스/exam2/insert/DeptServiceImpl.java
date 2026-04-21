package exam2.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//로직처리 +  트랜잭션 처리 담당
public class DeptServiceImpl implements DeptService {

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
     
	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end 생성자
    @Override 
	public int insert(DeptDTO dto) {
    	int n = 0;
		Connection con = null;
	     try {
			 con = DriverManager.getConnection(url, userid, passwd);
			 n = dao.insert(con, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				 if(con !=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// try~catch~finally
	     return n;
	}//end insert
}//end class
