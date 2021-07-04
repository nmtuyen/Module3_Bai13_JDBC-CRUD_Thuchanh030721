<%--
  Created by IntelliJ IDEA.
  User: Admin-Thính
  Date: 7/4/2021
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Customer</title>
</head>
<body>
<form action="/customers" method="post">
    <input type="hidden" name="action" value="create">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="text" name="age">
    <input type="text" name="address">
    <button>Create</button>
</form>
</body>
</html>
