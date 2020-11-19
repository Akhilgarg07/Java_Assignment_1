package com.nagarro.firstAssignment.TaxCal;

import com.nagarro.firstAssignment.constants.Constants;

class Raw implements Tax{
    @Override
    public double calculateTax(double price) {
        double tax;
        tax = Constants.RAWTAXPER*(price/Constants.TOTALPERCENT);
        return tax;
    }
}