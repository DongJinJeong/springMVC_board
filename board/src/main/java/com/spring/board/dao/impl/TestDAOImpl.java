package com.spring.board.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public void testwrite(TestDTO testDTO) {
		sqlSession.insert(ns+"testwrite", testDTO);
	}

	@Override
	public List<TestDTO> testlist(String search_option, String keyword) {
		Map<String, String> map = new HashMap<String, String>();
        map.put("search_option", search_option);
        map.put("keyword", keyword);
		return sqlSession.selectList(ns+"findAll", map);
	}

	@Override
	public TestDTO testread(String id) {
		return sqlSession.selectOne(ns+"read", id);
	}

	@Override
	public void testupdate(TestDTO testDTO) {
		sqlSession.update(ns+"update", testDTO);
	}
	
}
