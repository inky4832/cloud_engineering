package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public interface DeptService {
	public abstract void setDao(DeptDAO dao);
	public abstract List<DeptDTO> findAll();
	
	public abstract int insert(DeptDTO dto);
	public abstract int delete(int deptno);
	public abstract int update(HashMap<String, Object> map);
}
