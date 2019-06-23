<%--
  Created by IntelliJ IDEA.
  User: TableBear
  Date: 2018/6/18
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>显示用户</title>
</head>
<body>
<table>
    <c:forEach items="${users}" var="item">

    </c:forEach>
</table>
</body>
</html>
