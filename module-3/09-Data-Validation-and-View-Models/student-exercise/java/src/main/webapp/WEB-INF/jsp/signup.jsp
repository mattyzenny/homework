
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<head>
<%@include file="common/header.jspf"%>

</head>
<c:url value="/submit" var="signupURL" />

<body>
	<form:form action="${signupURL}" method="POST" modelAttribute="signup">

		<div>
			<form:errors path="*" cssClass="error" />
		</div>
		<div>
			<label for="firstName">First Name</label>
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="error" />
		</div>

		<div>
			<label for="lastName">Last Name</label>
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />

		</div>


		<div>
			<label for="email">Email</label>
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
			<form:errors path="emailMatching" cssClass="error" />
		</div>
		<div>
			<label for="verifyEmail">Confirm Email</label>
			<form:input path="verifyEmail" />
			<form:errors path="verifyEmail" cssClass="error" />

		</div>

		<div>
			<label for="password">Password</label>
			<form:input path="password" />
			<form:errors path="password" cssClass="error" />
			<form:errors path="passwordMatching" cssClass="error" />

		</div>
		<div>
			<label for="verifyPassword">Confirm Password</label>
			<form:input path="verifyPassword" />
			<form:errors path="verifyPassword" cssClass="error" />

		</div>

		<div>
			<label for="birthday">BirthDay</label>
			<form:input path="birthday" />
			<form:errors path="birthday" cssClass="error" />

		</div>

		<div>
			<label for="numberOfTickets">Tickets</label>
			<form:input path="numberOfTickets" />
			<form:errors path="numberOfTickets" cssClass="error" />
		</div>

		<br>
		<div>
			<input type="submit" value="Sign Me Up!" />
		</div>

	</form:form>
</body>



<%@include file="common/footer.jspf"%>
