import java.util.Scanner;
public class lopp1 {
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no");
        i=sc.nextInt();
        System.out.println("enter lst no");
        j=sc.nextInt();
        // while(i<=j){
        //     System.out.print(i);
        //     System.out.print("\n");
        //     i++;
        // }
while(i<=j){
     if(i%2==0){
        System.out.println("even");
        System.out.println(i);
     }
    //  else{
    //       System.out.println("odd");
    //       System.out.println(i);
    //  }
    
    i++;}

}}
