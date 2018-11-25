<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="All Films List" />
<%@include file="common/header.jspf"%>

<h2>Film Search</h2>
<c:url var="formAction" value="/filmListResult" />
<form method="GET" action="${formAction}">
<div style="display:inline">
		<label for="minLength">Minimum Length: </label> <input type="text"
			name="minLength" id="minLength" placeholder="30" />
		<label for="maxLength">Maximum Length: </label> <input type="text"
			name="maxLength" id="maxLength" placeholder="120" />
		<label for="genre">Genre: </label> <select name="genre" id="genre">
			<option value="Action">Action</option>
			<option value="Animation">Animation</option>
			<option value="Children">Children</option>
			<option value="Classics">Classics</option>
			<option value="Comedy">Comedy</option>
			<option value="Documentary">Documentary</option>
			<option value="Drama">Drama</option>
			<option value="Family">Family</option>
			<option value="Foreign">Foreign</option>
			<option value="Games">Games</option>
			<option value="Horror">Horror</option>
			<option value="Music">Music</option>
			<option value="New">New</option>
			<option value="Sci-Fi">Sci-Fi</option>
			<option value="Sports">Sports</option>
			<option value="Travel">Travel</option>
		</select>
	<input class="formSubmitButton" type="submit" value="Search Films" />
</div>
</form>

<table>
	<tr>
		<th>Title</th>
		<th>Description</th>
		<th>Release Year</th>
	</tr>
	<tr>
		<c:forEach var="film" items="${filmList}">
			<tr>
				<td><c:out value="${film.title}" /></td> 
				<td><c:out value="${film.description}" /></td>
				<td><c:out value="${film.releaseYear}" /></td>
			</tr>
		</c:forEach>
</table>

<%@include file="common/footer.jspf"%>