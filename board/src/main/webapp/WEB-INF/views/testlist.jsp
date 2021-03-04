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
	
	<form action="/testlist.do" method="post" name="search">
	    <select name="search_option">
	        <option value="id"
				<c:if test="${map.search_option == 'id'}">selected</c:if>
	   		>코드</option>
	
	        <option value="name" 
				<c:if test="${map.search_option == 'name'}">selected</c:if>
	        >이름</option>
	
	        <option value="choose" 
				<c:if test="${map.search_option == 'choose'}">selected</c:if>
	        >선택사항</option>
	
	        <option value="all" 
				<c:if test="${map.search_option == 'all'}">selected</c:if>
	        >코드+이름+선택사항</option>
	    </select>
	    <input name="keyword" value="${map.keyword}">
	    <input type="submit" value="조회">
	</form>
	
	
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