<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>주문하기</h1>
	<hr>
	
	<form method="post">
		<table border="1">
			<tr>
				<td rowspan="3">상품1</td>
				<td>상품 아이디</td>
				<td><input type="text" name="orderItems[0].itemId"></td>
			</tr>
			<tr>
				<td>상품 수량</td>
				<td><input type="number" name="orderItems[0].itemNumber"></td>
			</tr>
			<tr>
				<td>상품 주의</td>
				<td><input type="text" name="orderItems[0].warning"></td>
			</tr>
			<tr>
				<td rowspan="3">상품2</td>
				<td>상품 아이디</td>
				<td><input type="text" name="orderItems[1].itemId"></td>
			</tr>
			<tr>
				<td>상품 수량</td>
				<td><input type="number" name="orderItems[1].itemNumber"></td>
			</tr>
			<tr>
				<td>상품 주의</td>
				<td><input type="text" name="orderItems[1].warning"></td>
			</tr>
			<tr>
				<td rowspan="3">상품3</td>
				<td>상품 아이디</td>
				<td><input type="text" name="orderItems[2].itemId"></td>
			</tr>
			<tr>
				<td>상품 수량</td>
				<td><input type="number" name="orderItems[2].itemNumber"></td>
			</tr>
			<tr>
				<td>상품 주의</td>
				<td><input type="text" name="orderItems[2].warning"></td>
			</tr>
			<tr>
				<td rowspan="3">주소</td>
				<td>우편번호</td>
				<td><input type="text" name="address.zipcode"></td>
			</tr>
			<tr>
				<td>주소1</td>
				<td><input type="text" name="address.address1"></td>
			</tr>
			<tr>
				<td>주소2</td>
				<td><input type="text" name="address.address2"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>