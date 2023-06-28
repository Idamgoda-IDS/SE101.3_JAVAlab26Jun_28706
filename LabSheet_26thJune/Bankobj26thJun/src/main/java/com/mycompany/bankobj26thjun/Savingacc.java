/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankobj26thjun;

/**
 *
 * @author Admin
 */
public class Savingacc extends Bankaccount {
    
    @Override
    public double calcualteinterest(){
        
        return getbalance() * 1.2;
    }
}
