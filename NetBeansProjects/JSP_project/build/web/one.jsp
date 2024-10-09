<%-- 
    Document   : one
    Created on : 25-Apr-2024, 11:43:23 am
    Author     : SAIT
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Today's Date</h1>
        
        <%
          out.print(new Date());
            %>
            <br>
          <%=new Date()%>  
            
          <%!
              int x=456;
              %>
              <br>
          Value=<%=x%>
          
    </body>
</html>
