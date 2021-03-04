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
	public List<TestDTO> testlist() {
		return testDAO.testlist();
	}

	@Override
	public void testwrite(TestDTO testDTO) {
		testDAO.testwrite(testDTO);
	}

}
