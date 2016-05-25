<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.ck.rewards.dao.StoreDAO"%>
<%@ page import="com.ck.rewards.entity.Store"%>

<%@ page import="com.ck.rewards.service.RegistrationService"%>
<%@ page import="com.ck.rewards.entity.Store"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<select name="store.store_Id">
	 <%
			StoreDAO strdao = new StoreDAO();


			for (Store s : strdao.getStoresList())

			{
				out.println("<option value =" + s.getStore_Id() + ">" + s.getAddrline1() + s.getAddrline2() + s.getCity()+ "</option>");
				out.println(s.getAddrline2());
				out.println(s.getCity());
 
			}
		%>
	</select>
</body>
</html> --%>