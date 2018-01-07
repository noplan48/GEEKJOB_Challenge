<%-- 
    Document   : db13login2
    Created on : 2018/01/05, 15:56:38
    Author     : hirasawayuuichirou
--%>
<%@page import = "db8.db13login" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>ようこそ！平澤さん</h3>
        <p><a href="./Userinformation">ユーザー情報を見る</a></p>
        <p><a href="./showproduct">商品一覧を見る</a></p>
        
        <p>商品を登録する</p>
        <form action ="product" method ="post">
            
            商品番号<input type ="text" name ="productnumber"><br>
            商品名<input type ="text" name ="productname"><br>
            値段<input type ="text" name ="price"><br>
            個数<input type ="text" name ="stock"><br>
            
            <input type ="submit" name ="btnSubmit">
   
        </form>
        <p><a href="./db13login.jsp">ログアウト</a></p>
    </body>
</html>
