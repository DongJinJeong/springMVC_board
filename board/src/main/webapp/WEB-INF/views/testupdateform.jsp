<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 글 수정 폼</title>
</head>
<body>
	<a href="/testlist.do">글목록</a>
	
	<form action="/testupdate.do" method="post">
		<table style="width: auto" border="1">
			<tr>
				<th>코드</th>
				<td><input type="hidden" name="id" value="${read.id}">${read.id}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="${read.name}"></td>
			</tr>
			<tr>
				<th>사용여부</th>
				<td>
					<input type='checkbox' name='yn' value='Y' />Y
		 			<input type='checkbox' name='yn' value='N' />N
				</td>
			</tr>
			<tr>
				<th>선택사항</th>
				<td>
					<select name="choose">
	    				<option value="a">아메리카노</option>
	    				<option value="b">카페라테</option>
	    				<option value="c">카페오레</option>
	    				<option value="d">에스프레소</option>
					</select>
				</td>
			</tr>
		</table>
		<input type="submit" value="저장">
	</form>
</body>
</html>