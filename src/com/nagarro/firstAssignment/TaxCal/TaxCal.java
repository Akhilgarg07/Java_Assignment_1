package com.nagarro.firstAssignment.TaxCal;
import com.nagarro.firstAssignment.constants.*;

import java.lang.invoke.ConstantCallSite;
import java.util.*;

public class TaxCal {
	public static void enterDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter item name => ");
		Constants.setName(sc.nextLine());
		System.out.print("Choose between the three \nRaw \nManufactured \nImported\n");
		Constants.setType(enterType());
		System.out.print("Enter quantity => ");
		Constants.setQuantity(sc.nextLine());
		System.out.print("Enter price => ");
		Constants.setPrice(findPrice());
		Constants.setRes(calTax(Constants.getPrice(),Constants.getType()));
		
	}
	
	private static double[] calTax(double price,String type) {
		if(Constants.getType().equals(Constants.getRaw())) {
			Constants.RawTax=0;;
			Constants.setTax();
		}
	}
	
	private static String enterType() {
		Scanner sc = new Scanner(System.in);
		Constants.setTypee(sc.nextLine());
		while(true) {
			if(Constants.getTypee().equals(Constants.getRaw())||
				Constants.getTypee().equals(Constants.getImported())||
				Constants.getTypee().equals(Constants.getManufactured())) {
				return Constants.getTypee();
			}else {
				System.out.println("Please enter the correct type");
				Constants.setTypee(sc.nextLine());
			}
		}
	}
	
	private static double findPrice() {
		while(!Constants.isOk()) {
			try {
				Scanner sc = new Scanner(System.in);
				Constants.setPricee(sc.nextDouble());
				Constants.setOk(true);
				
			}catch(InputMismatchException e) {
				System.out.println("Please enter a numeric value");
			}
		}
		return Constants.getPricee();
	}
	
	
}
