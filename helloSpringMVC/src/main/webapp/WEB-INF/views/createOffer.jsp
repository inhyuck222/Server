<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>
	<sf:form method="get"
		action="${pageContext.request.contextPath}/doCreate"
		modelAttribute="offer">

		<table class="formtable">
			<tr>
				<td class="label">Name :</td>
				<td><sf:input class="control" path="name" type="text" /> <br/>
				<sf:errors path="name" cssClass="error"></sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">Email :</td>
				<td><sf:input class="control" path="email" type="text" /><br/>
				<sf:errors path="email" cssClass="error"></sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">Your offer :</td>
				<td><sf:textarea path="text" rows="10" cols="10"></sf:textarea><br/>
					<sf:errors path="text" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label"></td>
				<td><input class="control" value="Create Offer" type="submit" />
				</td>
			</tr>
		</table>
	</sf:form>
</body>
</html>