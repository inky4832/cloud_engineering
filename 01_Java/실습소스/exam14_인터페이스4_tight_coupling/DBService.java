package exam14_인터페이스4_tight_coupling;

public class DBService {

//	MySQLDAO dao;
	OracleDAO dao;
	
	//set메서드로 초기화
//    public void setDao(MySQLDAO dao) {
	public void setDao(OracleDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
//		dao.connectMySQL();
		dao.connectOracle();
	}
}
