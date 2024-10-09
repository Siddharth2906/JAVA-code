class student{
    int roll_no;
    String student_name;
    String school_name;
    String exam_name;
    int hall_no;
    String dayofexam;

public void setroll_no(int i){
    roll_no=i;
}
public void setstudent_name(String j){
    student_name = j;

}
public void setschool_name(String k){
    school_name=k;
}
public void setexam_name(String l){
    exam_name=l;
}
public void sethall_no(int m){
    hall_no=m;
}
public void setdayofexam(String n){
    dayofexam=n;
}
public int getroll_no(){
    return roll_no;
}

public String getstudent_name(){
    return student_name;
}
public String getschool_name(){
    return school_name;
}
public String getexam_name(){
    return exam_name;
}
public int gethall_no(){
    return hall_no;
}

public String getdayofexam(){
    return dayofexam;
}
public void show(){
    System.out.print(roll_no+"\n"+student_name+"\n"+school_name+"\n"+exam_name+"\n"+hall_no+"\n"+dayofexam);
}
}
public class class2 {
    public static void main(String[] args) {
        student s =new student();
        s.setroll_no(101);
        s.setstudent_name("siddharth");
        s.setschool_name("jeeva joti hr. sec schhol");
        s.setexam_name("math");
        s.sethall_no(5);
        s.setdayofexam("monday");
        s.show();

    }
}
