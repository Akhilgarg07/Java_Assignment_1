package com.nagarro.firstAssignment.TaxCal;

import com.nagarro.firstAssignment.constants.Constants;

public class CalculateTax {
    public static double calTax(String type,double price){
        Tax tax;
        if(type.equals(Constants.RAW)){
            tax = new Raw();
        }else if(type.equals(Constants.MANUFACTURED)){
            tax = new Manufactured();
        }else {
            tax = new Imported();
        }
        return tax.calculateTax(price);
    }
}
