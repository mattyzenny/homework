<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<body>
	<h1>write review</h1>
	<div id="main-content">
		<div class="centered">
			<c:url var="submitReview" value="/addPostReview" />
			<form action="${submitReview}" method="POST">
				<label for="username">Username:</label> <input type="text"
					name="username" /><br /> <label for="rating">Rating:</label> <select
					name="rating" form="rating">
					<option value="1">One</option>
					<option value="2">Two</option>
					<option value="3">Three</option>
					<option value="4">Four</option>
					<option value="5">Five</option>
				</select> <label for="subject">Title:</label> <input type="text" name="title" /><br />
				<label for="text">Message:</label> <input type="text" name="text" /><br />
				<!-- 				<textarea  rows="10" name="text">
				 </textarea>  -->
				<input type="submit" value="Submit" />
			</form>

		</div>
		<c:forEach var="review" items="${reviews}">
			<hr>
			<br>
			<p class="value">ReviewTitle: ${review.title}</p>
			<hr>
			<c:choose>
				<c:when test="${review.rating == 1 }">
					<img src="/etc/forDummies.png>" />
						ReviewRating: 
			</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${review.rating == 2 }">
					<img src="<c:url value= "/etc/star.png" />">
								<img src="<c:url value= "/etc/star.png" />">
				
			ReviewRating: 
			</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${review.rating == 3 }">
					<img src="<c:url value= "/etc/star.png" />">
							<img src="<c:url value= "/etc/star.png" />">
				<img src="<c:url value= "/etc/star.png" />">
			ReviewRating: 
			</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${review.rating == 4 }">
					<img src="<c:url value= "/etc/star.png" />">
							<img src="<c:url value= "/etc/star.png" />">
							<img src="<c:url value= "/etc/star.png" />">
					<img src="<c:url value= "/etc/star.png" />">
			ReviewRating: 
			</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${review.rating == 5 }">
					<img src="<c:url value= "/etc/star.png" />">
							<img src="<c:url value= "/etc/star.png" />">
							<img src="<c:url value= "/etc/star.png" />">
							<img src="<c:url value= "/etc/star.png" />">
				<img src="<c:url value= "/etc/star.png" />">
			ReviewRating: 
			</c:when>
			</c:choose>
			<br>
			<p>${review.text }</p>
			<p>By: ${review.username} ${review.dateSubmitted }</p>



		</c:forEach>
	</div>
</body>
