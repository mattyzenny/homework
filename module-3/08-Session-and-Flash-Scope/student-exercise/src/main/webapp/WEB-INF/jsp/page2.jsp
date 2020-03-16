<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Color" />
</c:import>

<%-- <c:url var="page2" value="/page2" />
 --%>
 
 <form method="POST" action="${favoriteFoodjfldskafjsdfjal }">
<label> What is your favorite food?</label>
<input type="text" name="food">
<button type="submit"> Submit</button>

	
</form>


<c:import url="/WEB-INF/jsp/common/footer.jsp"/>