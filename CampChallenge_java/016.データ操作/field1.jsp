<%-- 
    Document   : field1
    Created on : 2017/12/04, 19:24:59
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
          request.setCharacterEncoding("UTF-8");             //htmlで、入れたい文字<>➡submit➡jspに飛ぶ
          String user =request.getParameter("userName"); //htmlから飛んできた値を回収。
          out.println(user);
          String man =request.getParameter("rdoSampleman");
          out.println(man);
          
          String music =request.getParameter("hobby1");
          out.println(music);
          String baseball =request.getParameter("hobby2");
          out.println(baseball);
          String noodole =request.getParameter("hobby3");
          out.println(noodole);
        %>
    </body>
</html>
