<%-- 
    Document   : db9
    Created on : 2017/12/23, 15:47:09
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
        <form action ="db9_1" method ="post"> <!-- db9にデータを送る処理-->
            プロフィール　<input type ="text" name ="profileID"><br>
            名前        <input type ="text" name ="name"><br>
            電話        <input type ="text" name ="tel"><br>
            年齢        <input type ="text" name ="age"><br> 
            生年月日     <input type ="text" name ="birthday"><br>
            
            <input type ="submit" name ="btnSubmit">
            
        </form>
    </body>
</html>
