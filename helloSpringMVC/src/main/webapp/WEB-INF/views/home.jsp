<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<p> <a href="${pageContext.request.contextPath}/offers">Show current offers</a>
	<p> <a href="${pageContext.request.contextPath}/createOffer">Add a new offer</a>
	
	<sec:authorize access="!isAuthenticated()">
		<p><a href="${pageContext.request.contextPath}/login">Login</a></p>
	</sec:authorize>
	
	<sec:authorize access="isAuthenticated()">
		<p><a href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a></p>
	</sec:authorize>
	
</body>
</html>