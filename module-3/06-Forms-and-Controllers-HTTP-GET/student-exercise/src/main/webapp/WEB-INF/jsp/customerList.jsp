<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Customers List" />

<%@include file="common/header.jspf"%>


<!-- Form goes here -->
<br>
<br>
<c:url value="/customerSearch" var="customerSearchHref" />
<form method="GET" action="${customerSearchHref }">
	<input type="text" id="name" name="firstLast" /> <input type="submit"
		value="Submit" /> <label> Customer Name: </label> <select
		name="customerSearch">
		<option value="FirstName">FirstName</option>
		<option value="LastName">LastName</option>
		<option value="email">email</option>
		<option value="active">status</option>
	</select>
</form>

<table class="table">
	<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Status</th>
	</tr>
	<c:forEach items="${customers}" var="customer">
		<tr>
			<!-- What do we print here for each actor? -->
			<td><c:out value="${customer.firstName }" /></td>
			<td><c:out value="${customer.lastName }" /></td>
			<td><c:out value="${customer.email }" /></td>
			<td><c:out value="${customer.active }" /></td>


		</tr>
	</c:forEach>
</table>


<%@include file="common/footer.jspf"%>













