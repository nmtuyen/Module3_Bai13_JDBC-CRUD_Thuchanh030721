
<%--
  Created by IntelliJ IDEA.
  User: Admin-Thính
  Date: 7/3/2021
  Time: 9:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<center>
    <h1>List customer</h1>

<%--    <table BORDER="1">--%>
<%--        <tr>--%>
<%--            <th>ID</th>--%>
<%--            <th>Name</th>--%>
<%--            <th>Age</th>--%>
<%--            <th>Address</th>--%>
<%--        </tr>--%>
<%--        <c:forEach items="${customers}" var="customer">--%>
<%--            <tr>--%>
<%--                <td><c:out value="${customer.getId()}"/></td>--%>
<%--                <td><c:out value="${customer.getName()}"/></td>--%>
<%--                <td><c:out value="${customer.getAge()}"/></td>--%>
<%--                <td><c:out value="${customer.getAddress()}"/></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
    <c:forEach items="customers" var="cus">
        <h3>${cus.name} | ${cus.age}</h3>
    </c:forEach>
</center>
</body>
</html>
