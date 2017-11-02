<%-- 
    Document   : challenge1-12
    Created on : 2017/11/02, 13:34:49
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

int i = 1000;
while((i<100) == false) {
    i = i / 2 ;
}

out.print(i);

%>



    </body>
</html>
