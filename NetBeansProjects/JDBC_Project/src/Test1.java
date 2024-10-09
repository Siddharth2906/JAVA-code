import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Test1 {
    public static void main(String[] args) {
      
        try
        {
            
           
            
            
          //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            //create connection
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","");
      
            //create statement object
            Statement smt=cn.createStatement();
            
            //execute query
            int i=smt.executeUpdate("insert into employee values(1001,'Amit',1500.0)");
        
            if(i>0)
            {
                System.out.println("Data insert");
            }
            
            
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
