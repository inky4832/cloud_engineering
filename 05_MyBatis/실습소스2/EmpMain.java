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
		
		//int n = session.insert("com.config.EmpMapper.insertMulti", list);
		//System.out.println(n+" 개가 저장됨.");
		//session.commit();
		
		//삭제할 데이터 생성
		List<Integer> list2 = Arrays.asList(9001,9002);
		int n2 = session.delete("com.config.EmpMapper.deleteMulti", list2);
		System.out.println(n2+" 개가 삭제됨.");
		session.commit();
		//조회할 데이터 생성
	    List<String> list3 = Arrays.asList( "TURNER", "SMITH","JONES");
		List<EmpDTO> list4 = session.selectList("com.config.EmpMapper.selectMulti", list3 );
		System.out.println(list4);
		
		//조건 하나인 경우
		 EmpDTO dto = new EmpDTO();
//		 dto.setJob("SALESMAN");
		
		 List<EmpDTO> list5 = session.selectList("com.config.EmpMapper.selectif", dto );
		 System.out.println(list5);
		 System.out.println(list5.size());
		
		
		session.close();
	}

}
