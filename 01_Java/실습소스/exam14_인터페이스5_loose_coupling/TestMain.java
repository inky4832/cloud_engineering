package exam14_인터페이스5_loose_coupling;

public class TestMain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
//		service.setDao(new MySQLDAO());
		service.setDao(new OracleDAO());
		service.connect();
	}
}
