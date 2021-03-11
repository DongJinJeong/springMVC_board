<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 글 내용</title>
</head>
<body>
	<a href="/testlist.do">글목록</a>
	
	<table style="width: auto" border="1">
		<tr>
			<th>코드</th>
			<td>${read.id}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${read.name}</td>
		</tr>
		<tr>
			<th>사용여부</th>
			<td>${read.yn}</td>
		</tr>
		<tr>
			<th>선택사항</th>
			<td>${read.choose}</td>
		</tr>
	</table>
	<a href="/testupdateform.do/${read.id}">수정</a>
</body>
</html>