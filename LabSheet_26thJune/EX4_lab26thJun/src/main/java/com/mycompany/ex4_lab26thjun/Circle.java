package com.mycompany.ex4_lab26thjun;
public class Circle extends Shape
{
    private double r;
    private double area;
    
    public void setr(double r)
    {
        this.r=r;
    }
    public double getr()
    {
        return r;
    }
    
   @Override
   public double calculateArea()
   {
      return 3.14*r*r; 
      
   }
    
    
}
