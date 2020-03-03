<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>


<!-- Form goes here -->
<br>
<br>
<c:url value="/searchCustomer" var="customerSearchHref" />
<form method="GET" action="${customerSearchHref }">
	<label for="Name"> NAME: </label> <input type="text" id="name"
		name="name" /> 
<input type="submit" value="Submit" />
</form>

<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
    <!-- What do we print here for each actor? -->
<td>  <c:out value="${actor.firstName }" /> </td>
<td> <c:out value="${actor.lastName }" /></td>  
    
    
</tr>
</c:forEach>
</table>
















<%@include file="common/footer.jspf"%>