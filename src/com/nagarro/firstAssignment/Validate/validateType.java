package com.nagarro.firstAssignment.Validate;

import com.nagarro.firstAssignment.constants.Constants;

import java.util.Scanner;

public class ValidateType {
    public static String validateType() {
        String type;
        Scanner sc = new Scanner(System.in);
        type = sc.nextLine();
        while(true) {
            if(type.equals(Constants.RAW)||
                    type.equals(Constants.IMPORTED)||
                    type.equals(Constants.MANUFACTURED)) {
                return type;
            }else {
                System.out.println("Please enter the correct type");
                type = sc.nextLine();
            }
        }
    }
}
