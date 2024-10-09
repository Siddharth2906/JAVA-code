import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class Test2 {
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
      
            //create statement object
            Statement smt=cn.createStatement();
            
            //execute query
            int i=smt.executeUpdate("insert into employee value("+id+",'"+name+"',"+sal+")");
            
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
