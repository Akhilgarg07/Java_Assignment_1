package com.nagarro.firstAssignment.Entity;

public class Item {
    public Item(){

    }

    private static String name = "";
    private static String type="";
    private static String quantity="0";
    private static double price=0;
    private static double tax = 0;

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Item.type = type;
    }

    public static String getQuantity() {
        return quantity;
    }

    public static void setQuantity(String quantity) {
        Item.quantity = quantity;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Item.price = price;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Item.name = name;
    }

    public static double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        Item.tax = tax;
    }
}
