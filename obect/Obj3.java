import java.util.Scanner;

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
public void dis(){
    System.out.println(id);
    System.out.println(nm);
}
    
}
public class Obj3 {

    public static void main(String[] args) {

        Emp e=new Emp();
        Emp e1;
        e.setId(1);
        e.setNm("raj");
        System.out.println(e);//call to string method
        Emp[] p=new Emp[5];//obect array
   
      int ii;
      String n;
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++){
           System.out.println("enter five student data");
        ii=sc.nextInt();
        n=sc.next();
        p[i]=new Emp(ii,n);
      }
         for(int i=0;i<5;i++){
      p[i].dis();
      }




    }
    
}
