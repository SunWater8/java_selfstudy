<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 성공</h1>
	<hr>
	아이디 : 	${id } , ${uid }, ${loginReq.id }<br>
	비밀번호 : ${pw }, ${upw }, ${loginReq.pw }
</body>
</html>