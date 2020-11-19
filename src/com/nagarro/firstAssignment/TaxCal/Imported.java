package com.nagarro.firstAssignment.TaxCal;

import com.nagarro.firstAssignment.constants.Constants;

class Imported implements Tax{
    @Override
    public double calculateTax(double price){
        double effectiveCost=0;
        double tax=0;
        tax = Constants.IMPORTEDTAXPER*(price/Constants.TOTALPERCENT);
        effectiveCost = price+tax;
        if(effectiveCost<=Constants.TOTALCOSTIMPORT1){
            tax += Constants.SURCHARGE1;
        }else if(effectiveCost>Constants.SURCHARGE1 && effectiveCost<=Constants.TOTALCOSTIMPORT2){
            tax +=Constants.SURCHARGE2;
        }else{
            tax += Constants.SURCHARGEPER*(effectiveCost/Constants.TOTALPERCENT);
        }
        return tax;
    }
}
