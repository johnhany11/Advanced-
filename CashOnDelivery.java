/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author johnh
 */
public class CashOnDelivery implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("Cash on Delivery selected.");
        return true;
    }
}

