<%-- 
    Document   : send_mail
    Created on : 26-Apr-2024, 11:57:21 am
    Author     : SAIT
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
            String email=request.getParameter("mail");
            
            %>
        <h2>Send Confirmation Mail To User</h2>
        <form action="SendMail">
            <pre>
Email        <input type="text" name="mail" value="<%=email%>" readonly>
Enter Message<textarea name="msg" rows="5" cols="25"></textarea>
Enter Time   <input type="time" name="t">
Enter Date   <input type="date" name="d">
      <input type="submit" value="Send Email">
            </pre>
        </form>
    </body>
</html>
