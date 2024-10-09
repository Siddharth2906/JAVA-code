import java.util.Scanner;
public class loop3 {
    public static void main(String args[]){
    char i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter cahracter");
    i=sc.next().charAt(0);

    if((i=='a')||(i=='e')||(i=='o')||(i=='u')||(i=='i')){
      System.out.println("this is vowel alphabet");
    }
    else{
      System.out.println("this is consonant alphabet");
    }
}
}

