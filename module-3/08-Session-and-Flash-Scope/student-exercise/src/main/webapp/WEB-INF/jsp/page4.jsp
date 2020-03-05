<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Color" />
</c:import>
<div class="boxed">


	
	<table id= "table">
	<tr>
		<th>Favorite color: </th>
		<td><c:out value="${color}" /></td>
	</tr>
	<tr>
		<th>Favorite food: </th>
		<td><c:out value="${food}" /></td>
	</tr>
	<tr>
		<th>Favorite season: </th>
		<td><c:out value="${season}" /></td>
	</tr>
	
</table>

 <h1 id= "result">Try again <a href= page1>Here </a></h1>


</div>
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>