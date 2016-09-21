<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<%
Date date = new Date();
SimpleDateFormat df = new SimpleDateFormat();
String today = df.format(date);
%>
当前时间：<%=today%>
<br>
<s:form action="helloAction">
	<s:textfield name="username" key="user"/>
	<s:textfield name="password" key="pass"/>
	<s:submit key="login"></s:submit>
</s:form>
</body>
</html>