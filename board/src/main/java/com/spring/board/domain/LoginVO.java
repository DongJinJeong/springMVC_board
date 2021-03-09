package com.spring.board.domain;

import java.sql.Date;

public class LoginVO {
	private int member_num;
	private String id;
	private String pw;
	private Date regDate;
	
	public int getMember_num() {
		return member_num;
	}
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "LoginVO [member_num=" + member_num + ", id=" + id + ", pw=" + pw + ", regDate=" + regDate + "]";
	}
	
}
