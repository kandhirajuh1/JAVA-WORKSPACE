<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../html/header.html"%>
	<div
		style="border-style: groove; width: 1000px; height: 500px; overflow: auto; margin: auto; padding: 10px;">

		<h3>SIGN UP FOR THE PREFERRED PROGRAM</h3>
		please complete the following form to become a preferred program
		member

		<p>
		<form action="Registration" method="post"
			modelAttribute="RegistrationDto">
			<center>
				select your store: <select name="country_Id" required>
					<option value="USA">USA</option>
				</select> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				 <select>
					name="state_Id">
					select your State:
					<option value="TEXAS">TEXAS</option>
				</select> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
					<tr>
					<!-- <tr>
					<td><label for="state">State</label></td>
					<td><select id="state" name="state">
							<option value="Texas">Texas</option>
					</select></td>
				</tr> -->
					<td><label for="Store">Store</label></td>

					<td><select name="store" required>
							<option selected="selected">Select Store</option>
							<c:forEach items="${storeList}" var="store">
								<option value="${store.store_Id}">${store.store_Name}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>

				 	<%-- <%@include file="../jsp/storelist.jsp"%> 
 --%>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <br>
				<p>
					select your home store * <br /> (your home store selection should
					be the store that you shop the most frequently. proper home store
					selection ensures you receive special promotions for the location
					nearest you. )
				</p>
				<h2>Please enter details for your preferred account</h2>

				User name: <input type="text" name="userloginDetails.username" required /><br> <br>
				Password: <input type="password" name="userloginDetails.password" required><br>


				<h2>User Information</h2>
				First name:<br> <input type="text" name="user.firstName" required><br>
				<br> Last name:<br> <input type="text" name="user.lastName" required><br>
				<br>
				<div>
					Country * : <select name="countrystore" required>
						<option value="USA">USA</option>
					</select> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; State * :<select
						name="statestore" required>
						<option value="TEXAS">TEXAS</option>
					</select> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;

				</div>
				<br>
				
				<div>
					Address1: <input type="text" name="address.addressLine1" required><br> <br>
					Address2: <input type="text" name="address.addressLine2" required><br> <br>
					City: <input type="text" name="address.city" required><br> <br>
					Zipocode: <input type="text" name="address.zipcode" required><br> <br>
					email : <input type="text" name="user.email" required><br> <br>
					Confirm email : <input type="text" name="Confirm email"required><br>
					(email address is your user name for login purpose) <br> <br>
					Phone : <input type="text" name="user.phone" required><br> <br>
					
					
					Gender<input type="radio" name="user.gender" value="male" >male <input
						type="radio" name="user.gender" value="female"> Female <input
						type="radio" name="user.gender" value="other" > Other <br>
					<br> Marital Status <input type="radio" name="user.martialStatus"
						value="single"> single <input type="radio"
						name="user.martialStatus" value="married" > married <br> <br>
					Date of Birth <select name="user.birthMonth" required>
						<option>- Month -</option>
						<option value="January">January</option>
						<option value="Febuary">Febuary</option>
						<option value="March">March</option>d
						<option value="April">April</option>
						<option value="May">May</option>
						<option value="June">June</option>
						<option value="July">July</option>
						<option value="August">August</option>
						<option value="September">September</option>
						<option value="October">October</option>
						<option value="November">November</option>
						<option value="December">December</option>
					</select> <select name="user.birthDate" required>
						<option>- Day -</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
						<option value="25">25</option>
						<option value="26">26</option>
						<option value="27">27</option>
						<option value="28">28</option>
						<option value="29">29</option>
						<option value="30">30</option>
						<option value="31">31</option>
					</select> <br> <br> House Hold Income <input type="radio"
						name="user.income" value="$25,000 - $40,000">"$25,000 -
					$40,000" <input type="radio" name="User.income"
						value="$40,001 - $55,000">"$40,001 - $55,000" <input
						type="radio" name="user.income" value="$55,001 - $70,000">"$55,001
					- $70,000"<br> <input type="radio" name="user.income"
						value="$70,001 - $85,000">"$70,001 - $85,000" <input
						type="radio" name="user.income" value="$85,000 - $100,000">"$85,000
					- $100,000" <input type="radio" name="user.income" value="$100,001 + ">"$100,001
					+ " <br> <br>
			</center>

			<p>
				<strong> In addition to receiving your earned rewards via
					email, you will also receive sale and discount emails valid at
					calvinklein.com and certain Calvin Klein stores.You may edit your
					preferences below: </strong>
			</p>
			<br>
			<center>
				Email Preferences : <input type="checkbox" name="calvinklein.com"
					value="calvinklein.com"> calvinklein.com <input
					type="checkbox" name="Calvin Klein Stores"
					value="Calvin Klein Stores"> Calvin Klein Stores <input
					type="checkbox" name="earned rewards" value="earned rewards"">
				earned rewards <br />

			</center>

			<p>
				<strong> by joinng our preferred program, and providing
					personal data, you are certifying you are atleast 18 years of age
					do not provide any information if you are under age of 18. </strong>
			</p>

			<center>
				<input type="submit" value="join"> <br />
			</center>

		</form>

	</div>
	<div>
		<%@include file="../html/footer.html"%>
	</div>



</body>
</html>