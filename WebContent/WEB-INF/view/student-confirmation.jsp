<!-- Reference JSTL tag library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>


<!DOCTYPE html>
<html >

<head>

<title> Student Confirmation</title>

</head>


<body>

The student is confirmed: ${student.firstName} ${student.lastName}  

<br><br>

Country: ${student.country}
<!-- Spring will call student.getCountry()  --> 

<br><br>

Favourite Language: ${student.favouriteLanguage}

<br><br>

Operating Systems:

<!-- ul is unordered list -->
<ul>

<c:forEach var="temp" items="${student.operatingSystems}">

<li> ${temp} </li>

</c:forEach>

</ul>

</body>



</html>