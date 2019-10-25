<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="employ" items="${employeeList}">
<table>
				<tr>

					<td>${employ.loanname}</td>
					<td>${employ.loanamount}</td>
					<td>${employ.mortgageitem}</td>
					<td>${employ.weight}</td>
					<td>${employ.creditscore}</td>
					<td>${employ.pan}</td>
					<td>${employ.salary}</td>
				</tr>
				</table>
			</c:forEach>

</body>
</html>