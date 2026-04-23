import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.EmpDTO;

public class EmpMain {

	public static void main(String[] args) {

		SqlSession session = MySqlSessionFactory.getSession();
		
		//저장할 데이터 생성
		List<EmpDTO> list = Arrays.asList(new EmpDTO(9001, "홍길동1", "SALESMAN", 7698, "2026-04-23", 750, 0, 30),
				new EmpDTO(9002, "홍길동2", "SALESMAN", 7698,"2026-04-23", 750, 0, 30),
				new EmpDTO(9003, "홍길동3", "SALESMAN", 7698, "2026-04-23", 750, 0, 30)
				             );
		
		int n = session.insert("com.config.EmpMapper.insertMulti", list);
		System.out.println(n+" 개가 저장됨.");
		session.commit();
		
		session.close();
	}

}
