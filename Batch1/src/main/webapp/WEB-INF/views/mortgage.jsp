<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="post" action="loan.jsp">
<center>
<table border="1px solid black" style="background-color:#0CB88E" >
 <h1 style="color:#0CB88E">Loan Application</h1>
	
	<tr> <th>Already have a Mortgage Loan: </th> 
	 <th><input type="radio" name="loan" value="yes"> Yes</input> 
	 <input type="radio" name="loan" value="no">No </input> </th>
	</tr> </br>
	<tr><th>Credit Score: </th>
	<th> <input type="text" name="creditScore" /> </th>
	</tr></br>

	<tr><th>Property:</th>
	<th><input type="radio" name="land" />Land </th>
	</tr></br> 
	<tr><th>Area Code: </th>
	<th><input type="text" name="acode" /> </th>
	</tr></br> 
	<tr><th>Area square Feet : </th>
	<th><input type="text" name="asqFt" /></th> 
	</tr></br> 
	<tr><th>Legal Residency :</th> 
	<th><input type="radio" name="resident" value="Indian" checked> Indian</input> 
	<input type="radio" name="resident" value="NRI"> NRI </input> </th>
	</tr></br>
	
</table>
<input type="submit" value="DashBoard" />
<input type="Submit" value="Register" />

</center>
</form>
</body>
</html>