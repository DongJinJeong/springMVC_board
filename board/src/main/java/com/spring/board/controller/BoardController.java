package com.spring.board.controller;

import java.util.List;
import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "redirect:/list/1";
	}
	
	@RequestMapping("/list")
	public String list0() {
		return "redirect:/list/1";
	}
	
	@RequestMapping("/list/{pg}")
	public String list(@PathVariable(value="pg") int pg, Model model) {
		int size = 10; // 글의 수 (한 페이지 기준)
		int begin = (pg - 1) * size + 1;
		int end = begin + (size - 1);
		int count = boardService.countBoard();
		
		int totalPage = count / size + (count % size == 0 ? 0 : 1);
		int pageSize = 10; // 페이지 링크 갯수
		
		int startPage = ((pg - 1) / pageSize * pageSize) + 1;
		int endPage = startPage + (pageSize - 1);
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		int max = count - ((pg-1) * size); // 각 페이지의 최대 글번호, 103 - (1-1) * 10) => 103, 103 - (2-1) * 10) => 103 - 10 => 93
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("begin", begin);
		map.put("end", end);
		List<BoardDTO> list = boardService.listBoard(map);
		// model 에 정보들을 담는다.
		model.addAttribute("list", list);
		model.addAttribute("pg", pg);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("max", max);
		
		return "list";
	}
	
}
