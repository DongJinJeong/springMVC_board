package com.spring.board.dao;

import java.util.HashMap;
import java.util.List;

import com.spring.board.domain.BoardDTO;

public interface BoardDAO {

	void insertBoard(BoardDTO boardDTO);

	int countBoard();

	List<BoardDTO> listBoard(HashMap<String, Integer> map);

	void updateHit(int num);

	BoardDTO detailBoard(int num);


}
