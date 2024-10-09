
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First implements Servlet
{

    public First()
    {
        System.out.println("Constructorrrrrrrrrrrrrr");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        
        System.out.println("initttttttttttt");
    
    }

    @Override
    public ServletConfig getServletConfig() {
    return null;    
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter pw=res.getWriter();
      pw.print("Hello All");
        System.out.println("serviceeeeeeeeeeeeeeeeeeeeee");
    }

    @Override
    public String getServletInfo() {
    return null;   
    }

    @Override
    public void destroy() {
        System.out.println("destroyyyyyyyyyyyyyyyyyyyyy");  
    }
    
}