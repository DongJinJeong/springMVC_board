package com.spring.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.board.domain.BoardDTO;
import com.spring.board.service.BoardService;

@Controller
public class BoardController {
	
	@Inject
	private BoardService boardService;
	
	@RequestMapping("/writeform")
	public String writerform() {
		return "writeform";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardDTO boardDTO) {
		boardService.insertBoard(boardDTO);
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list() {
		return "list";
	}
	
}
