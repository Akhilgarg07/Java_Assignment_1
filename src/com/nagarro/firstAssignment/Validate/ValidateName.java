package com.nagarro.firstAssignment.Validate;

import java.util.Scanner;

public class ValidateName {
    public static String validateName(){
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        boolean isOk = false;
        while(true){
            if(name.isEmpty()){
                System.out.println("Item name required. Enter item name");
                name = sc.nextLine();
            }else{
                return name;
            }
        }
    }
}
