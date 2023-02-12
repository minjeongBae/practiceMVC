<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>Welcome</title>
    <h2>step을 선택해주세요</h2>
</head>
<body>
    <form action="step2" method="post">
    <label>
        <input type="text" name="id"/> ID입력
    </label><br/>
    <label>
            <input type="text" name="text"/> step2로 이동
        </label><br/>
    <input type="checkbox" name="check"/> step1으로 이동<br/>
    <input type="submit" value="화면 이동"/>
    </form>
</body>
</html>