package exam14_인터페이스5_loose_coupling;

public class MySQLDAO implements DBDAO{

	//MySQL DB 연동
	@Override
	public void connectDB() {
		System.out.println("MySQLDAO.connectMySQL()");
	}
}
