<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="jsp; charset=UTF-8">
<title>Employ Management Screen</title>
</head>
<body>
	
	<div align="center">
		<h1>Employ List</h1>

		<table border="1">

			<th>Empno</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Desig</th>
			<th>Basic</th>

			<c:forEach var="employ" items="${employeeList}">
				<tr>

					<td>${employ.empno}</td>
					<td>${employ.name}</td>
					<td>${employ.dept}</td>
					<td>${employ.desig}</td>
					<td>${employ.basic}</td>

				</tr>
			</c:forEach>
		</table>
		
		<c:set var="num" value="${pages }"></c:set>
	<%
	int n=((Integer)pageContext.getAttribute("num")).intValue();
	int index = 1;
	if(request.getAttribute("pageno") != null) {
		index = ((Integer)request.getAttribute("pageno")).intValue() + 1;
	}
%>
	
	<%
		for (int i = 0; i < n; i++) {
			if(index == i+1){
			%>	<option value="<%=index%>" selected disabled><%=index%></option><%
			}else {
	%>
	<option value="<%=i%>"><%=i + 1%></option>
	<%}}%>
</select>
<%
	for (int i = 0; i < n; i++) {
		if(index == i+1) {
			%>
			<a style="color:red" > <%=i + 1%></a> &nbsp;&nbsp;
			<%
		} else {
%>
<a href="/displayAll/Page/<%=i%>"> <%=i + 1%></a> &nbsp;&nbsp;

<%}}%>

<a href="/">Home</a>
<br>
<br>
<script>
	function goToLink() {
		var e = document.getElementById("pageDropDown");
		// alert(e.options[e.selectedIndex].value);
		var i = e.options[e.selectedIndex].value;
		window.location.href = "http://desktop-d4dcv8b:8087/displayAll/Page/"+i;
	}
</script> v
	</div>
	<center>
		<!--<a href="/displayAll/Page/0">Page 1</a>
		<a href="/displayAll/Page/1">Page 2</a>
		<a href="/displayAll/Page/2">Page 3</a>
		 <a href="/displayjavacontractors">displayjavacontractors</a><br />
		<br /> <a href="/displayjavaemployees">displayjavaemployees</a><br />
		<br /> <a href="/displayjavamanagers">displayjavamanagers</a><br />
		<br /> <a href="/displaymgerabv20000">displaymgerabv20000</a><br />
		<br /> <a href="/displayByStarting">displayByStarting</a><br />
		<br /> <a href="/displayAllSortByDesig">displayAllSortByDesig</a><br />
		<br /> <a href="/displayAllSortByDesigDesc">displayAllSortByDesigDesc</a><br />
		<br /> <a href="/disSortByBasicDescDeptByDesc">disSortByBasicDescDeptByDesc</a><br />
		<br /> <a href="/disJavaEmpSortBySalDesc">disJavaEmpSortBySalDesc</a><br />
		<br /> <a href="/disSort">disSort</a><br /> -->
		<br />
	</center>
</body>
</html>