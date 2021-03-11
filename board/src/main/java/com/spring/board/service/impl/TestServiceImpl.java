package com.spring.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.TestDAO;
import com.spring.board.domain.TestDTO;
import com.spring.board.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDAO testDAO;

	@Override
	public void testwrite(TestDTO testDTO) {
		testDAO.testwrite(testDTO);
	}

	@Override
	public List<TestDTO> testlist(String search_option, String keyword) {
		return testDAO.testlist(search_option, keyword);
	}

	@Override
	public TestDTO testread(String id) {
		return testDAO.testread(id);
	}

	@Override
	public void testupdate(TestDTO testDTO) {
		testDAO.testupdate(testDTO);
	}

}
