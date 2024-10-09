import java.util.Scanner;
public class loop6 {
    public static void main(String args[]){
        int i,j,k,sum=0;
        // Scanner sc= new Scanner(System.in);

        // System.out.println("enter no. ending:");
        // i=sc.nextInt();
        // System.out.println("enter starting no");
        // j=sc.nextInt();

        // while(i>=j){
        //     System.out.println(i);
        //     sum=sum+i;
        //     i--;
        // }
        // System.out.println("sum of all the no is :");
        // System.out.println(sum);


        Scanner sc = new Scanner(System.in);
        System.out.println("enter no :");
        i=sc.nextInt();
        j=i*10;
        // i=k;
        while(j>=i){
            if(j%i==0){
                System.out.println(j);
                sum =sum+j;
            }
            
           j--;
        }
        System.out.println(sum);
    }
    
    
}
