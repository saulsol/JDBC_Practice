<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-09
  Time: 오후 2:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <%
    String id = (String) session.getAttribute("id");
    session.invalidate(); // 세션 파기
  %>

</body>
</html>
