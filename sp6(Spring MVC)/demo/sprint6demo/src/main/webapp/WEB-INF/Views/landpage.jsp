<%@ page isELIgnored="false" %>


<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>
<body>




<table border="1">
<tbody>
<c:forEach items="${song_list}" var="s1">
<tr>
<td>${s1.id}</td>
<td>${s1.song_rating}</td>
<td>${s1.song_name}</td>
<td>${s1.singer_name}</td>
</tr>
</c:forEach>
</tbody>
</table>

<h1>Song Form</h1>
<form action="reqSendSong" method="post"> <br>
Song id<input type="text" name="id" /><br>
Song Rating <input type="text" name="song_rating" /><br>
Song Name <input type="text" name="song_name" /><br>
Singer name <input type="text" name="singer_name" />
<br>
<input type="submit" value="saveSong" />

</form>


</body>
</html>