<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
</head>
<body>
	<h1>글목록</h1>
	<a href="/writeform">글쓰기</a>
	
	<table style="width: 660px" border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>조회수</th>
			<th>날짜</th>
		</tr>
		<c:forEach var="b" items="${list}" varStatus="status">
			<tr>
				<td>${max-status.index}</td>
				<td><a href="/read/${b.num}/${pg}">${b.title}</a></td>
				<td>${b.hit}</td>
				<td><fmt:formatDate value="${b.regdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			</tr>
		</c:forEach>
	</table>
	<div style="width: 600px" align="left">
		<c:if test="${pg <= pageSize}">
			[ <span style="color: silver">◀◀</span> ]
			[ <span style="color: silver">◀</span> ]
		</c:if>
		<c:if test="${pg > pageSize}">
			[ <a href="/list/1">◀◀</a> ]
			[ <a href="/list/${startPage-1}">◀</a> ]
		</c:if>
		<c:forEach var="i" begin="${startPage}" end="${endPage}">
			<c:if test="${pg == i}">
				[ ${i} ]
			</c:if>
			<c:if test="${pg != i}">
				[ <a href="/list/${i}">${i}</a> ]
			</c:if>
		</c:forEach>
		<c:if test="${endPage >= totalPage}">
			[ <span style="color: silver">▶</span> ]
			[ <span style="color: silver">▶▶</span> ]
		</c:if>
		<c:if test="${endPage < totalPage}">
			[ <a href="/list/${endPage+1}">▶</a> ]
			[ <a href="/list/${totalPage}">▶▶</a> ]
		</c:if>
	</div>
</body>
</html>