import java.util.Scanner;
public class array4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [10];
        int max=0,index=0;
        System.out.println("enter array element");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("the greatest no is "+max+" at index  no "+index);

    }
    
}
