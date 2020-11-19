package com.nagarro.firstAssignment.TaxCal;

import com.nagarro.firstAssignment.constants.Constants;

class Manufactured implements Tax{
    @Override
    public double calculateTax(double price) {
        double tax = 0;
        tax = Constants.RAWTAXPER*(price/Constants.TOTALPERCENT);
        tax += Constants.MANUFACTUREDTAXPER*((price+tax)/Constants.TOTALPERCENT);
        return tax;
    }
}
