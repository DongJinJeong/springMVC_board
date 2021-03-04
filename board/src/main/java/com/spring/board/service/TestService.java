package com.spring.board.service;

import java.util.List;

import com.spring.board.domain.TestDTO;

public interface TestService {

	List<TestDTO> testlist();

	void testwrite(TestDTO testDTO);

}
