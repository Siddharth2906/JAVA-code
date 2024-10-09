class demo {
    int rn;
    String n;
    static String cn = "lnct";

    public static void changname()
    {
        cn="medical science collage";
    }

    public void show() {
        // changname();
        System.out.println("rollno=" + " " + rn);
        System.out.println("name =" + " " + n);
        System.out.println("collage name =" + " " + cn);

    }
}

public class static12 {
    public static void main(String[] args) {
        demo d=new demo();
        demo.changname();
        System.out.println("collage name=" + demo.cn);
        //  d.rn=123;
        //  d.n="raj";
        //  d.show();
        demo d1=new demo();
        d1.changname();
        d1.rn=234;
        d1.n="avi";
        d1.show();

    }
}
