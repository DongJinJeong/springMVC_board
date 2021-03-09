<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정 폼</title>
</head>
<body>
	<a href="${root}/list/${pg}">리스트</a><br><br>
	<form action="${root}/updateboard" method="post">
		<table width="400" border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="hidden" name="num" value="${boardDTO.num}">
					<input type="text" name="title" id="title" value="${boardDTO.title}">
				</td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="writer" id="writer" value="${boardDTO.writer}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="content" id="content" row="5" cols="30">${boardDTO.content}</textarea></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd" id="pwd"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>