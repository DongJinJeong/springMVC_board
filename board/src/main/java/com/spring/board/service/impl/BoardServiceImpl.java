package com.spring.board.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.board.dao.BoardDAO;
import com.spring.board.domain.BoardDTO;
import com.spring.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardDTO boardDTO) {
		boardDAO.insertBoard(boardDTO);
	}

	@Override
	public int countBoard() {
		return boardDAO.countBoard();
	}

	@Override
	public List<BoardDTO> listBoard(HashMap<String, Integer> map) {
		return boardDAO.listBoard(map);
	}

	@Override
	public BoardDTO readBoard(int num) {
		boardDAO.updateHit(num);
		return boardDAO.detailBoard(num);
	}

}
