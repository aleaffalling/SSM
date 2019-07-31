<html>
<body>
<h2>Hello World!</h2>

<form action="<%=request.getContextPath()%>/UserLogin" method="post">
    <input type="text" name="u_name">
    <input type="password" name="u_password">
    <input type="submit" value="查询">
</form>

</body>
</html>
