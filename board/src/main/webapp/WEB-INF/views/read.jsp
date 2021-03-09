<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글읽기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="${root}/resources/js/main.js"></script>
</head>
<body>
	<a href="/list/${pg}">리스트</a><br><br>
	<table style="width: 660px" border="1">
		<tr>
			<th width="30%">제목</th>
			<td>${b.title}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${b.writer}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${b.hit}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${b.content}</td>
		</tr>
	</table><br>
	<form action="/updateform.do/${b.num}/${pg}">
		<input type="submit" value="수정">
	</form>
	<form action="/delete.do/${b.num}" method="post">
		<input type="submit" value="삭제">
	</form>
</body>
</html>