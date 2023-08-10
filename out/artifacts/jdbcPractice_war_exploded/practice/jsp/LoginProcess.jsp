<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023-08-09
  Time: 오후 1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String id = request.getParameter("id");
    String pass = request.getParameter("pass");
    if(id.equals("Admin") && pass.equals("1234")){ // 로그인 성공
//        pageContext.getSession().setAttribute("id", id);
        session.setAttribute("id", id);
        session.setMaxInactiveInterval(60); // 4분
        response.sendRedirect("list.jsp");
    }else{ // 로그인이 안된경우
        //response.sendRedirect("adminLogin.jsp"); // 스크립트 대비 자바가 먼저 실행된다.%>
        <script>
            alert('id or Pass Check')
            document.location.href = 'adminLogin.jsp'
        </script>

<% }%>


</body>
</html>
