<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 4/8/2026
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách công cụ</h1>
<table border="1" cellpadding="10" cellspacing="10">
    <thead>
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Desc</th>
        <th>Category</th>
    </tr>
    </thead>
    <tbody>
<%--   đây là 1 thẻ của jstl nó cung cấp đẻ duyệt --%>
    <c:forEach var="t" items="${listTool}">
        <tr>
            <td><c:out value="${t.name}"/></td>
            <td><c:out value="${t.price}"/></td>
            <td><c:out value="${t.desc}"/></td>
            <td><c:out value="${t.category}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
