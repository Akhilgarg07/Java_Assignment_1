package com.nagarro.firstAssignment.Validate;

import com.nagarro.firstAssignment.Entity.Others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class validatePrice {
    public static double validatePrice() {
        while(!Others.isOk()) {
            try {
                Scanner sc = new Scanner(System.in);
                Others.setPricee(sc.nextDouble());
                Others.setOk(true);

            }catch(InputMismatchException e) {
                System.out.println("Please enter a numeric value");
            }
        }
        return Others.getPricee();
    }
}
