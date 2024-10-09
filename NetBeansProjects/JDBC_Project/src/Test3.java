
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Test3 {
    public static void main(String[] args) {
      
        try
        {
     Scanner sc=new Scanner(System.in);       
      
            System.out.println("Enter ID=");
            int id=sc.nextInt();
            
            System.out.println("Enter name=");
            String name=sc.next();
            
            System.out.println("Enter Salary=");
            float sal=sc.nextFloat();
            
            
          //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            //create connection
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","");
      
            //create preparedstatement object
            PreparedStatement ps=cn.prepareStatement("insert into employee values(?,?,?)");
            ps.setInt(1, id);
             ps.setString(2, name);
             ps.setFloat(3, sal);
            //execute query
            boolean b=ps.execute();
            if(b==false)
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
