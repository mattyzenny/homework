<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="FizzBuzz"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>
	</ul>
<style>
	
li.fizz {
	color: blue;
}

li.buzz {
	color: red;
}

li.fizzbuzz {
	color: #228b22;
	font-size: 2rem;
}
</style>



<c:forEach begin="1" end="100" var="numberOfItems">
		<c:choose>
			<c:when test="${numberOfItems % 5 == 0 && numberOfItems % 3 == 0 }">
				<li class="fizzbuzz"> FizzBuzz! <c:out value= "${param.number }"/></li>
				
			</c:when>
			<c:when test="${numberOfItems % 5 == 0}">
				<li class="buzz">Buzz! <c:out value= "${param.number }"/></li>
			</c:when>
			<c:when test="${numberOfItems % 3 == 0}">
				<li class="fizz">Fizz! <c:out value= "${param.number }"/></li>
			</c:when>
			<c:otherwise>
		<li class="null"> ${numberOfItems}</li>
	</c:otherwise>
		</c:choose>
	</c:forEach> 
<%-- 		<c:set var= "rowClassAttribute" value= "fizzbuzz" />
		<c:set var= 'rowClassAttribute' value= "buzz" />
		<c:set var="rowClassAttribute" value= "fizz" /> --%>

	<c:import url="common/footer.jsp"></c:import>