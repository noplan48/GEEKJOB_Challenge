<%-- 
    Document   : querystring1
    Created on : 2017/12/05, 15:50:56
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
            request.setCharacterEncoding("UTF-8");
            
            String s = request.getParameter("total"); //htmlの時の"username"とかと一緒で、URLに入れた変数をそのまま利用することができる。
            out.println("総額");
            out.println(s);
           
            String t = request.getParameter("count");
            out.println("個数");
            out.println(t);
            
            String r = request.getParameter("type");
            out.println("商品種別");
            out.println(r);
            
            int db = Integer.parseInt(s);       //stringは上で定義されているので、わざわざ上で書く必要がない。
            
            int da = Integer.parseInt(t);       //Integerで文字（String)をint(数字）に変換している。
            
            double dc =(db/da);
            out.println("一つあたりの値段");
            out.println(dc);
            
            if(db<3000){
                double de =(db*0.00);
            out.println("獲得ポイント無し");
            out.println(de);
            }
            
            if(3000<=db && db<5000){
            double de =(db*0.04);
            out.println("獲得ポイント");
            out.println(de);
            }
            
            if(db>=5000){
            double de =(db*0.05);
            out.println("獲得ポイント");
            out.println(de);
            }
            %>
    </body>
</html>