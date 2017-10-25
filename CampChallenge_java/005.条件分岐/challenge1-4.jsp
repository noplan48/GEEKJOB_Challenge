<%-- 
    Document   : challenge1-4
    Created on : 2017/10/25, 13:58:01
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
int num = 1;

// else if文を追加しました。
// if文の条件を満たさなかった場合、else if文が実行されます。
// これにより、「変数の中身は50です！」と表示されます。
if (num == 1) {
    out.print("1です！");
} else if (num == 50) {
    out.print("変数の中身は50です！");
} else {
    out.print("変数の中身は想定外です！");
}
%>
    </body><br>

    <body>
        
<%
int num1 = 2;

// else if文を追加しました。
// if文の条件を満たさなかった場合、else if文が実行されます。
// これにより、「変数の中身は50です！」と表示されます。
if (num == 100) {
    out.print("変数の中身は100です！");
} else if (num1 == 2) {
    out.print("プログラミングキャンプ！");
} else {
    out.print("変数の中身は想定外です！");
}

%>
    </body><br>
    
    <body>
        
<%
int num2 = 3;

// else if文を追加しました。
// if文の条件を満たさなかった場合、else if文が実行されます。
// これにより、「変数の中身は50です！」と表示されます。
if (num == 100) {
    out.print("変数の中身は100です！+<br>");
} else if (num == 50) {
    out.print("変数の中身は50です！+<br>");
} else {
    out.print("その他です！");
}
%>
    </body><br>
</html>
