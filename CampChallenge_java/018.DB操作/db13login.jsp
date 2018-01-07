<%-- 
    Document   : db13 login
    Created on : 2017/12/26, 16:42:06
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
        <form action ="db13" method ="post">
            <h1>ログインページはこちらから</h1>
            <p>こちらのログインページをご利用いただくにはログインが必要です。</P>
            <p>ユーザー名とパスワードを入力してログインしてください。</p>
            
            ユーザー名<input type ="text" name ="ID"><br>
            パスワード<input type ="text" name ="password"><br>
            
            <input type ="submit" name ="btnSubmit" value ="login">
            <input type ="reset" name ="btnReset" value ="reset">
        </form>
        </body>
</html>
