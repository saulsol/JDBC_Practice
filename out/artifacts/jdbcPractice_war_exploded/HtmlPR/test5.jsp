<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-07
  Time: 오후 4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String data = request.getParameter("data");

        System.out.println(data);

        String state = request.getParameter("state");

        System.out.println(state);

        request.setAttribute("data", data);

        if(state.equalsIgnoreCase("redirect")){
            response.sendRedirect("redirect3.jsp");
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("dispatcher.jsp");
            rd.forward(request, response);
        }
    %>


</body>
</html>
