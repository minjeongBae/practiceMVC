<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
    Date time = new Date();
    SimpleDateFormat dateFormat
        = new SimpleDateFormat("yyyy-MM-dd, a hh:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
    Android
</head>
<body>
    <br> android start </br>
    ${androidID} 님 반갑습니다.
    <br> android page </br>
    <br> 지금은 <%= dateFormat.format(time) %> 입니다. </br>
</body>
</html>