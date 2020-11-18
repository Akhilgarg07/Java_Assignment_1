package com.nagarro.firstAssignment.Main;
import java.util.*;
import com.nagarro.firstAssignment.constants.*;
import com.nagarro.firstAssignment.TaxCal.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(Constants.getOp().equals(Constants.getOp1())) {
				TaxCal.enterDetails();
			}else if(Constants.getOp().equals(Constants.getOp2())) {
				System.out.println("Thanks for using tax calculator");
                break;
			}else {
				System.out.println("Please enter either y or n");
			}
		}
		System.out.println("Do you want to enter details of any other item (y/n):");
		Constants.setOp(sc.nextLine());
	}
}
