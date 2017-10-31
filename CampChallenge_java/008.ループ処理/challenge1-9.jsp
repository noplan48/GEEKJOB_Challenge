<%-- 
    Document   : challenge1-9
    Created on : 2017/10/30, 15:54:52
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
long total =8;

// i++ は i = i + 1 と同じ意味
for (int i = 1; i < 20; i++) {
    total = total *8;
}

out.print(total);

%>
        
    </body>
</html>
