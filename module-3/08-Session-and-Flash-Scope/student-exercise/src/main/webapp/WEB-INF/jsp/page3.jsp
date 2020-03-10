<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Color" />
</c:import>

 <%-- <c:url var="page3" value="/page4" />
 --%> <form method="POST" action="${favoriteSeason }">
 
 
 
	<label> What is your favorite season?</label> 
	<ul>
		<li class="radio"><input name="season" value="Spring"
			type="radio"><label for="Spring">Spring</label></li>
		<li class="radio"><input name="season" value="Summer"
			type="radio"><label for="Summer">Summer</label></li>
		<li class="radio"><input name="season" value="Fall"
			type="radio"><label for="Fall">Fall</label></li>
		<li class="radio"><input name="season" value="Winter"
			type="radio"><label for="Winter">Winter</label></li>
	</ul>
	<button id="submit" value="submit">Submit</button>

</form>







<c:import url="/WEB-INF/jsp/common/footer.jsp" />