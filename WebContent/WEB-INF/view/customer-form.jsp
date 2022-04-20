<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<html>

<head>

<title>Customer Registration Form</title>

<style>
/* Define CSS style */
.error {color:red}

</style>

</head>

<body>

<i> Fill out the form. Asterisk(*) means required. </i>
<!-- i is for Italic -->

<form:form action="processForm" modelAttribute="customer">

First name: <form:input path="firstName" />

<br><br>

Last name (*): <form:input path="lastName" />
<form:errors path="lastname" cssClass="error" />

<br><br>

<input type="submit" value="Submit" />


</form:form>

</body>

</html>