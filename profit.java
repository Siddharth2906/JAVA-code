import java.util.Scanner;

public class profit {
    public static void main (String args[]){

    Scanner sc=new Scanner(System.in);
     int cp,sp;
     System.out.println("enter cost price:=");
     cp=sc.nextInt();
     System.out.println("enter selling price:=");
     sp=sc.nextInt();
     if(cp>sp){
        System.out.println("seller will be in loss");
     }
     else{
        System.out.println("seller will be in profit");
     }

}

}
