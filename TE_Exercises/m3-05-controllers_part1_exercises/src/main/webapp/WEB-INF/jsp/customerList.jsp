<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Customers List" />

<%@include file="common/header.jspf"%>


<h2>Customer Search</h2>
<div>
	<div>
		<c:url var="formAction" value="/customerListResult" />
		<form method="GET" action="${formAction}">
			<div>
				<label for="search">name: </label> <input type="text" name="search"/>
			</div>
			<div>
				<label for="sort">Sort By: </label> <select name="sort">
					<option value="first_Name">First Name</option>
					<option value="last_Name">Last Name</option>
					<option value="email">Email</option>
				</select>
			</div>
			<input type="submit" value="Search Customers" />
		</form>
	</div>
		<div>
			<span>Name</span>
			<span style = "padding-left:300px">Email</span>
			<span style = "padding-left:300px">Active Member</span>
		</div>
		<div>
			<c:forEach var="customer" items="${customerList}">
				
					<span><c:out value="${customer.firstName}" /> <c:out
							value="${customer.lastName}" /></span>

					<span style = "padding-left: 250px"><c:out value=" ${customer.email}" /></span>

					<span style = "padding-left: 130px"><c:out value="${customer.active ? 'Yes' : 'No'}" /></span>
			</c:forEach>
	</div>
</div>

<%@include file="common/footer.jspf"%>