/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity_class;

import com.mycompany.interface_collection.I1;
import com.mycompany.interface_collection.I2;

/**
 *
 * @author SAIT
 */
public class Foo implements I1,I2
{

    @Override
    public void m() {
        System.out.println("Hello");  
    }

    @Override
    public void n() {
        System.out.println("Bye");   
    }
    
}
