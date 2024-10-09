
import java.util.Scanner;

class Launch {
int year;
String name;
 public void modeldisp(){

    System.out.println("launch year is "+year);
    System.out.println("launch year is "+name);

 }

}

 class Features extends Launch{
String speed;
String mileage;
String variant;
String fuel_type;
public void Featuresdisp()
{
   System.out.println("max speed is:"+speed);
   System.out.println("mileage is:"+mileage);
   System.out.println("variant is:"+variant);
   System.out.println("fuel_type is:"+fuel_type);
}
}

public class Car extends Features{
   public void disp
   (){
      modeldisp();
      Featuresdisp();

   }
   public static void main(String[] args) {
     
      Car c=new Car();

      Scanner sc=new Scanner(System.in);
      
     System.out.println("enter car name");
     c.name=sc.next();
     System.out.println("enter car year");
     c.year=sc.nextInt();
     System.out.println("enter car speed");
     c.speed=sc.next();
     System.out.println("enter car mileage");
     c.mileage=sc.next();
     System.out.println("enter car variant");
     c.variant=sc.next();
   
     System.out.println("enter car fuel type");
     c.fuel_type=sc.next();
     System.out.println("all the detail of car is");
    c.disp();
   }
 

}