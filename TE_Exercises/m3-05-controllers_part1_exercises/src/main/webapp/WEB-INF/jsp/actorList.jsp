<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>

<h2>Actor Search</h2>
<c:url var="formAction" value="/actorListResult" />
<form method="GET" action="${formAction}">
	<input type="text" name="lastName" id="name" placeholder="Search by last name" />
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>
<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${actors}" var="actor">
		<tr>
			<td><c:out value="${actor.firstName}" /></td>
			<td><c:out value="${actor.lastName}" /></td>
		</tr>
	</c:forEach>
</table>

<%@include file="common/footer.jspf"%>