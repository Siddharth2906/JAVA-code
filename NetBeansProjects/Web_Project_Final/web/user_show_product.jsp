<%-- 
    Document   : show_product
    Created on : 25-Apr-2024, 12:21:51 pm
    Author     : SAIT
--%>

<%@page import="java.sql.*"%>
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
      
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
       
        PreparedStatement ps=cn.prepareStatement("select * from product");
       
       
        
       ResultSet rs=ps.executeQuery();
       
       %>
       <table border='2'>
           <caption><h1>List of products</h1></caption>
           <tr><th>Product ID</th><th>Product Name</th><th>Product Rate/kg</th></tr>
       <%
        while(rs.next())
        {
           String id=rs.getString(1);
           String name=rs.getString(2);
           String price=rs.getString(3);
           
           %>
           <tr><td><%=id%></td><td><%=name%></td><td><%=price%></td></tr>       
      <%     
        }
        out.println("</table>");
        }
        catch(Exception e)
        {
          out.println(e.getMessage());
        }
 
            %>
            <a href='Home'>Back to home</a>
    </body>
</html>
