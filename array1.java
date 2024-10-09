import java.util.Scanner;
class array1{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int a[]=new int [5];
    System.out.print("enter array element");
    // for(int i=0;i<5;i++){
    
    //     a[i]=sc.nextInt();
    // }
    // for(int i=0;i<5;i++)
    // {
    //     System.out.println("print array");
    //     System.out.println(a[i]
    //     );
    // }
    int i=0;
    System.out.println(" scan element");
    while(i<5){
        a[i]=sc.nextInt();
        i++;

    }
    System.out.println("print array element");
    while(i<5){
        System.out.println(a[i]);
    }
    
    }

}