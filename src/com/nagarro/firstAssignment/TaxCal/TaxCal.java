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

    }
}

class Manufactured implements Tax{
    @Override
    public void CalculateTax(double price) {

    }
}

class Imported implements Tax{
    @Override
    public void CalculateTax(double price){

    }
}



public class TaxCal {
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

    public static String enterType() {
        Scanner sc = new Scanner(System.in);
        Others.setTypee(sc.nextLine());
        while(true) {
            if(Others.getTypee().equals(Constants.getRAW())||
                    Others.getTypee().equals(Constants.getIMPORTED())||
                    Others.getTypee().equals(Constants.getMANUFACTURED())) {
                return Others.getTypee();
            }else {
                System.out.println("Please enter the correct type");
                Others.setTypee(sc.nextLine());
            }
        }
    }

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


}
