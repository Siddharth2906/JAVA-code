public class nesting2 {
   public static void main(String args[]) {
    int i,j ,number=1;
    // for(i=5;i>=1;i--){
    //    for(j=1;j<=i;j++){
    //     System.out.print(j+"");
    //    }
    //    System.out.println();
    // }
     for(i=1;i<=4;i++){
       
       for(j=1;j<=i;++j){
        System.out.print(number);
        number++;
        
       }
       System.out.println();
    }
   }
}
