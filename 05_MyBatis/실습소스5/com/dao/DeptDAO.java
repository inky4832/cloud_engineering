package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.DeptDTO;

public class DeptDAO {

	//전체 Dept 목록 반환
	public List<DeptDTO> findAll(SqlSession session){
		List<DeptDTO> list = 
				session.selectList("com.config.DeptMapper.findAll");
		return list;
	}
	//저장
	public int insert(SqlSession session, DeptDTO dto) {
		int n = session.insert("com.config.DeptMapper.insert", dto);
		return n;
	}
	//삭제
	public int delete(SqlSession session, int deptno) {
		int n = session.delete("com.config.DeptMapper.delete", deptno);
		return n;
	}
	//수정
	public int update(SqlSession session, HashMap<String, Object> map) {
		int n = session.update("com.config.DeptMapper.update", map);
		return n;
	}
}
