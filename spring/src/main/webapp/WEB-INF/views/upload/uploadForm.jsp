<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>파일 첨부하기</h1>
<hr>
<form action=upload1 method="post" enctype="multipart/form-data">
<table>
	<tr>
		<td>학번</td>
		<td><input type="text" name="sno"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="sname"></td>
	</tr>
	<tr>
		<td>사진</td>
		<td><input type="file" name="report"></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" ></td>
	</tr>
</table>
</form>
</body>
</html>