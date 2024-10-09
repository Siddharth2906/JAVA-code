import java.util.Scanner;
public class lopp5 {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");
        a=sc.nextInt();
         System.out.println("enter value of b:");
         b=sc.nextInt();

    if(!(a>b)){
  System.out.println("not");
      System.out.println("b is greatest");
    } 
    else{
      System.out.println("a is greatest");

    }
    
}
}