import java.util.Scanner;
public class array3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
    System.out.println("enter array element ");
    for(int i=0;i<10;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("print array");
    for(int i=0;i<10;i++){
        System.out.println(a[i]);
        if(a[i]%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
     
    }
    
}
