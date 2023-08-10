<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-09
  Time: 오전 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <jsp:useBean id="bean" class="dto.EditDto" scope="page"/>
    <jsp:getProperty name="bean" property="writer"/>
    <jsp:getProperty name="bean" property="contents"/>
    <jsp:getProperty name="bean" property="password"/>


</body>
</html>
