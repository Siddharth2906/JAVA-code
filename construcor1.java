class employee{
    int id; 
    String name;
    String company_name;
    String department_name;
    int employee_salary;
    int working_time;
     
    employee(){ 
        id=1;
         name ="siddharth";
         company_name ="tcs";
         department_name="tech";
        employee_salary=6000;
         working_time=8;

    
     }
       public void show(){
System.out.print(id+"\n"+name+"\n"+company_name+"\n"+department_name+"\n"+employee_salary+"\n"+working_time+"hours");
}






}
public class construcor1 {
    public static void main(String args[]){
        employee e=new employee();
        e.show();
        

    }
    
}
