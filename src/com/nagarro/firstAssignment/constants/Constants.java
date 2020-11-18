package com.nagarro.firstAssignment.constants;

public final class Constants {
	public Constants() {
		
	}
	
	public static String getOp1() {
		return op1;
	}
	
	
	public static String getOp2() {
		return op2;
	}
	
	public static String getImported() {
		return imported;
	}
	public static String getManufactured() {
		return manufactured;
	}
	public static String getRaw() {
		return raw;
	}
	
	public static String getTypee() {
		return typee;
	}
	
	
	
	public static void setName(String name) {
		Constants.name = name;
	}
	public static void setQuantity(String quantity) {
		Constants.quantity = quantity;
	}
//	public static void setType(String type) {
//		Constants.type = type;
//	}
//	public static void setPrice(double price) {
//		Constants.price = price;
//	}
	public static void setTypee(String typee) {
		Constants.typee = typee;
	}
	
	public static boolean isOk() {
		return ok;
	}
	public static void setOk(boolean ok) {
		Constants.ok = ok;
	}

	public static double getPricee() {
		return pricee;
	}
	public static void setPricee(double pricee) {
		Constants.pricee = pricee;
	}

	public static String getOp() {
		return op;
	}

	public static void setOp(String op) {
		Constants.op = op;
	}

	public static double[] getRes() {
		return res;
	}

	public static void setRes(double[] res) {
		Constants.res = res;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		Constants.price = price;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Constants.type = type;
	}

	public static double getEffectiveCost() {
		return effectiveCost;
	}

	public static void setEffectiveCost(double effectiveCost) {
		Constants.effectiveCost = effectiveCost;
	}

	public static double getRawTax() {
		return rawTax;
	}

	public static void setRawTax(double rawTax) {
		Constants.rawTax = rawTax;
	}

	public static double getTax() {
		return tax;
	}

	public static void setTax(double tax) {
		Constants.tax = tax;
	}

	public static double getRawtaxper() {
		return rawTaxPer;
	}

	public static double getImptaxper() {
		return impTaxPer;
	}

	public static double getTotalper() {
		return totalPer;
	}

	public static double getManTax() {
		return manTax;
	}

	public static void setManTax(double manTax) {
		Constants.manTax = manTax;
	}

	public static double getImpTax() {
		return impTax;
	}

	public static void setImpTax(double impTax) {
		Constants.impTax = impTax;
	}

	private static String name = "";
	private static String type="";
	private static String quantity="0";
	private static double price=0.0;
	private static double[] res= {0.0,0.0};
	private static final String RAW = "Raw";
	private static final String imported = "Imported";
	private static final String manufactured ="Manufactured";
	private static String op = "y";
	private static final String op1 = "y";
	private static final String op2 = "n";
	private static String typee ="";
	private static double pricee = 0;
	private static boolean ok = false;
	private static double[] ress = new double[2];
	private static double tax = 0;
	private static double effectiveCost = 0;
	private static final double rawTaxPer = 12.5;
	private static final double totalPer = 100;
	private static final double impTaxPer = 10;
	private static double rawTax = 0;
	private static double manTax = 0;
	private static double impTax = 0;
	
	
	
	
	
	
	

}
