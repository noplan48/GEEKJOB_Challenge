<%-- 
    Document   : challenge1-6
    Created on : 2017/10/26, 13:47:43
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
            
    char character  = 'A';
         
switch(character) {
    
case 'A':
out.print("英語 <br>");
break;

case 'あ':
out.print("日本語 <br>");
break;

default:
break;
}

%>
        
    </body>
</html>
