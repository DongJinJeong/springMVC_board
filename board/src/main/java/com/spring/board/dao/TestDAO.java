package com.spring.board.dao;

import java.util.List;

import com.spring.board.domain.TestDTO;

public interface TestDAO {

	List<TestDTO> testlist();

	void testwrite(TestDTO testDTO);

}
