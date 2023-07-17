<%@ page isELIgnored="false" %>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>
<body>
<h2>Hello World!</h2>
<hr>
${song}
<c:forEach items="${song}" var="s">

${s}
</c:forEach>
<br>
</body>
</html>
