<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.logindemo.UserDetails"%>
<jsp:useBean id="add" scope="page" class="com.logindemo.UserDetails"></jsp:useBean>
<jsp:setProperty property="*" name="add"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction trx = ses.beginTransaction();
		ses.save(add);
		trx.commit();
		ses.close();
	%>
</body>
</html>