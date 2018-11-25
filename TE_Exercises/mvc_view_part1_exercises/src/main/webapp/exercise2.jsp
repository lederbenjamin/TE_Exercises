<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
				<c:set var="fib1" value="1"/>
				<c:set var="fib2" value="1"/>
	
				<c:forEach begin="1" end="25" var="numbers">
					<c:set var="temp" value="${fib1}"/>
					<c:set var="fib1" value="${fib1 + fib2}"/>
					<c:set var="fib2" value="${temp}"/>
	
				<li>${fib2}</li>
	
				</c:forEach>
		</ul>
	</body>
</html>