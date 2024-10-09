import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                System.out.println("element is found");
                System.out.println(i);
                break;

            }
        }}
        
}
