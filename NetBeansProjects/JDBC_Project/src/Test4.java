
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Test4 {
    public static void main(String[] args) {
      
        try
        {
     Scanner sc=new Scanner(System.in);       
      
            
            
            System.out.println("Enter updated name=");
            String name=sc.next();
            
            System.out.println("Enter ID which you want update=");
            int id=sc.nextInt();
            
          //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","");
      
            //create preparedstatement object
            PreparedStatement ps=cn.prepareStatement("update employee set name=? where id=?");
            ps.setString(1, name);
            ps.setInt(2, id);
            //execute query
            boolean b=ps.execute();
            if(b==false)
            {
                System.out.println("Data update");
            }
            
            
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
