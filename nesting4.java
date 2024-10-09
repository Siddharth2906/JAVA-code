public class nesting4 {
    public static void main(String args[]){
        int i,j ;
        for(i=1;i<=100;i++){
            int count =0;
          for(j=2;j<i;j++){
            if(i%j==0){
                count++;
                break;
            }

          }
          if(count==0&&i!=1){
            System.out.println(i);
          }
        }
    }
    
}
