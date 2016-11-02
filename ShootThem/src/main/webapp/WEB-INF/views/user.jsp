<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<p>give your ID</p>
	<c:out value="${user.userId}"></c:out>
</body>
</html>