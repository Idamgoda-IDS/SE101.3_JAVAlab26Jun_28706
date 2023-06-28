/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankobj26thjun;

/**
 *
 * @author Admin
 */
public class Bankobj26thJun {

    public static void main(String[] args) {
        
        Savingacc s = new Savingacc();
        s.setdata("1234", 200000000);
        Checkingacc c = new Checkingacc();
        c.setdata("12345", 10000000);
        
        System.out.println("Saving account: "+s.getaccno());
        System.out.println("Saving account balance: "+s.calcualteinterest());
        
        System.out.println("Checking account:"+c.getaccno());
        System.out.println("Checking account balance: "+c.calcualteinterest());
        
    }   
}
