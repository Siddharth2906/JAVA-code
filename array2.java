import java.util.Scanner;
public class array2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int sum =0,average;
        int a,b=0;

        System.out.println("enter array element");
        for(int i =0;i<10;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            

        }
        System.out.println("enter search no");
        a=sc.nextInt();
        System.out.println("print array");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
            if(arr[i]==a){
                 b=i;
                 arr[i]=6;
            }
            
        }
        System.out.println("the sum of array ");
        System.out.println(sum);
        System.out.println("the average of array is ");
        System.out.println(sum/10);
        System.out.println("element"+a+"found at index no"+b);
        System.out.println("print update array");
          for(int i=0;i<10;i++){
            System.out.println(arr[i]);
          
           

    }
}
}
