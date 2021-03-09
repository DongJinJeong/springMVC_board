<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}" />

<html>
<head>
	<title>Index</title>
</head>
<body>
	<a href="${root}/writeform">글쓰기</a><br><br>
	<a href="${root}/list">글 목록</a><br><br>
	<a href="${root}/testlist.do">글 목록 테스트</a><br><br>
	<a href="${root}/login">Ajax</a><br><br>
</body>
</html>
