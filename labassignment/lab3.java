public class lab3 {
  
    public static void main(String[] args) {
        int i[]={1,2,3,4};
    
        try {
            System.out.println(i[8]);
            
        } catch (Exception e) {
            System.out.println("something went wrong");
            System.out.println("this index is not avilable");
        }
        finally{
            System.out.println("the try catch is finally finished");
        }
    }
}
