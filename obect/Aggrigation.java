/**
 * Address  
 */
 class Address   {
int hno;
String country;
public Address(int hno, String country) {
    this.hno = hno;
    this.country = country;
}
public int getHno() {
    return hno;
}
public void setHno(int hno) {
    this.hno = hno;
}
public String getCountry() {
    return country;
}
public void setCountry(String country) {
    this.country = country;
}
@Override
public String toString() {
    return "Address [hno=" + hno + ", country=" + country + "]";
}

 }
class Emp
 {

    int id;
String nm;
Address ad;//aggrigation  object of another class as a variable is called aggrigation;

public Emp() {
    }
public Emp(int id, String nm, Address ad) {
        this.id = id;
        this.nm = nm;
        this.ad = ad;
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
public Address getAd() {
    return ad;
}
public void setAd(Address ad) {
    this.ad = ad;
}
@Override
    public String toString() {
        return "Emp [id=" + id + ", nm=" + nm + ", ad=" + ad + "]";
    }


    public void changeAdress(String ss){
        ad.setCountry(ss);

    }
    
}


public class Aggrigation {
    

    public static void main(String[] args) {
        Address a=new Address(1,"india");
        Emp e=new Emp(1,"rahul",a);
        System.out.println(e);
        e.changeAdress("uk");
                System.out.println(e);


                
    }
}
