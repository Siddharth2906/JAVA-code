

class employee{
  int id; 
    String name;
    String company_name;
    String department_name;
    int employee_salary;
    int working_time;
     employee (){
       id=1;
         name ="siddharth";
         company_name ="tcs";
         department_name="tech";
        
    }
  



 }
   class company extends employee{

        company(){
            employee_salary=6000;
         working_time=8;
        }
    
   public void  getdata(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(company_name);
    System.out.println(department_name);
    System.out.println(employee_salary);
    System.out.println(working_time);
   }
}
public class inheritance2 { 
    public static void main(String[] args) {
        employee e=new employee();
        company c=new company();
        c.getdata();
    }
}
     
    

