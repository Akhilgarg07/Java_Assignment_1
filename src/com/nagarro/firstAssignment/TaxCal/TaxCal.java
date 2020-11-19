package com.nagarro.firstAssignment.TaxCal;
import com.nagarro.firstAssignment.constants.*;
import com.nagarro.firstAssignment.Entity.*;
import java.util.*;

interface Tax{
    public void CalculateTax(double price);
}

class Raw implements Tax{
    @Override
    public void CalculateTax(double price) {
        Item.setTax(Constants.getRAWTAXPER()*(price/Constants.getTOTALPER()));
//        return Item.getTax();

    }
}

class Manufactured implements Tax{
    @Override
    public void CalculateTax(double price) {
        Item.setTax(Constants.getRAWTAXPER()*(price/Constants.getTOTALPER()));
        Item.setTax(Item.getTax()+Constants.getMANUFACTUREDTAXPER()*((price+Item.getTax())/Constants.getTOTALPER()));
//        return Item.getTax();

    }
}

class Imported implements Tax{
    @Override
    public void CalculateTax(double price){
        Item.setTax(Constants.getIMPORTEDTAXPER()*(price/Constants.getTOTALPER()));
        Item.setEffectiveCost(price+Item.getTax());
        if(Item.getEffectiveCost()<=Constants.getTOTALCOSTIMP1()){
            Item.setTax(Item.getTax()+Constants.getSURCHARGE1());
        }else if(Item.getEffectiveCost()>Constants.getSURCHARGE1() && Item.getEffectiveCost()<=Constants.getTOTALCOSTIMP2()){
            Item.setTax(Item.getTax()+Constants.getSURCHARGE2());
        }else{
            Item.setTax(Item.getTax()+Constants.getSURCHARGEPER()*(Item.getEffectiveCost()/Constants.getTOTALPER()));
        }
//        return Item.getTax();
    }
}


//
//public class TaxCal {
//    public static void enterDetails() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter item name => ");
//        Constants.setName(sc.nextLine());
//        System.out.print("Choose between the three \nRaw \nManufactured \nImported\n");
//        Constants.setType(enterType());
//        System.out.print("Enter quantity => ");
//        Constants.setQuantity(sc.nextLine());
//        System.out.print("Enter price => ");
//        Constants.setPrice(getPrice());
//
//
//    }

//    public static String enterType() {
//        Scanner sc = new Scanner(System.in);
//        Others.setTypee(sc.nextLine());
//        while(true) {
//            if(Others.getTypee().equals(Constants.getRAW())||
//                    Others.getTypee().equals(Constants.getIMPORTED())||
//                    Others.getTypee().equals(Constants.getMANUFACTURED())) {
//                return Others.getTypee();
//            }else {
//                System.out.println("Please enter the correct type");
//                Others.setTypee(sc.nextLine());
//            }
//        }
//    }

//    public static double getPrice() {
//        while(!Constants.isOk()) {
//            try {
//                Scanner sc = new Scanner(System.in);
//                Constants.setPricee(sc.nextDouble());
//                Constants.setOk(true);
//
//            }catch(InputMismatchException e) {
//                System.out.println("Please enter a numeric value");
//            }
//        }
//        return Constants.getPricee();
//    }


//}
