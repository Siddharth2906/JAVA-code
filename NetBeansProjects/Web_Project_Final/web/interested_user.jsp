<%-- 
    Document   : interested_user
    Created on : 26-Apr-2024, 11:41:27 am
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
       
        PreparedStatement ps=cn.prepareStatement("select * from user where status=?");
        
        ps.setBoolean(1, true);
        
        
        
       ResultSet rs=ps.executeQuery();
       
       %>
       <table border='2'>
           <caption><h1>List of interested user</h1></caption>
           <tr><th>User Id</th><th>User Name</th><th>User Email</th><th>User Mobile</th><th>Send Mail</th></tr>
       
       <%
        while(rs.next())
        {
           String id=rs.getString(1);
           String name=rs.getString(2);
           String mob=rs.getString(4);
           String email=rs.getString(3);
           
    %>
    
    <tr><td><%=id%></td><td><%=name%></td><td><%=email%></td><td><%=mob%></td><td><a href="send_mail.jsp?mail=<%=email%>">Send Mail</a></td></tr>
    <%
 
}
out.print("</table>");
}
        catch(Exception e)
        {
          out.println(e.getMessage());
        }       
            
            %>
    </body>
</html>
