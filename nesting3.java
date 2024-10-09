import java.util.Scanner;
public class nesting3 { 
    public static void main(String args[]){
        int i,rows,space ;
        Scanner sc =new Scanner(System.in);
        rows = sc.nextInt();
        for(i=1;i<=rows;i++){
            for(space=1;space<=(rows-i);space++){
                System.out.print(" ");
            }
            for(int k=0;k!=((2*i)-1);k++){
              System.out.print("*");
              
            }
        System.out.println("");
        }
    }
    
}
