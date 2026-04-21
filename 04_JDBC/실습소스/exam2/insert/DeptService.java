package exam2.insert;

public interface DeptService {
	public abstract void setDao(DeptDAO dao);
	public abstract void insert(DeptDTO dto);
}
