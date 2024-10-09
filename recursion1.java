class demo{
    public void show(){
        System.out.println("hello world");
        show();
    }
}
public class recursion1 {
    public static void main(String[] args) {
        demo d = new demo();
        d.show();
    }
}