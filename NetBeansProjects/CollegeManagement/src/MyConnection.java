import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
   public static Connection getConnection()
   {
       try
       {
      //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            //create connection
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/College_Management","root","");
      return cn;
       }
       catch(Exception e)
       {
           
       }
       return null;
   }
}
