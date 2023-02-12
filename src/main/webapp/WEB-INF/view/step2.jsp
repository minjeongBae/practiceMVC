<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
    welcome Step2
</head>
<body>
    <h2> ${id} </h2> <br/>
    <h3> ${text} </h3> <br/>
    <h3> ${check} </h3> <br/>
    <form action="step2-1" method="post">
        <input type="number" name="num"/>
        <input type="submit" value="화면 이동"/>
    </form>
</body>
</html>