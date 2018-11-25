<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Product Tiles" />
</c:import>

	<section id="main-content">
		<h1>Toy Department</h1>
		<table style="border-collapse:collapse;">
		
			<tr>
			<td>&nbsp;</td>
			<c:forEach var="product" items="${productList}">
					<td><c:url var="productImageUrl"
							value="/img/${product.imageName}" /> <c:url
							var="productDetailUrl" value="/productDetail">
							<c:param name="productId" value="${product.productId}" />
						</c:url> <a href="${productDetailUrl}"><img src="${productImageUrl}"
							width="70%" height="20%" /></a></td>
			</c:forEach>
			</tr>
			
 			<tr>
			<td>&nbsp;</td>
			<c:forEach var="product" items="${productList}">
			<c:choose>
					<c:when test="${product.topSeller == true}">
						<td><b style="color: red">BEST SELLER!</b></td>
					</c:when>
					<c:otherwise>
						<td>&nbsp;</td>
					</c:otherwise>
			</c:choose>
			</c:forEach>
			</tr>
			
			<tr>
			<td style="padding-right: 30px;" align="left"><b>Name</b></td>
			<c:forEach var="product" items="${productList}">
			<td style="background-color: lightgray">${product.name}</td>
			</c:forEach>
			<td style="padding-right: 30px"></td>
			</tr>
			
			<tr>
			<td style="padding-right: 30px;" align="left"><b>Rating</b></td>
			<c:forEach var="product" items="${productList}">
			<c:set var="Rating" value="${product.averageRating}"/> 
			<fmt:formatNumber var="parsedRating" type="number" value="${Rating}" maxFractionDigits="0"/> 
			<td><img src="img/${parsedRating}-star.png" width="70%" height="15%"/></td>
			</c:forEach>
			</tr>
			
			<tr>
			<td style="padding-right: 30px;" align="left"><b>Mfr</b></td>
			<c:forEach var="product" items="${productList}">
			<td style="background-color: lightgray">${product.manufacturer}</td>
			</c:forEach>
			</tr>
			
			<tr>
			<td style="padding-right: 30px;" align="left"><b>Price</b></td>
			<c:forEach var="product" items="${productList}">
			<td style="font-size:20px;
						color:red;">$${product.price}</td>
			</c:forEach>
			</tr>
			
			<tr>
			<td style="padding-right: 30px;" align="left" nowrap><b>wt. (in lbs)</b></td>
			<c:forEach var="product" items="${productList}">
			<c:set var="Weight" value="${product.weightInLbs}"/> 
			<td style="background-color: lightgray"><fmt:formatNumber value="${Weight}" maxFractionDigits="0"/></td>
			</c:forEach>
			</tr>
			
		</table>
	</section>
</body>
</html>