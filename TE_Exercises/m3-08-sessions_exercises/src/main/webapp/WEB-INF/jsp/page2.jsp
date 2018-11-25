<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:url var="newReviewUrl" value="/page2"/>

<form method="POST" action="${newReviewUrl}">

    <div>
        <label for="favoriteFood">What is your favorite food?</label>
        <input type="text" name="favoriteFood"/>


    </div>
    <br>

    <div>
        <input style="color: white; background-color: blue;" type="submit" value="Next"/>
    </div>

</form>
</body>
</html>