<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-14
  Time: 오후 1:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        session.setAttribute("MySessionName", "javaSession");
        // session 이 나온 이유 : 클라이언트의 정보를 서버가 저장하기 위해
        // session 은 객체이다.

        session.setAttribute("MyNum", 12345);
        session.setMaxInactiveInterval(120);
        //


    %>

    <a href="sessionGet.jsp"> go </a>


</body>
</html>
