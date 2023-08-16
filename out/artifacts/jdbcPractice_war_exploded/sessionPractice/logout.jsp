<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-16
  Time: 오전 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/ServletLogPractice" method="post">
        ID : <input type="text" name="id">
        PASSWORD : <input type="password" name="pwd">
        <input type="submit" value="로그인">
    </form>

    <p>

    <a href="/ServletLogPractice">로그아웃</a>


    Literals : ${"literals"}
    <c:out value="hello" />
</body>
</html>
