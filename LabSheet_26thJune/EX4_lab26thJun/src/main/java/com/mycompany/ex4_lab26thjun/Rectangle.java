package com.mycompany.ex4_lab26thjun;
public class Rectangle extends Shape
{
 private int length,width,area;
 
 public void setData(int length,int width)
 {
     this.length=length;
     this.width=width;
 }
 public int getLength()
 {
     return length;
 }
 public int getWidth()
 {
     return width;
 }
 
 @Override
 public double calculateArea()
 {
     return length*width;
     
 }
 
}
