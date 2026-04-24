package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl
implements DeptService{

	DeptDAO dao;
	@Override
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<DeptDTO> findAll(){
	SqlSession session = 
				MySqlSessionFactory.getSession();
	 List<DeptDTO> list =null;
	  try {
		list = dao.findAll(session);
//	  }catch(Exception e) {
//		  e.printStackTrace();
	  }finally {
		session.close();
	  }
		return list;
	}//end finAll

	@Override
	public int insert(DeptDTO dto) {
		SqlSession session = 
				MySqlSessionFactory.getSession();
		int n = 0;
		try {
			n = dao.insert(session, dto);
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	@Override
	public int delete(int deptno) {
		SqlSession session = 
				MySqlSessionFactory.getSession();
		int n=0;
		try {
			n = dao.delete(session, deptno);
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	@Override
	public int update(HashMap<String, Object> map) {
		SqlSession session = 
				MySqlSessionFactory.getSession();
		int n=0;
		try {
			n = dao.update(session, map);
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}
}//end class
