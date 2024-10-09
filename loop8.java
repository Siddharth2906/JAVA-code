import java.util.Scanner;
public class loop8 {
    public static void main(String args[]){
        int num, sum =0,m,n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        
        while(num>0){
            
           m=num%10;
           sum=sum+m;
           n=((n*10)+m);
           num=num/10;
            
        }
System.out.println(n);
System.out.println(sum);



    }
    
}
