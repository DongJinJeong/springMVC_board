package com.spring.board.dao.impl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.board.dao.BoardDAO;
import com.spring.board.domain.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String ns = "BoardMapper.";
	
	@Override
	public void insertBoard(BoardDTO boardDTO) {
		sqlSession.insert(ns+"insertBoard", boardDTO);
	}

}
