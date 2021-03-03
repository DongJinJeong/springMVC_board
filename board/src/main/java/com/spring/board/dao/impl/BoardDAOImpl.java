package com.spring.board.dao.impl;

import java.util.HashMap;
import java.util.List;

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

	@Override
	public int countBoard() {
		return sqlSession.selectOne(ns+"countBoard");
	}

	@Override
	public List<BoardDTO> listBoard(HashMap<String, Integer> map) {
		return sqlSession.selectList(ns+"listBoard", map);
	}

	@Override
	public void updateHit(int num) {
		sqlSession.update(ns+"updateHit", num);
	}

	@Override
	public BoardDTO detailBoard(int num) {
		return sqlSession.selectOne(ns+"detailBoard", num);
	}

}
