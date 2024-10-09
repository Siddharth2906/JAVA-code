
 class  Emp {

    int id;
    String nm;
    public Emp(int id, String nm) {
        this.id = id;
        this.nm = nm;
    }
    public Emp() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", nm=" + nm + "]";
    }

    
}
public class Obj4 {

    public static void main(String[] args) {

        Emp e=new Emp();
        Emp e1;
        e.setId(1);
        e.setNm("raj");
        System.out.println(e);//call to string method
        Emp[] p=new Emp[5];//obect array
        p[0]=new Emp(1,"rahyul");
          p[1]=new Emp(1,"rahyul");
            p[2]=new Emp(1,"rahyul");
              p[3]=new Emp(1,"rahyul");
                p[4]=new Emp(1,"rahyul");



                System.out.println(p[0].getId());
                p[0].setId(44);
                                System.out.println(p[0].getId());

    }
    
}
