<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Product Tiles" />
</c:import>
<html>
<section>
	<div id ="box_0">
		<table style="text-align: left">
			<tr>
				<td><c:url var="productImageUrl"
							value="/img/${product.imageName}" /> <c:url
							var="productDetailUrl" value="/productDetail">
							<c:param name="productId" value="${product.productId}" />
						</c:url> <a href="${productDetailUrl}"><img src="${productImageUrl}"/></a></td>
				<td style="vertical-align:top"><br><b><big>${product.name}</big></b>
				<c:if test="${product.topSeller == true}">
								<b style="color:red">BEST SELLER!</b>
								</c:if><br>
								by ${product.manufacturer}<br>
				<c:set var="Rating" value="${product.averageRating}"/>
		                   		<fmt:formatNumber var="parsedRating" type="number" value="${Rating}" maxFractionDigits="0"/>
		                   	    <img src="img/${parsedRating}-star.png" width="25%" height="20%"/><br><br>
		                   	    <b style="color:red">Price: $${product.price}</b><br>		                   
		                   	    <c:set var="Weight" value="${product.weightInLbs}"/>
		                    	<b>Weight</b> <fmt:formatNumber value="${Weight}" maxFractionDigits="0"/> lbs<br><br>
		                    	
		                    	<b>Description:</b> ${product.description}
				</td>
			</tr>
		</table>
	</div>
</section>
</body>
</html>