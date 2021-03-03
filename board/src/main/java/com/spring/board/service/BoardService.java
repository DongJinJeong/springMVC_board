package com.spring.board.service;

import java.util.HashMap;
import java.util.List;

import com.spring.board.domain.BoardDTO;

public interface BoardService {

	void insertBoard(BoardDTO boardDTO);

	int countBoard();

	List<BoardDTO> listBoard(HashMap<String, Integer> map);

	BoardDTO readBoard(int num);

}
