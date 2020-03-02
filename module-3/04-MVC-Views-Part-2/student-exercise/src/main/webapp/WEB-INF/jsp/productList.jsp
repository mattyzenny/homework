<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">

		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<%-- <c:param name="baseRoute" value="#" />--%>

		<c:param name="baseRoute" value="/products" />
	</c:import>

	<div class="main-content">

		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<li><a href="${minPrice }">Price - Low to High</a></li>
				<li><a href="${maxPrice }">Price - High to Low</a></li>
				<li><a href="${minRating }">Rating - High to Low</a></li>

			</ul>
		</div>
		<!-- 	<div class="main-content">
		Container for Sorting Choices
      
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	
    	
    	
    	****CREATE URLS (NO IF STATEMENTS)
    	PUT VARIABLES IN #
    	
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<li><a href="#">Price - Low to High</a></li>
				<li><a href="#">Price - High to Low</a></li>
				<li><a href="#">Rating - High to Low</a></li>
			</ul>
		</div> -->
		<!-- Container for all of the Products -->

		<div id="grid">

			<c:forEach var="product" items="${products }">
				<div class="tile ">

					<c:url var="productDetailsPageHref" value="/products/detail">
						<c:param name="id">${product.id}</c:param>

					</c:url>
					<a class="product-image" href="${productDetailsPageHref }"> <img
						src="<c:url value= "/images/product-images/${product.imageName }" />" />
					</a>
					<c:url var="productDetailsPageHref" value="/products/detail">
						<c:param name="id">${product.id}</c:param>

					</c:url>


					<div class="details">
						<p class="name">
							<c:out value="${product.name }" />
						</p>

						<c:choose>
							<c:when test="${product.topSeller }">
								<span class="banner top-seller">Top Seller!</span>
							</c:when>
						</c:choose>
						<c:choose>
							<c:when
								test="${product.remainingStock >0 && product.remainingStock == 5 }">
								<span class="product-alert">Only 5 left!</span>
							</c:when>
							<c:when
								test="${product.remainingStock >0 && product.remainingStock ==4 }">
								<span class="product-alert">Only 4 left!</span>
							</c:when>
							<c:when
								test="${product.remainingStock >0 && product.remainingStock ==3 }">
								<span class="product-alert">Only 3 left!</span>
							</c:when>
							<c:when
								test="${product.remainingStock >0 && product.remainingStock ==2 }">
								<span class="product-alert">Only 2 left!</span>
							</c:when>
							<c:when
								test="${product.remainingStock >0 && product.remainingStock ==1 }">
								<span class="product-alert">Only 1 left!</span>
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
				</div>

			</c:forEach>
		</div>
	</div>
</div>







<%-- 		<!-- The list of products is available using the `products` variable -->
		<div id="grid">

			<!-- 
			The following HTML shows different examples of what HTML could be rendered based on different rules. 
			For purposes of demonstration we've written it out so you can see it when you load the page up. 
			-->
			
			
			
			

			<!-- Standard Product -->
			<div class="tile ">
				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				<a class="product-image" href="#"> 
					<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
				</a>
				<div class="details">
					<p class="name">Grey Sofa</p>

					<!-- .filled will make the star solid -->
					<div class="rating">
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
						<span>&#9734;</span> 
						<span>&#9734;</span> 
						<span>&#9734;</span>
					</div>

					<p class="price">$939.00</p>
				</div>
			</div>

			<div class="tile ">
				<!-- Include this if the product is considered a Top Seller -->
				<span class="banner top-seller">Top Seller!</span>

				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				<a class="product-image" href="#"> 
					<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
				</a>
				<div class="details">
					<p class="name">Grey Sofa</p>

					<!-- .filled will make the star solid -->
					<div class="rating">
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
						<span class="filled">&#9734;</span> 
						<span class="filled">&#9734;</span>
						<span>&#9734;</span>
					</div>

					<!-- Include this if the remaining quantity is greater than 0, but less than or equal to 5 -->
					<span class="product-alert">Only 4 left!</span>
					<p class="price">$939.00</p>
				</div>
			</div>

			<!-- Add the .sold-out class if the remaining quantity is 0 -->
			<div class="tile sold-out">
				<!-- Include this if the remaining quantity is 0 -->
				<span class="banner">Sold Out</span>

				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				<a class="product-image" href="#"> 
					<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
				</a>
				<div class="details">
					<p class="name">Grey Sofa</p>

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
		</div>
	</div>
</div> --%>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />