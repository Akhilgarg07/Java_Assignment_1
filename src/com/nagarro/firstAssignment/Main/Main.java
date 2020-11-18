package com.nagarro.firstAssignment.Main;

import java.util.*;
import com.nagarro.firstAssignment.Entity.Item;
import com.nagarro.firstAssignment.Entity.Others;
import com.nagarro.firstAssignment.Validate.validatePrice;
import com.nagarro.firstAssignment.constants.*;
import com.nagarro.firstAssignment.TaxCal.TaxCal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            if(Others.getOP().equals(Constants.getOP1())) {
                getDetailsFromUser();
            }else if(Others.getOP().equals(Constants.getOP2())) {
                System.out.println("Thanks for using tax calculator");
                break;
            }else {
                System.out.println("Please enter either y or n");
            }
            System.out.println("Do you want to enter details of any other item (y/n):");
            Others.setOP(sc.nextLine());
        }
        String s1 = String.format("Item name => %s \nPrice=> %.2f \nTax => %.2f \nOverall Effective Cost => %.2f",Item.getName(),Item.getPrice(),Item.getTax(),Item.getPrice()+Item.getTax());
        System.out.println(s1);




    }

    //have to declare this static because non-static can't
    //be reference from static method(i.e main)
    private static void getDetailsFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name => ");
        Item.setName(sc.nextLine());
        System.out.print("Choose between the three \nRaw \nManufactured \nImported\n");
        Item.setType(TaxCal.enterType());
        System.out.print("Enter quantity => ");
        Item.setQuantity(sc.nextLine());
        System.out.print("Enter price => ");
        Item.setPrice(validatePrice.validatePrice());
    }
}
