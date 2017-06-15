<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    This is my JSP page. <br>
    
    <form action="http://172.18.68.4:8080/user/signin" method="post">
    	<input type="text" name="username" width="200"/>
    	<input type="password" name="password" width="200"/>
    	<input type="submit" name="Submit1" value="登录" />
    </form>
    <form action="http://172.18.68.4:8080/user/signup" method="post">
    	<input type="text" name="username" width="200"/>
    	<input type="password" name="password" width="200"/>
    	<input type="submit" name="Submit2" value="注册" />
    </form>
    <form action="http://172.18.68.4:8080/user/update" method="post">
    	用户名：
    	<input type="text" name="username" width="200"/> <br/>
    	密码：
    	<input type="text" name="password" width="200"/> <br/>
    	新用户名或新密码：
    	<input type="text" name="newinfo" width="200"/> <br/>
    	1改用户名，其它改密码:
    	<input type="text" name="flag" width="10"/> <br/>
    	
    	<input type="submit"  value="提交" />
    </form>
  </body>
</html>
