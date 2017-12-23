<%-- 
    Document   : db.8_1
    Created on : 2017/12/21, 15:08:40
    Author     : hirasawayuuichirou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> <!--htmlの記述と一致させる -->
       <form action ="db8" method = "post">
              <!-- formタグで括られた入力項目はこちら -->
              
              名前      <input type ="text" name ="name"><br>　
              
               <input type ="submit" name ="btnSubmit">
             
         </form>
    </body>
</html>