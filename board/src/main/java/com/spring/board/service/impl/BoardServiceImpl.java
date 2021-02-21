package com.spring.board.service.impl;

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

}
