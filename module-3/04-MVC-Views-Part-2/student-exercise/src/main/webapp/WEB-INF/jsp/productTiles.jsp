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
	<div class="flexContainer">
		<!-- *****		<div class="tile  ">
 -->
		<c:forEach var="product" items="${products}">
			<div class="flexContainerTile">
				<c:url var="productDetailURL" value="/productDetail">
					<c:param name="categoryId" value="${product.categoryId }" />
				</c:url>

				<a href="${productDetailURL }">
					<img class ="productImage" src="<c:url value= "/images/product-images/${product.imageName }" />"/>
				</a>
				<div class="flexContainerTextTiles">
					<h4 class="link">
						<a href="${productDetailURL }"><c:out value="${product.name}" />
						</a>
					</h4>
				</div>
				<div class="price">
					<c:choose>
						<c:when test="${product.topSeller }">
							<p>BEST SELLER!</p>
						</c:when>
					</c:choose>
				</div>
				<div class="blue">
					<c:choose>
						<c:when test="${product.remainingStock < 5 }">
 	 	Only <c:out value="${product.remainingStock }" /> left!
 	</c:when>
					</c:choose>
				</div>

				<div class="priceformat">
					<fmt:formatNumber value="${product.price }" type="currency" />
				</div>
				<div>
					weight
					<c:out value="${product.weightInLbs }" />
					lbs
				</div>
				<fmt:formatNumber type="number" maxFractionDigits="0"
					value="${product.averageRating }" var="starsImage" />
				<img class="ratingTiles" src="images/${starsImage }-star." />
			</div>
		</c:forEach>
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