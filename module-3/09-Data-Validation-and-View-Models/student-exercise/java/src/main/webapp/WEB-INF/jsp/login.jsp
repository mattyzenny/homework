<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<head>
<%@include file="common/header.jspf" %>

</head>
<c:url var="loginURL" value="/login" />

<h2>LOGIN</h2>

<h2 class="error">${error }</h2>


<form action="${login}" method="POST">
<label for="email">Email:</label>
<input type="text" name="email" /><br />
<label for="password">Password:</label>
<input type="text" name="password" /><br />
<br>
<input type="submit" value="login" />


</form> 




<%@include file="common/footer.jspf" %>
