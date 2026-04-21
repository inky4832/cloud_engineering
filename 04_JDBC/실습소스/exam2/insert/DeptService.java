package exam2.insert;

public interface DeptService {
	public abstract void setDao(DeptDAO dao);
	public abstract int insert(DeptDTO dto);
}
