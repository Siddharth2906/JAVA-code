class student{
    int roll_no;
    String name;
    String school_name;
      String exam_name;
    int hall_no;
    String dayofexam;
    student(int i,String j,String k,String l,int m,String n){
         roll_no =i;
         name =j;
         school_name=k;
         exam_name=l;
         hall_no=m;
         dayofexam=n;
    }
    student(student s){
         roll_no =s.roll_no;
         name =s.name;
         school_name=s.school_name;
         exam_name=s.exam_name;
         hall_no=s.hall_no;
         dayofexam=s.dayofexam;

    }
         public void show(){
             System.out.println(roll_no+"\n"+name+"\n"+school_name+"\n"+exam_name+"\n"+hall_no+"\n"+dayofexam);
         }

    
}


public class constructor2 {
    public static void main(String[] args) {
        student s= new student(101, "siddharth ", "jeeva jyoti hr.sec school", "math", 6, "monday");
           s.show();;
           student v= new student(s);
           v.show();
    }
    
}
