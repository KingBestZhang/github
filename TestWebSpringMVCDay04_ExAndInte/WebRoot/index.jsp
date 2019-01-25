<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <a href="hello.do">hello</a>
   <a href="testForword">testForword</a>
   <a href="testRedirect">testRedirect</a><br>
   <form action="first/testConverter">
    <input type="text" name="studentInfo"><br>
    <input type="submit" value="增加add">
   </form><br>
    <form action="testLoginConverter">
    <input type="text" name="studentLogin"><br>
    <input type="submit" value="增加">
   </form>
   <br>
   
    <form action="testFormatting">
	    <input type="text" name="username"><br>
	    <input type="text" name="userpass"><br>
	    <input type="text" name="birthday"><br>
	    <input type="text" name="email"><br>
	    <input type="submit" value="增加">
   </form>
   <br>
   <hr>
   <form action="testUpload" method="post"  enctype="multipart/form-data">
     	用户名:<input type="text" name="username"/><br>
     	文件:<input type="file" name="file"><br>
     <input type="submit" value="upload">
   </form>
   <br>
   <a href="first/testException">exception</a>
  </body>
</html>
