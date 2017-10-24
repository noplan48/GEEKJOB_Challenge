<%-- 
    Document   : challenge1-2
    Created on : 2017/10/24, 13:20:59
    Author     : hirasawayuuichirou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
    <body>
        <%
String profile = "私の名前は、平澤裕一郎です。27歳です。Javaを学習中です。";

out.print("こんにちは！");

out.print(profile);
%>
    </body>
</html>
