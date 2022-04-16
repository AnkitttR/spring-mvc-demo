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

</body>



</html>