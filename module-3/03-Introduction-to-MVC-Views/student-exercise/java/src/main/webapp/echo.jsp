<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Echo"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="routeCount" value="10" />
		<c:set var="routeWord" value="Echo" />
		<c:url var="echoRoute" value="echo.jsp">
			<c:param value="${ routeCount }" name="count" />
			<c:param value="${ routeWord }" name="word" />
		</c:url>
		<li>
			<a href="<c:out value="${ echoRoute }" />">${ routeWord } ${ routeCount }</a>
		</li>

		<c:set var="routeCount" value="20" />
		<c:set var="routeWord" value="Hello!" />
		<c:url var="echoRoute" value="echo.jsp">
			<c:param value="${ routeCount }" name="count" />
			<c:param value="${ routeWord }" name="word" />
		</c:url>
		<li>
			<a href="<c:out value="${ echoRoute }" />">${ routeWord } ${ routeCount }</a>
		</li>

		<c:set var="routeCount" value="50" />
		<c:set var="routeWord" value="Goodbye!" />
		<c:url var="echoRoute" value="echo.jsp">
			<c:param value="${ routeCount }" name="count" />
			<c:param value="${ routeWord }" name="word" />
		</c:url>
		<li>
			<a href="<c:out value="${ echoRoute }" />">${ routeWord } ${ routeCount }</a>
		</li>
	</ul>
</nav>

<%-- 
		<c:forEach begin="0" end="${count}">
			<li style="font-size:${count}px"><c:out value="${param.word}"/></li>
			<c:set var="count" value="${count - 1}"/>
		</c:forEach> --%>
			 <c:set var="word" value="Hello!"/>
		<c:set var="count" value="20"/>
		<c:forEach begin="10" end="${count}">
			<li style="font-size:${count}px"><c:out value="${param.word}"/></li>
			<c:set var="count" value="${count - 1}"/>
		</c:forEach>


		<c:forEach begin="20" end="${count}">
			<li style="font-size:${count}px"><c:out value="${param.word}"/></li>
			<c:set var="count" value="${count - 1}"/>
		</c:forEach>
 
 <%-- <c:forEach begin="0" end= "${param.count }" var="numb" >
<ul>
			<li style="font-size:${count}px"><c:out value="${param.word}"/></li>
			<c:set var="count" value="${count - 1}"/>

</ul>
</c:forEach> --%>