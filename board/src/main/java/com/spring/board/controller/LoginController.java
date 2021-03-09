package com.spring.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.board.domain.LoginVO;

@Controller
public class LoginController {
	
	@Autowired 
	private SqlSession sqlSession;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/loginChk", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, String> loginChk(Locale locale, Model model, HttpServletRequest request) {
		HashMap<String, String> result = new HashMap <String,String>();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		LoginVO loginVO = new LoginVO();
		
		loginVO.setId(id);
		loginVO.setPw(pw);
		
		int insertRst = sqlSession.insert("login.insert", loginVO);
		
		if ( insertRst > 0) {
			String Msg = "성공";
			String Code = "0";
			
			result.put("Msg", Msg);
			result.put("Code", Code);
			
			return result;
		} else {
			String Msg = "실패";
			String Code = "1";
			
			result.put("Msg", Msg);
			result.put("Code", Code);
			
			return result;
		}
	}
	
	@RequestMapping(value = "/loginLog", method = RequestMethod.POST)
	@ResponseBody
	public HashMap <String, Object> loginLog(Locale locale, Model model, HttpServletRequest request) {
		HashMap<String, Object> result = new HashMap <String,Object>();
		
		String id = request.getParameter("id");
		
		LoginVO loginVO = new LoginVO();
		
		loginVO.setId(id);
		
		List<LoginVO> logList = sqlSession.selectList("login.loginLogList", loginVO);
		
		if ( logList.isEmpty() ) {
			String Msg = "이력이 없습니다.";
			String Code = "1";
			
			result.put("Msg", Msg);
			result.put("Code", Code);
			
			return result;
		} else {
			String Msg = "성공";
			String Code = "0";
			
			result.put("Msg", Msg);
			result.put("Code", Code);
			result.put("data", logList);
			
			return result;
		}
	}
}
