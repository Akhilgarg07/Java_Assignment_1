package com.nagarro.firstAssignment.Validate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateQuantity {
	
	private ValidateQuantity() {
		
	}
	
    public static int validateQuantity(){
        int quantity=0;
        boolean isOk = false;
        while(!isOk) {
            try {
                Scanner sc = new Scanner(System.in);
                quantity = sc.nextInt();
                if(quantity<=0){
                    throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
                }
                isOk = true;

            }catch(InputMismatchException e) {
                System.out.println("Please enter a numeric value");
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        return quantity;
    }
}
