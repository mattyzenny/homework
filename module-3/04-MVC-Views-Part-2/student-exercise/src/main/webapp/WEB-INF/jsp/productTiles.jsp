<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<%--<c:param name="baseRoute" value="#" /> --%>

		<c:param name="baseRoute" value="/products/tiles" />
	</c:import>

	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->

	<!--**** 	<div id="grid" class="main-content"> -->




	<!-- The following HTML shows different examples of what HTML
		 could be rendered based on different rules. For purposes
		 of demonstration we've written it out so you can see it
		 when you load the page up. -->

	<!-- Standard Product -->
	<div id="grid" class="main-content">

		<c:forEach var="product" items="${products }">
			<div class="tile">


				<c:url var="productDetailsPageHref" value="/products/tiles">
					<c:param name="id">${product.id}</c:param>

				</c:url>
				<a class="product-image" href="${productDetailsPageHref }"> <img
					src="<c:url value= "/images/product-images/${product.imageName }" />" />
				</a>

				<div class="details">
					<p class="name">
						<c:out value="${product.name }" />

					</p>

					<c:choose>
						<c:when test="${product.topSeller }">
							<div class="tile top-seller ">
								<p class="product-alert">Top Seller</p>
							</div>
						</c:when>
					</c:choose>
					<c:choose>
						<c:when
							test="${product.remainingStock >0 && product.remainingStock == 5 }">
							<p class="product-alert">5 REMAINING!</p>
						</c:when>
						<c:when
							test="${product.remainingStock >0 && product.remainingStock ==4 }">
							<p class="product-alert">4 REMAINING!</p>
						</c:when>
						<c:when
							test="${product.remainingStock >0 && product.remainingStock ==3 }">
							<p class="product-alert">3 REMAINING!</p>
						</c:when>
						<c:when
							test="${product.remainingStock >0 && product.remainingStock ==2 }">
							<p class="product-alert">2 REMAINING!</p>
						</c:when>
						<c:when
							test="${product.remainingStock >0 && product.remainingStock ==1 }">
							<p class="product-alert">1 REMAINING!</p>
						</c:when>
					</c:choose>
					<c:choose>
						<c:when test="${product.remainingStock ==0 }">
							<div class="tile sold-out">
								<span class="banner">Sold Out!</span>
							</div>
						</c:when>
					</c:choose>
					<p class="price">
						<fmt:formatNumber value="${product.price }" type="currency" />
					</p>


					<div class="rating">
						<c:choose>
							<c:when test="${product.averageRating > 4 }">
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
							</c:when>
							<c:when test="${product.averageRating > 3}">
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span>&#9734;</span>


							</c:when>
							<c:when test="${product.averageRating > 2}">
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>


							</c:when>
							<c:when test="${product.averageRating >1}">
								<span class="filled">&#9734;</span>
								<span class="filled">&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>

							</c:when>
							<c:when test="${product.averageRating == 1}">
								<span class="filled">&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>
							</c:when>
							<c:otherwise>
								<span>&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>
								<span>&#9734;</span>
							</c:otherwise>
						</c:choose>



					</div>
				</div>
				<hr>
			</div>

		</c:forEach>
	</div>
</div>


<%-- <!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<a class="product-image" href="#"> 
				<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
			</a>
			<div class="details">
				<p class="name">
					<a href="#">Grey Sofa</a>
				</p>

				<!-- .filled will make the star solid -->
				<div class="rating">
					<span class="filled">&#9734;</span> 
					<span>&#9734;</span> 
					<span>&#9734;</span>
					<span>&#9734;</span> 
					<span>&#9734;</span>
				</div>

				<p class="price">$939.00</p>
			</div>
		</div>

		<!-- Add the .top-seller class if the product is considered a Top Seller -->
		<div class="tile top-seller ">
			<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<a class="product-image" href="#"> 
				<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
			</a>
			<div class="details">
				<p class="name">
					<a href="#">Grey Sofa</a>
				</p>

				<!-- .filled will make the star solid -->
				<div class="rating">
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span>&#9734;</span>
				</div>

				<!-- Add the Top Seller <br/> and product alert if the product is considered a Top Seller -->
				<br />
				<p class="product-alert">Top Seller</p>
				<!-- Add the X remaining product alert if the remaining quantity is greater than 0, but less than or equal to 5 -->
				<p class="product-alert">4 remaining!</p>
				<p class="price">$930.00</p>
			</div>
		</div>

		<!-- Add the .sold-out class if the Remaining Stock is 0 -->
		<div class="tile  sold-out">
			<!-- Add the Sold Out banner if the Remaining Stock is 0 -->
			<span class="banner">Sold Out</span>

			<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<a class="product-image" href="#"> 
				<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
			</a>
			<div class="details">
				<p class="name">
					<a href="#">Grey Sofa</a>
				</p>

				<!-- .filled will make the star solid -->
				<div class="rating">
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span class="filled">&#9734;</span> 
					<span class="filled">&#9734;</span>
					<span>&#9734;</span>
				</div>

				<p class="price">$939.00</p>
			</div>
		</div>
	</div>
</div> --%>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />