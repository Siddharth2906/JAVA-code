import java.util.Scanner;
class loop2{
    public static void main(String args[]){
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no");
    i=sc.nextInt();
    j=i;
    while(i<=(j*10)){
        if(i%j==0){
            System.out.print(i);
            System.out.print("\n");
        }
        i++;
    }

    }
}