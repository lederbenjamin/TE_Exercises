<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<c:set var="pageTitle" value="Registration"/>
<%@include file="common/header.jspf" %>

<h2>Registration</h2>

<c:url var="registrationUrl" value="/register" />
<form:form action="${registrationUrl}" method="POST" modelAttribute="registration">

	<div>
		<label for="firstName">First Name:</label>
		<form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>	
		</div>
	
	<div>
		<label for="lastName">Last Name:</label>
		<form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>	
	</div>
	
	<div>
		<label for="email">Email:</label>
		<form:input path="email"/>
		<form:errors path="email" cssClass="error"/>
		<form:errors path="emailMatching" cssClass="error"/>
			
	</div>
	
	<div>
		<label for="confirmEmail">Confirm Email:</label>
		<form:input path="confirmEmail"/>
		<form:errors path="confirmEmail" cssClass="error"/>	
	</div>
	
	<div>
		<label for="password">Password:</label>
		<form:password path="password"/>
		<form:errors path="password" cssClass="error"/>	
		<form:errors path="passwordMatching" cssClass="error"/>
		
	</div>
	
	<div>
		<label for="confirmPassword">Confirm Password:</label>
		<form:password path="confirmPassword"/>
		<form:errors path="confirmPassword" cssClass="error"/>	
	</div>
	
	<div>
		<label for="birthDate">Date of Birth (YYYY-MM-DD):</label>
		<form:input path="birthDate"/>
		<form:errors path="birthDate" cssClass="error"/>	
	</div>
	
	<div>
		<label for="numOfTickets">Number of Tickets:</label>
		<form:input path="numOfTickets"/>
		<form:errors path="numOfTickets" cssClass="error"/>	
	</div>
	
	
	<input type="submit" value="Register!">


</form:form>

<%@include file="common/footer.jspf" %>