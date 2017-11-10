<%-- 
    Document   : jsp
    Created on : 2017/11/09, 14:06:59
    Author     : hirasawayuuichirou
--%>



<html>

     <%@page import="org.camp.servlet.ResultData2" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
  <head>
  <%
    ResultData2 data = (ResultData2)request.getAttribute("DATA");
  %>
  <meta http-equiv="contentType" content="text/html: charset=UTF-8">
  <title>JSP Page</title>
  </head>
  <body>
      
      
  <%
    if(data != null){
      out.print("<h1>あなたの" + data.getD() + "の運勢は、" + data.getLuck() + "です</h1>");
    }
  %>
  </body>
    
</html>
