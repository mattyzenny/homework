<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Fibonacci"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>
	</ul>
</nav>

<style>
li.first-child {
	color: #228b22;
	font-weight: bold;
}

li.last-child {
	color: #b71b1b;
	font-weight: bold;
}
</style>




<li class="first-child">0</li>

<c:set var="fib1" value="1" />
<c:set var="fib2" value="2" />
<c:set var="fib3" value="${fib1 + fib2}" />

<c:forEach begin="1" end="100" var="numberOfItems">
	<c:set var="rowClassAttribute" value="" />
<%-- 	<c:if test="${numberOfItems == 0}">
		<c:set var= 'rowClassAttribute' value='first-child' />
	</c:if> --%>
	<li>${fib1} </li>
	<c:set var="fib1" value="${fib2}" />
	<c:set var="fib2" value="${fib3}" />
	<c:set var="fib3" value="${fib1 + fib2}" />

</c:forEach>

<c:import url="common/footer.jsp"></c:import>