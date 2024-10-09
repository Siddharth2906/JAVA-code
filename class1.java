class Employee{
    int Employee_id;
    String Employee_name;
    String company_name;
    String department_name;
    int Employee_salary;
    int working_time;
    public void show(){
System.out.print(Employee_id+"\n"+Employee_name+"\n"+company_name+"\n"+department_name+"\n"+Employee_salary+"\n"+working_time+"hours");
}
}
public class class1 {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Employee a=new Employee();
        Employee b=new Employee();
        Employee c=new Employee();
        Employee d=new Employee();
        Employee e=new Employee();
        a.Employee_id=1;
        a.Employee_name="siddharth";
        a.company_name="tcs";
        a.department_name="management";
        a.Employee_salary=6000;
        a.working_time=8;

        b.Employee_id=2;
        b.Employee_name="harsh";
        b.company_name="tcs";
        b.department_name="security";
        b.Employee_salary=6000;
        b.working_time=8;

        c.Employee_id=3;
        c.Employee_name="shubham";
        c.company_name="tcs";
        c.department_name="cleaning";
        c.Employee_salary=6000;
        c.working_time=8;

        d.Employee_id=4;
        d.Employee_name="rishii";
        d.company_name="tcs";
        d.department_name="electrical";
        d.Employee_salary=6000;
        d.working_time=8;

        e.Employee_id=5;
        e.Employee_name="mannu";
        e.company_name="tcs";
        e.department_name="tech";
        e.Employee_salary=6000;
        e.working_time=8;

        a.show();
        b.show();
        c.show();
        d.show();
        e.show();

    }
    
}
