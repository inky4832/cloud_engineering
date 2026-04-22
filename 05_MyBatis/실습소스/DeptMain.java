import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class DeptMain {

	public static void main(String[] args) {

		SqlSession session = 
				MySqlSessionFactory.getSession();
	    //단일행
		DeptDTO dto = session.selectOne("findByDeptno", 20);
		System.out.println(dto);
		//----------------------------------
		DeptDTO data = new DeptDTO();
		data.setDeptno(10);
		data.setDname("ACCOUNTING");
		
		DeptDTO dto2 = session.selectOne("findByDeptnoAndDname", data);
		System.out.println(dto2);
		//-------------------------------------------------------------
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", 10);
		map.put("y", "ACCOUNTING");
		
		DeptDTO dto3 = session.selectOne("findByDeptnoAndDnameMap", map);
		System.out.println(dto3);

		//자원반납
		session.close();
	}

}
