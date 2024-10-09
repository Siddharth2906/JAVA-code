/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAIT
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value=");
        
        int x=sc.nextInt();
        System.out.println("Enter 2nd value=");
        int y=sc.nextInt();
        
        
        int z=x/y;
        
        System.out.println("Value="+z);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("U have divided by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter only integer value");
        }
        
        System.out.println("Rest Program");  
        
        
        
    }
}
