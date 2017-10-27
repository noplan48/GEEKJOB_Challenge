<%-- 
    Document   : challenge-9
    Created on : 2017/10/27, 17:45:37
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
        <%@ page import="java.util.HashMap" %>
<%@ page import="java.util.*" %>
<%

HashMap<String, String> user1 =
            new HashMap<String, String>();

HashMap<String, String> user2 =
            new HashMap<String, String>();

HashMap<String, String> user3 =
            new HashMap<String, String>();

HashMap<String, String> user4 =
            new HashMap<String, String>();

user1.put("word", "AAA,");

out.print("1,"+ user1.get("word"));

user2.put("word", "world,");

out.print("hello,"+ user2.get("word"));

user3.put("number", "33,");

out.print("soeda,"+ user3.get("number"));

user4.put("number", "20,");

out.print("20,"+ user4.get("number"));

%>
    </body>
</html>
