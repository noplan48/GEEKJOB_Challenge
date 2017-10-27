<%-- 
    Document   : challenge1-8
    Created on : 2017/10/27, 14:49:08
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
     <%@ page import="java.util.ArrayList" %>
<%

    String[] data = {"10,", "100,", "soeda,", "hayashi,","-20,","118,","END"};

out.print(data[0]);

out.print(data[1]);

out.print(data[2] ="33,");

out.print(data[3]);

out.print(data[4]);

out.print(data[5]);

out.print(data[6]);

%>
    </body>
</html>
