<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="resources/js/main.js"></script>
</head>
<body>
	<h1>글쓰기</h1>
	<a href="/list">글목록</a><br><br>
	<form action="write" method="post" name="writeform" id="writeform">
		<table width="400" border="1">
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" id="title"></td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="writer" id="writer"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="content" id="content" row="5" cols="30"></textarea></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd" id="pwd"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="쓰기" id="btn_write"> <!-- type을 "submit"으로 안하고 js에서 "submit"한다. -->
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>