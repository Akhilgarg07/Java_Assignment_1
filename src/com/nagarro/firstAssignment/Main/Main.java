package com.nagarro.firstAssignment.Main;

import java.util.*;
import com.nagarro.firstAssignment.Entity.Item;
import com.nagarro.firstAssignment.TaxCal.CalculateTax;
import com.nagarro.firstAssignment.Validate.ValidateName;
import com.nagarro.firstAssignment.Validate.ValidatePrice;
import com.nagarro.firstAssignment.Validate.ValidateQuantity;
import com.nagarro.firstAssignment.constants.*;
import com.nagarro.firstAssignment.Validate.ValidateType;

public class Main {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        Item item;
        String option="y";
        Scanner sc = new Scanner(System.in);
        while(true) {
            if(option.equals(Constants.OPTION1)) {
                item = getDetailsFromUser();
                itemList.add(item);
            }else if(option.equals(Constants.OPTION2)) {
                printOutput(itemList);
                System.out.println("Thanks for using tax calculator");
                break;
            }else {
                System.out.println("Please enter either y or n");
            }
            System.out.println("Do you want to enter details of any other item (y/n):");
            option = sc.nextLine();
        }

    }

    private static Item getDetailsFromUser(){
        Item item = new Item();
        System.out.print("Enter item name => ");
        item.setName(ValidateName.validateName());
        System.out.print("Choose between the three \nRaw \nManufactured \nImported\n");
        item.setType(ValidateType.validateType());
        System.out.print("Enter quantity => ");
        item.setQuantity(ValidateQuantity.validateQuantity());
        System.out.print("Enter price => ");
        item.setPrice(ValidatePrice.validatePrice());
        item.setTax(CalculateTax.calTax(item.getType(),item.getPrice()));

        return item;

        }
    private static void printOutput(List<Item> itemList){
        String result;
        for(int i=0;i<itemList.size();i++){
             result = String.format("%d %nItem name => %s %nPrice=> %.2f %nTax => %.2f %nOverall Effective Cost of an item => %.2f %nTotal cost => %.2f", i+1,itemList.get(i).getName(),itemList.get(i).getPrice(),itemList.get(i).getTax(),itemList.get(i).getPrice()+itemList.get(i).getTax(),itemList.get(i).getQuantity()*(itemList.get(i).getPrice()+itemList.get(i).getTax()));
             System.out.println(result);
            }
        }


    }

