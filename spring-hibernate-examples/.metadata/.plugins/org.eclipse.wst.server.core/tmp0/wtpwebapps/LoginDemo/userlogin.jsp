<%@page import="logindemo.dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="logindemo.dao.LoginDao"%>

<jsp:useBean id="search" scope="page" class="com.logindemo.UserDetails"></jsp:useBean>
<jsp:setProperty property="*" name="search"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//String username = search.getUserName();
		//String password = search.getPassword();
		//System.out.println("username.===="+username);
		//System.out.println("password.===="+password);
		//if((username.equals("admin"))&&(password.equals("admin"))){
		//	System.out.println("welcome...");
		//}
		//else{
		//	System.out.println("out.....");
		//}
		System.out.println("+++++++++++++++++++++"+search);
		boolean validate = LoginDao.validate(search);
		//if(validate){
		//	System.out.println("welcome...");
		//}
		//else{
		//	System.out.println("out....");
		//}
		System.out.println(validate);
	%>
</body>
</html>