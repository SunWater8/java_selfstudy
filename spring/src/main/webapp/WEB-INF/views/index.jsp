<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index page</title>
</head>
<body>
	<h1>Index</h1>
	<hr>
	<p><a href="<c:url value="/hello"/>">/hello</a><p>
	<p><a href="<c:url value="/member/login"/>">/member/login</a><p>
	<p><a href="<c:url value="/member/memberReg"/>">/member/memberReg</a><p>
</body>
</html>