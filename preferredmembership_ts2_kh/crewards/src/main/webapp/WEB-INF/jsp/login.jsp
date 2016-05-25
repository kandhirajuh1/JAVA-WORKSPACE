<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<style>
#content {
	margin: auto;
	width: 60%;
	padding: 10px;
	border-style: groove;
}
</style>
<body>
	<%@ include file="../html/header.html"%>

	<div
		style="border-style: groove; width: 1000px; height: 500px; margin: auto; padding: 10px;">
		<!-- <div style="margin-top: 40px; width: 100%;">
 -->
		<h2>Account Login</h2>
		to update your account information online or view your points balance,
		please log in below. <br />


		<!-- 	</div> -->

		<div style="margin-top: 40px; width: 100%">
			<p>* indicates mandatory fields & must be entered</p>
		</div>
		<form action="login" method="post" modelAttribute="UserLoginDetails">
			<table align="center">
				<tr>
					<td><label> Email/Username:</label></td>
					<td><input type="text" name="username" required></td>
				</tr>
				<tr>
					<td><label> Password:</label></td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td></td>
					<td><input type=submit value=Login></td>
				</tr>
			</table>
		</form>
	</div>
	</div>
	<%@include file="../html/footer.html"%>
</body>
</html>