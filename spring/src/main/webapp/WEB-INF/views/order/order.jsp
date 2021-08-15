<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>주문 사항</h1>
	<hr>
	<table border="1">
		<c:forEach items="${orderCommand.orderItems }" var="items"
			varStatus="stat">
			<tr>
				<td rowspan="3">상품${stat.count }</td>
				<td>상품 아이디</td>
				<td>${items.itemId }</td>
			</tr>
			<tr>
				<td>상품 수량</td>
				<td>${items.itemNumber }</td>
			</tr>
			<tr>
				<td>상품 주의</td>
				<td>${items.warning }</td>
			</tr>
		</c:forEach>
		<tr>
			<td rowspan="3">주소</td>
			<td>우편번호</td>
			<td>${orderCommand.address.zipcode}</td>
		</tr>
		<tr>
			<td>주소1</td>
			<td>${orderCommand.address.address1}</td>
		</tr>
		<tr>
			<td>주소2</td>
			<td>${orderCommand.address.address2}</td>
		</tr>

	</table>
</body>
</html>