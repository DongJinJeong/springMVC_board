package com.spring.board.dao;

import java.util.List;

import com.spring.board.domain.TestDTO;

public interface TestDAO {

	void testwrite(TestDTO testDTO);

	List<TestDTO> testlist(String search_option, String keyword);

	TestDTO testread(String id);

	void testupdate(TestDTO testDTO);

}
