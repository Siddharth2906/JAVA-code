import java.util.Scanner;
class loop4{
    public static void main(String args[]){
        int U_id,P_id;
       int uid=1234;
       int pid=1234;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user id:");
        U_id=sc.nextInt();
        System.out.println("enter password id:");
        P_id=sc.nextInt();

    if(uid==U_id&&pid==P_id){
        System.out.println("your id password is correct");
        System.out.println("succesfully login");

    }
    else{
        System.out.println("your id password is incorrect");
        System.out.println("plese enter correct id pass");
    
 

    }
}}