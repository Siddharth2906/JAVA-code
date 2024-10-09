abstract class shop{
    abstract public void show();
    
}
class product extends shop{
    public void show(){
        System.out.println("abstract");
    }
}


public class abstract1 {
    public static void main(String[] args) {
        product p= new product();
        p.show();
        
    }

}
