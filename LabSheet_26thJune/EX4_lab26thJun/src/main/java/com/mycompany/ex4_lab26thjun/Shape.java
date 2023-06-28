package com.mycompany.ex4_lab26thjun;
abstract class Shape 
{
    protected double r,area,length,width;
    
 abstract double calculateArea();
 
 public void display()
 {
     System.out.println("this is the area: "+calculateArea());
 }
 
    
    
}
