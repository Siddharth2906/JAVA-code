import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



public class Test7 {
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
            ResultSet rs=smt.executeQuery("select * from employee");
        
            while(rs.next())
            {
                int id=rs.getInt(1);
                String name=rs.getString(2);
                float salary=rs.getFloat(3);
                System.out.println(id+","+name+","+salary);
            }
            
            
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
