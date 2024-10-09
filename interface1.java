interface emo
{
    public void show();
}
class shop implements emo{
    public void show(){
        System.out.println("interface");
    }
    public void dis(){
        System.out.println("calss");
    }
}


public class interface1 {
    public static void main(String[] args) {
        shop s =new shop();
        s.show();
        s.dis();
    }
    
}
