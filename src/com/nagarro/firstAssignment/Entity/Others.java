package com.nagarro.firstAssignment.Entity;

import java.util.ArrayList;
import java.util.List;

public class Others {

    public Others(){

    }



//    public static List<String> getItemNameArray() {
//        return itemNameArray;
//    }
//
//    public static void setItemNameArray(List<String> itemNameArray) {
//        Others.itemNameArray = itemNameArray;
//    }
//
//    public static List<Double> getItemPriceArray() {
//        return itemPriceArray;
//    }
//
//    public static void setItemPriceArray(List<Double> itemPriceArray) {
//        Others.itemPriceArray = itemPriceArray;
//    }
//
//    public static List<Double> getItemTaxArray() {
//        return itemTaxArray;
//    }
//
//    public static void setItemTaxArray(List<Double> itemTaxArray) {
//        Others.itemTaxArray = itemTaxArray;
//    }
//
//    public static List<Double> getItemFinalPriceArray() {
//        return itemFinalPriceArray;
//    }
//
//    public static void setItemFinalPriceArray(List<Double> itemFinalPriceArray) {
//        Others.itemFinalPriceArray = itemFinalPriceArray;
//    }

//    private static double[] res= {0.0,0.0};
    private static String OP = "y";
    private static String typee ="";
    private static double pricee = 0;
    private static boolean ok = false;
//    private static List<String> itemNameArray = new ArrayList<String>();
//    private static List<Double> itemPriceArray = new ArrayList<Double>();
//    private static List<Double> itemTaxArray = new ArrayList<Double>();
//    private static List<Double> itemFinalPriceArray = new ArrayList<Double>();


    public static String getOP() {
        return OP;
    }

    public static void setOP(String OP) {
        Others.OP = OP;
    }

//    public static double[] getRes() {
//        return res;
//    }
//
//    public static void setRes(double[] res) {
//        Others.res = res;
//    }

    public static String getTypee() {
        return typee;
    }

    public static void setTypee(String typee) {
        Others.typee = typee;
    }

    public static double getPricee() {
        return pricee;
    }

    public static void setPricee(double pricee) {
        Others.pricee = pricee;
    }

    public static boolean isOk() {
        return ok;
    }

    public static void setOk(boolean ok) {
        Others.ok = ok;
    }
}
