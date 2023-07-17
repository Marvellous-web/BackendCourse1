<%@ page isELIgnored="false" %>


<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>
<body>


<h1>Movie Form</h1>
<form action="reqSendMovie" method="post"> <br>
Movie id<input type="text" name="id" /><br>
Movie Rating <input type="text" name="movie_rating" /><br>
Movie Name <input type="text" name="movie_name" /><br>
Movie year <input type="text" name="movie_year" />
<br>
<input type="submit" value="saveMovie" />

</form>

<c:forEach items="${movieObjects}" var="bk">
${bk}

<br>
</c:forEach> <br>
</body>
</html>