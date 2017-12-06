<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Spring 4 Security Example</title>
</head>
<body>
	<h3>Spring 4 Security Example</h3>
	<font color="red"> ${SPRING_SECURITY_LAST_EXCEPTION.message} </font>
	<c:url var="loginUrl" value="/login" />
	<form action="${loginUrl}" method="post" class="form-horizontal">
		<div class="input-group input-sm">
			<label class="input-group-addon" for="username"><i
				class="fa fa-user"></i></label> <input type="text" class="form-control"
				id="username" name="ssoId" placeholder="Enter Username" required>
		</div>
		<div class="input-group input-sm">
			<label class="input-group-addon" for="password"><i
				class="fa fa-lock"></i></label> <input type="password" class="form-control"
				id="password" name="password" placeholder="Enter Password" required>
		</div>
		<br /> <input type="submit" value="Login" />
	</form>
	get
	<%=request.getContextPath()%>
<body>
</html>
