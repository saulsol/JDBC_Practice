
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style>
          body { background-color : linen; color : green;
              margin-left : 40px; margin-right : 40px;}
          h3 { text-align : center; color : darkred;}
          hr { height : 5px; border : solid grey;
              background-color : grey }
          span { color: blue; font-size: 20px; }
      </style>
  </head>
  <body>

  <%
    for(int i=0; i<10; i++) { %>
           <h<%=i%>>Elvis Presley</h<%=i%>>
           <hr size=<%=10*i%> color="pink">
          <%
              if (i % 2 ==0){ %>
                <hr size=<%=10*i%> color="green">
              <% }
          %>
    <% }
  %>


  </body>
</html>
