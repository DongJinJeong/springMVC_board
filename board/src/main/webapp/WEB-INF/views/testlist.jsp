<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
</head>
<body>
	<a href="/testwriteform.do">글쓰기</a>
	
	<table style="width: auto" border="1">
		<tr>
			<th>코드</th>
			<th>이름</th>
			<th>사용여부</th>
			<th>선택사항</th>
		</tr>
		<c:forEach var="b" items="${list}">
			<tr>
				<td>${b.id}</td>
				<td>${b.name}</td>
				<td>${b.yn}</td>
				<td>${b.choose}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>