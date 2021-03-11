package com.spring.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.board.domain.TestDTO;
import com.spring.board.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/testlist.do")
	public String testlist(@RequestParam(defaultValue="id") String search_option, @RequestParam(defaultValue="") String keyword, Model model) {
		List<TestDTO> list = testService.testlist(search_option, keyword);
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
	
	@RequestMapping("/testread.do/{id}")
	public String testread(@PathVariable("id") String id, Model model) {
		TestDTO testDTO = testService.testread(id);
		model.addAttribute("read", testDTO);
		return "testread";
	}
	
	@RequestMapping("/testupdateform.do/{id}")
	public String testupdateform(@PathVariable("id") String id, Model model) {
		TestDTO testDTO = testService.testread(id);
		model.addAttribute("read", testDTO);
		return "testupdateform";
	}
	
	@RequestMapping(value="/testupdate.do", method=RequestMethod.POST)
	public String testupdate(TestDTO testDTO) {
		testService.testupdate(testDTO);
		return "redirect:/testlist.do";
	}
	
}
