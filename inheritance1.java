class grandfather{
    public void property(){
        System.out.println("access");
    }
}
class father extends grandfather{

}
class child extends grandfather{}
public class inheritance1 {
    public static void main(String[] args) {
        father f=new father();
        f.property();
        child c=new child();
        c.property();
    }
    
}
