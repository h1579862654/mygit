<%--
  Created by IntelliJ IDEA.
  User: huang39
  Date: 2021-05-17
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery_3.5.1.js"></script>
    <script>
        function login() {
            console.info("登陆");
            $.ajax({
                url: "lg.do",
                data: {name: "123", pass: "456"},
                dataType:"json",
                success: function (dt) {
                    console.log(dt);
                    console.log(dt.k1);
                }
            });

        }
    </script>
</head>
<body>
    <input type="button" value="登陆" onclick="login()">
    <a href="st">测试1</a>
</body>
</html>
