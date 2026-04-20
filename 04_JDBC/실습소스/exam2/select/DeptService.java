package exam2.select;

import java.util.List;

public interface DeptService {
	public abstract void setDao(DeptDAO dao);
	public abstract List<DeptDTO> list();
	
}
