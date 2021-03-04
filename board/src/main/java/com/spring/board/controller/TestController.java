package com.spring.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.board.domain.TestDTO;
import com.spring.board.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/testlist.do")
	public String testlist(Model model) {
		List<TestDTO> list = testService.testlist();
		model.addAttribute("list", list);
		return "testlist";
	}
	
	@RequestMapping("/testwriteform.do")
	public String testwriteform() {
		return "testwriteform";
	}
	
	@RequestMapping(value="/testwrite.do", method=RequestMethod.POST)
	public String testwrite(TestDTO testDTO) {
		testService.testwrite(testDTO);
		return "redirect:/testlist.do";
	}
	
}