<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.Health"%>
<% Health health = (Health) request.getAttribute("health");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HealthCheck</title>
</head>
<body>
<h1>Result of HelathCheck</h1>
<p>
Height<%= health.getHeight() %><br>
Weight<%= health.getWeight() %><br>
BMI <%= health.getBmi() %><br>
BodyType <%= health.getBodyType()%><br>
<a href = "HealthCheck">Top Page
</body>
</html>