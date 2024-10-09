import java.util.Scanner;

class EO{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,rem;
        System.out.println("enter no.=");
        a=sc.nextInt();
        rem =a%2;
        if (rem == 0){
            System.out.print("even");
        }
        else{
            System.out.println("odd");
        }

        
    }
}