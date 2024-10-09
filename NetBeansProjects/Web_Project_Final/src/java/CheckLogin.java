/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;
/**
 *
 * @author SAIT
 */
public class CheckLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =response.getWriter();
        
         
         try
        {
       String email=request.getParameter("mail");
         String pwd=request.getParameter("pwd");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
       
        PreparedStatement ps=cn.prepareStatement("select * from user where mail=? and binary password=?");
        
        ps.setString(1, email);
        
        ps.setString(2, pwd);
        
       ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
           String id=rs.getString(1);
           String name=rs.getString(2);
           String mob=rs.getString(4);
           
           
            HttpSession hs=request.getSession(true);
            hs.setAttribute("email", email);
            
            hs.setAttribute("id", id);
            hs.setAttribute("name", name);
            hs.setAttribute("mob", mob);
  RequestDispatcher rd=request.getRequestDispatcher("Home");
rd.forward(request, response);
}
else
        {
     out.println("<h2>Invalid emailid or password</h2>");       
         RequestDispatcher rd=request.getRequestDispatcher("index.html");
rd.include(request, response);   
        }
}
        catch(Exception e)
        {
          out.println(e.getMessage());
        }
    
         
         
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
