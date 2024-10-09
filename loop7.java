import java.util.Scanner;


public class loop7 {
    public static void main(String args[]){
      int num,sum=0,i=0, m ,n;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter numberr");
      num=sc.nextInt();

    //   while(num>0){
    //     i++;
    //     num=num/10;
    //   }
    //   System.out.println("total digit in this number");
    //   System.out.println(i);
    while(num>0){
        m=num%10;
        n=m*m*m;
        // sum=sum+m;
        sum=sum+n;
        num=num/10;
        
        
       
    }
    
    System.out.println("sum of this number is");
    System.out.println(sum);
    System.out.println(i);

    }

    
}
