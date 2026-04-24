import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.Emp;

public class EmpMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		List<Emp> list = session.selectList("com.config.EmpMapper.findAll");
		for(Emp e: list) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------");
		List<Emp> list2 = session.selectList("com.config.EmpMapper.findByResultMap");
		for(Emp e: list2) {
			System.out.println(e);
		}
		
	    session.close();	
	}

}
