<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table cellpadding="2" cellspacing="2" border="2">
		<tr>
			<th>Order Id</th>
			<th>Product</th>
			<th>Date of ordering</th>
			<th>Return</th>
		</tr>
		<a:forEach var="order" items="${temp}">
			<tr>
				<td>${order.orderId}</a></td>
				<td>${order.product}</td>
				<td>${order.orderDate}</td>
				<td><a href="return?name=${order.orderId}">Return</td>
			
			</tr>
		</a:forEach>

	</table>
</body>
</html>