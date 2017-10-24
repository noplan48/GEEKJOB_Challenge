<%-- 
    Document   : challenge1-3
    Created on : 2017/10/24, 15:47:52
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
            final int NUMBER = 100;
            int num = 20;
            
            int tasu = NUMBER + num;
            
            int hiku = NUMBER - num;
            
            int kakeru = NUMBER * num;
            
            int waru = NUMBER / num;
            
            out.print(tasu+"<br>"); // +1されてから、print
            out.print(hiku+"<br>"); // printしてから+1
            out.print(kakeru+"<br>"); // -1してから、print
            out.print(waru+"<br>");// printしてから-1
            %>
    </body>
</html>
