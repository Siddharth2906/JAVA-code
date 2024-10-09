
 class  Emp {

    int id;
    String nm;
    // public Emp() {
    // }
    // public int getId() {
    //     return id;
    // }
    // public void setId(int id) {
    //     this.id = id;
    // }
    // public String getNm() {
    //     return nm;
    // }
    // public void setNm(String nm) {
    //     this.nm = nm;
    // }
    // @Override
    // public String toString() {
    //     return "Emp [id=" + id + ", nm=" + nm + "]";
    // }
public void disp(){
    System.out.println(id);
    System.out.println(nm);
}
    
}
public class Obj {

    public static void main(String[] args) {

        Emp e=new Emp();
        e.id=1;
        e.nm="string";
   e.disp();;//call to string method
        
    }
    
}
