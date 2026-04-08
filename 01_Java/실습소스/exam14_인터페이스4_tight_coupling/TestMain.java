package exam14_인터페이스4_tight_coupling;

public class TestMain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
//		service.setDao(new MySQLDAO());
		service.setDao(new OracleDAO());
		service.connect();
	}
}
