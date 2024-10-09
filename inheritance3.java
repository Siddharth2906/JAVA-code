class school{
    String school_name;
    String  school_address;
    int no_class;
    int total_teacher;
    int no_student;
    school(){
      school_name="jeeva jyoti hr sec school";
      school_address="banapura";
      no_class=45;
    }
    public void getdata1(){
        System.out.println(school_name);
        System.out.println(school_address);
        System.out.println(no_class);
    }
}
class teacher extends school
{
 int math_teacher;
 int english_teacher;
 int hindi_teacher;
 int science_techer;
teacher(){
    math_teacher=5;
    english_teacher=8;
    hindi_teacher=6;
    science_techer=4;
    total_teacher=math_teacher+english_teacher+hindi_teacher+science_techer;
}


public void getdata2(){
  System.out.println(math_teacher);
  System.out.println(english_teacher);
  System.out.println(hindi_teacher);
  System.out.println(science_techer);
  System.out.println(total_teacher);

}



}



class student extends school
{
    int class1_student;
    int class2_student;
    int class3_student;
    int class4_student;
    
student(){
         class1_student=30;
         class2_student=40;
         class3_student=45;
         class4_student=55;
         no_student =class4_student+class3_student+class3_student+class1_student; 
}
public void getdata3(){
    getdata1();
  
    System.out.println(class1_student);
    System.out.println(class2_student);
    System.out.println(class3_student);
    System.out.println(class4_student);
    System.out.println(no_student);
}

}


public class inheritance3 {
    public static void main(String[] args) {
        student s=new student();
        s.getdata3();
    }

}
