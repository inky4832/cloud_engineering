package exam2.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DB 연동
//
public class DeptDAO {
	public int update(Connection con, DeptDTO dto)
	{
		int n = 0;
		PreparedStatement pstmt = null;
		try {
		  String sql = "update dept set dname=? ,  loc=?  where deptno=?";
		  pstmt = con.prepareStatement(sql);
		  pstmt.setInt(3, dto.getDeptno() );
	      pstmt.setString(1, dto.getDname());
		  pstmt.setString(2, dto.getLoc());
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
