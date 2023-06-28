/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankobj26thjun;


abstract class Bankaccount {
    
    private String accno;
    private double balance;
    
public void setdata(String accno, double balance){
    this.accno = accno;
    this.balance = balance;
} 
public String getaccno(){
    return accno;
}
public double getbalance(){
    return balance;
}
abstract double calcualteinterest();
}
   

