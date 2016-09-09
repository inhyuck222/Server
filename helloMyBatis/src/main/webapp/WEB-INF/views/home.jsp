<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>book list</h1>
	<table border="1">
		<tr align="center">
			<td width="100px">아이디</td>
			<td width="100px">이름</td>
			<td width="100px">이메일</td>
			<td width="100px">정보</td>
		</tr>
		<c:forEach var="offer" items="${offers}">
			<tr align="center">
				<td>${offer.id}</td>
				<td>${offer.name}</td>
				<td>${offer.email}</td>
				<td>${offer.text}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>