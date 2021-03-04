package com.spring.board.domain;

public class TestDTO {
	private String id;
	private String name;
	private String yn;
	private String choose;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYn() {
		return yn;
	}
	public void setYn(String yn) {
		this.yn = yn;
	}
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}
	
	@Override
	public String toString() {
		return "TestDTO [id=" + id + ", name=" + name + ", yn=" + yn + ", choose=" + choose + "]";
	}
}
