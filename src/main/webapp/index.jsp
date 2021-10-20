<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Welcome to this app-<spring:eval expression="@environment.getProperty('spring.application.name')"/></h1>
<script src="/index.js"></script>
</body>
</html>