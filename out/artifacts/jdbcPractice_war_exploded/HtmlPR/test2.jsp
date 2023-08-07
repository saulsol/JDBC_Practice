
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

<script>
    
    function showHtml(obj) {
        console.log(obj)
        console.log(obj.innerHTML)
        obj.innerHTML = "<b>CLICK"+obj.innerHTML+"</b>"
    }

    
</script>

</head>
<body>

<p onclick="showHtml(this)" align="right"><b>java</b></p> <p onclick="showHtml(this)">html</p> <p>css</p> <p><sup>Spring</sup></p>

<font size="1">Spring legacy</font>


</body>
</html>
