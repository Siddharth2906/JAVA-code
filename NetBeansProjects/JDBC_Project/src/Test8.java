import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



public class Test8 {
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
                int id=rs.getInt("id");
                String name=rs.getString("NAME");
                float salary=rs.getFloat("salary");
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
