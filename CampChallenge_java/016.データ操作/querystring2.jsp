<%-- 
    Document   : querystring2
    Created on : 2017/12/06, 18:24:48
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
            String s = request.getParameter("total");
            out.println("元の値");
            out.println(s);
            out.println("素因数は");
            
            int num = Integer.parseInt(s);
           
            int i = num;  //2で割り続ける。
            while(i%2==0){
                i = i/2;
                out.println(2 + ",");
            }
           
            int l = i;
            while(l%3==0){
                l = l/3;
                out.println(3 + ",");
            }
            
            int m = l;
            while(m%5==0){
                m = m/5; 
                out.println(5 + ",");
            }
            
            int n = m;
            while(n%7==0){
                n = n/7; 
                out.println(7);
            }
            
            out.print("余った値" + n);
            
                
            %>
    </body>
</html>
