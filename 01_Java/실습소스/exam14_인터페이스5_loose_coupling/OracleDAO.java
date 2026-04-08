package exam14_인터페이스5_loose_coupling;

public class OracleDAO implements DBDAO{
	
	//Oracle DB 연동
	@Override
	public void connectDB() {
		System.out.println("OracleDAO.connectOracle()");
	}
}
