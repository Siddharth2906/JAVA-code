
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Test5 {
    public static void main(String[] args) {
      
        try
        {
     Scanner sc=new Scanner(System.in);       
      
           
            System.out.println("Enter ID=");
            int id=sc.nextInt();
            
          //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","");
      
            //create preparedstatement object
            PreparedStatement ps=cn.prepareStatement("delete from employee where id=?");
            
            ps.setInt(1, id);
            //execute query
            boolean b=ps.execute();
            if(b==false)
            {
                System.out.println("Data delete");
            }
            
            
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
