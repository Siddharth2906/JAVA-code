import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
    //     int p_marks,e_marks;
    //     e_marks=33;
        Scanner sc=new Scanner(System.in);
    //     System.out.println("enter  student marks");
    //      p_marks=sc.nextInt();
    //     if(p_marks>e_marks){
    //         System.out.println("student has been passed");
    //     }
    //     else{
    //         System.out.println("student are not passed");
    //   
         int c_age,e_age;
         e_age=18;
         System.out.println("enter your current age");
         c_age=sc.nextInt();
         if(c_age>=e_age){
            System.out.println("you are elgibible for voting");
         }
         else{
            System.out.println("you are not eligible for voting");
         }




    }


    
}
