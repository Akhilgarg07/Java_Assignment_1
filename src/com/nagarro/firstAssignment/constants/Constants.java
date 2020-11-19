package com.nagarro.firstAssignment.constants;

public final class Constants {
    public Constants() {

    }

    public static String getRAW() {
        return RAW;
    }

    public static String getIMPORTED() {
        return IMPORTED;
    }

    public static String getMANUFACTURED() {
        return MANUFACTURED;
    }

    public static String getOP1() {
        return OP1;
    }

    public static String getOP2() {
        return OP2;
    }

    private static final String RAW = "Raw";
    private static final String IMPORTED = "Imported";
    private static final String MANUFACTURED ="Manufactured";
    private static final String OP1 = "y";
    private static final String OP2 = "n";
    private static final double RAWTAXPER = 12.5;
    private static final double MANUFACTUREDTAXPER = 2;
    private static final double IMPORTEDTAXPER = 10;
    private static final double SURCHARGE1 = 5;
    private static final double SURCHARGE2 = 10;
    private static final double SURCHARGEPER = 5;
    private static final double TOTALPER =100;
    private static final double TOTALCOSTIMP1 = 100;
    private static final double TOTALCOSTIMP2 = 200;

    public static double getRAWTAXPER() {
        return RAWTAXPER;
    }

    public static double getMANUFACTUREDTAXPER() {
        return MANUFACTUREDTAXPER;
    }

    public static double getIMPORTEDTAXPER() {
        return IMPORTEDTAXPER;
    }

    public static double getSURCHARGE1() {
        return SURCHARGE1;
    }

    public static double getSURCHARGE2() {
        return SURCHARGE2;
    }

    public static double getSURCHARGEPER() {
        return SURCHARGEPER;
    }

    public static double getTOTALCOSTIMP1() {
        return TOTALCOSTIMP1;
    }

    public static double getTOTALCOSTIMP2() {
        return TOTALCOSTIMP2;
    }

    public static double getTOTALPER() {
        return TOTALPER;
    }







}
