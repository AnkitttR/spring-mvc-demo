<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html >

<head>

<title>Student Registration Form</title>

</head>


<body>

<form:form action="processForm" modelAttribute="student">

	<!-- first name is property of Student.java -->
	First name: <form:input path="firstName" /> 
	
	<br><br>
	<!-- last name is property of Student.java -->
	Last name: <form:input path="lastName" />
	
	<br><br>
	
	Country:
	
	<form:select path="country">
	
	<form:option value="Brazil" label="Brazil" />
	<form:option value="France" label="France" />
	<form:option value="Germany" label="Germany" />
	<form:option value="India" label="India" />
	<!-- On submit Spring will call student.setCountry()  -->
	</form:select>
	
	<br><br>
	
	<input type="submit" value="Submit" />

</form:form>



</body>

</html>

<!-- When form is loaded, Spring will call student.getFirstName(), student.getFirstName() -->

<!-- When form is loaded, Spring will call student.setFirstName(), student.setFirstName() -->


