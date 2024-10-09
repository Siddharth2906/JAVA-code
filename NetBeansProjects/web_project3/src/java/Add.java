
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        
        String num1=req.getParameter("no1");
        String num2=req.getParameter("no2");
        
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        pw.println("Addition="+(n1+n2));
    }
   
}