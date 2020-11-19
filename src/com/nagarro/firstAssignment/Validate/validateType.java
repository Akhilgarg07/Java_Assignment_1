package com.nagarro.firstAssignment.Validate;

import com.nagarro.firstAssignment.Entity.Others;
import com.nagarro.firstAssignment.constants.Constants;

import java.util.Scanner;

public class validateType {
    public static String validateTheType() {
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
}
