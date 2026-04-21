package exam2.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DB 연동
//
public class DeptDAO {

	public int insert(Connection con, DeptDTO dto) {
		int n = 0;
		PreparedStatement pstmt = null;
		try {
		  String sql = "insert into dept (deptno,dname,loc) values (?,?,?)";
		  pstmt = con.prepareStatement(sql);
		  pstmt.setInt(1, dto.getDeptno() );
	      pstmt.setString(2, dto.getDname());
		  pstmt.setString(3, dto.getLoc());
		  n = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				 if(pstmt !=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// try~catch~finally
		return n;
	}//end insert
}//end class
