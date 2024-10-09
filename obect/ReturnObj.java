
 class  Manager {

    public Connect getConnect(){
        Connect c=new Connect(5);
        return c;

    }

public void Mm(){
    System.out.println("this is managaer class");
}

}

class Connect{
    int i;


    public Connect(int i) {
        this.i = i;
    }


    public Connect() {
    }


    public int getI() {
        return i;
    }


    public void setI(int i) {
        this.i = i;
    }


    public void dis(){
    System.out.println("this is connection class="+i);
    }

}



public class ReturnObj {
    public static void main(String[] args) {
        Manager m=new Manager();
       Connect cc= m.getConnect();
       cc.dis();
       cc.setI(4);
              cc.dis();


    }
    
}
