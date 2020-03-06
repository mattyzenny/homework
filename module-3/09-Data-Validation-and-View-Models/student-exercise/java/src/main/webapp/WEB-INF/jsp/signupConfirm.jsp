<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<%@include file="common/header.jspf"%>

</head>
<section id="main-content" class="centeredPanel">
<h2> Thank you for signing up AND Completing the exercise!!!
<br>
<br>
<br>
<c:out value="${signup.firstName }" />
<c:out value="${signup.lastName }" />
</h2>
<p>Your email "${signup.email }" has been added to our mailing list!</p>


</section>
<body>

</body>
</html>