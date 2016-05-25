
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../html/header.html"%>
	<div
		style="border-style: groove; width: 1000px; height: 500px; margin: auto; padding: 10px;">

		<div style="margin-top: 40px; width: 100%">
			<h3>GET STARTED</h3>
			<form action="login" method="post">
				<table style="width: 100%">


					<tr>
						<!-- <div style="float: left; width: 50%"> -->
						<td align="left">ALREADY A PREFERRED MEMBER? <br /> <br />
							<p>* indicates mandatory fields & must be entered</p>

							<table>
								<tr>
									<td>Email/Username*</td>
									<td><input type="text" name="username"></td>
								</tr>
								<tr>
									<td>Password*</td>
									<td><input type="password" name="password"></td>
								</tr>
								<tr>
									<td></td>
									<td><input type="submit" value="login"></td>
								</tr>
							</table>> <!-- <div style="float: left; width: 50%"> -->
						<td align="left">JOIN PREFERRED TODAY <br /> <br /> (United
							States and Canada residents only) <br /> <br /> i would like to
							become a preferred member. <br /> joining the preferred program
							only takes a few minutes.. <br /> click below to join. <br /> <a
							href="Registration"> <strong>Continue </strong></a>

						</td>
						<!-- 	</div> -->
					</tr>



				</table>
			</form>

		</div>
	</div>
	<%@include file="../html/footer.html"%>
</body>
</html>