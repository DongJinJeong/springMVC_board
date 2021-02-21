package com.spring.board.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
	private int num;
	private String title;
	private String writer;
	private String pwd;
	private String content;
	private Date regdate;
	private int hit;
}
