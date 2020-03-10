<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Color" />
</c:import>

<%-- <c:url var="page1" value="/page2"> </c:url>
 --%>
 
 <form method="POST" action="${IrrelevantAction }">
	<label>What is your favorite color?</label>
	<input type="text" name="color">
	<button type="submit">Submit</button>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />