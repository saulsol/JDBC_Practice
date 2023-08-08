<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-08
  Time: 오후 3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="1kb" %>
<html>
<head>
    <title>Current buffer</title>
</head>
<body>

  <h1>
      currentBuffer<%= out.getBufferSize()%>
      CurrentAutoFlush<%= out.isAutoFlush()%>

    <%
      for(int i=0; i<30; i++){
        out.print("현재 남은 버퍼의 크기" + out.getRemaining()+ "<br>");

      }

    %>

  </h1>


</body>
</html>
