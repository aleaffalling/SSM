<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<form action="<%=request.getContextPath()%>/UserLogin" method="post">
    <input type="text" name="u_id">
    <input type="text" name="u_name">
    <input type="password" name="u_password">
    <input type="submit" value="查询">

</form>
<button value="json" onclick="getJson()">json</button>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
<script>
    function getJson() {
        $.ajax({
            type: 'post',
            data:"u_id=1&u_name=一叶",
            url: '<%=request.getContextPath()%>/Json',
            success: function (data) {
                alert(data);
            }
        });
    }
</script>
</html>
