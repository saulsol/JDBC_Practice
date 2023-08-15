<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-14
  Time: 오후 1:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        Object ob1 = session.getAttribute("MySessionName");
        String mySessionName = (String) ob1;
        out.print(mySessionName);

        session.invalidate(); //세션 객체 종료
    %>


</body>
</html>
