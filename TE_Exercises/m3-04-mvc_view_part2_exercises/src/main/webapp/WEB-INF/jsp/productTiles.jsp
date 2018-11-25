<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Product Tiles" />
</c:import>
	<section>
		<h1>Toy Department</h1>
			<c:forEach var="product" items="${productList}">
					<c:url var="productImageUrl" value="/img/${product.imageName}" />
					<c:url var="productDetailUrl" value="/productDetail">
						<c:param name="productId" value="${product.productId}" />
					</c:url>
						<div>
								<a href="${productDetailUrl}"><img class="product-image"
								src="${productImageUrl}" /></a><br>
								<big><b>${product.name}</b></big>
								<c:if test="${product.topSeller == true}">
								<b style="color:red">BEST SELLER!</b>
								</c:if><br>
								by ${product.manufacturer}<br>
								$${product.price}<br>
								<c:set var="Weight" value="${product.weightInLbs}"/>
		                    	Weight <fmt:formatNumber value="${Weight}" maxFractionDigits="0"/> lbs<br>
								<c:set var="Rating" value="${product.averageRating}"/>
		                   		<fmt:formatNumber var="parsedRating" type="number" value="${Rating}" maxFractionDigits="0"/>
		                   	    <img src="img/${parsedRating}-star.png" width="25%" height="20%"/>
						</div>
			</c:forEach>
	</section>
</body>
</html>