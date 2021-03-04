package com.spring.board.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dao.TestDAO;
import com.spring.board.domain.TestDTO;

@Repository
public class TestDAOImpl implements TestDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String ns = "TestMapper.";

	@Override
	public List<TestDTO> testlist() {
		return sqlSession.selectList(ns+"findAll");
	}

	@Override
	public void testwrite(TestDTO testDTO) {
		sqlSession.insert(ns+"testwrite", testDTO);
	}
	
}
