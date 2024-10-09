<%-- 
    Document   : add_product
    Created on : 25-Apr-2024, 12:04:56 pm
    Author     : SAIT
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            try
        {
        String pname=request.getParameter("pname");
            String pprice=request.getParameter("pprice");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
       
        PreparedStatement ps=cn.prepareStatement("insert into product(product_name,product_rate) values(?,?)");
        ps.setString(1, pname);
        ps.setString(2, pprice);
       
        
        boolean b=ps.execute();
        if(b==false)
        {
           
            RequestDispatcher rd=request.getRequestDispatcher("show_product.jsp");
        rd.forward(request, response);
        }
        }
        catch(Exception e)
        {
          out.println(e.getMessage());
        }

            %>
    </body>
</html>
