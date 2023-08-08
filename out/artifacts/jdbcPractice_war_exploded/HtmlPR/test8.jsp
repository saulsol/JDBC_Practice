<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-08
  Time: 오후 3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  최초버퍼 : <%= out.getBufferSize()%>

  <%
    out.append("JAVA");
  %>

  남은버퍼 : <%= out.getRemaining()%>


</body>
</html>
