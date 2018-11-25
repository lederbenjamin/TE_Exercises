<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<title>Dummies!</title>
</head>
<body>
	
	<img alt="book picture" src="img/forDummies.png"><br>
	<c:url var="reviewPost" value="/reviewPost" />
	<a href="${reviewPost}"> Post a Message </a>

	<c:forEach var="review" items="${ReviewList}">
		<div>
			<div style="font-weight: bold;">
				<c:out value="${review.title}" />
			</div>
			<div style="margin-bottom: .5%;">
				by
				<c:out value="${review.username}" />
				on
				<fmt:parseDate value="${review.dateSubmitted}"
					pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime" type="both" />
				<fmt:formatDate pattern="dd/MM/yyyy" value="${parsedDateTime}" />
				at
				<fmt:formatDate pattern="HH:mm:ss" value="${parsedDateTime}" />
			</div>
			<div>
			<c:forEach begin="1" end="${review.rating}">
                <img src="img/star.png"/>
            </c:forEach>
			</div>
			<div>
				<c:out value="${review.text}" /><br>
			</div>
		</div>


	</c:forEach>
</body>
</html>