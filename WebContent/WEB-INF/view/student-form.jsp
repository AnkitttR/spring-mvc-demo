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
	
	<form:options items="${student.countryOptions}" />
	
	<!-- items refer to the collection of data  -->
	<!-- Spring will call student.getCountryOptions() -->
	
	</form:select>
	
	<br><br>
	
	Favourite Language 
	
	Java <form:radiobutton path="favouriteLanguage" value="Java"/>
	C# <form:radiobutton path="favouriteLanguage" value="C#"/>
	PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
	Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
	
	<br><br>

	
	<input type="submit" value="Submit" />

</form:form>



</body>

</html>

<!-- When form is loaded, Spring will call student.getFirstName(), student.getFirstName() -->

<!-- When form is loaded, Spring will call student.setFirstName(), student.setFirstName() -->


