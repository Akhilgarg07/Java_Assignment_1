import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "y";
        while(true){
            if(op.equals("y") || op.equals(("Y"))) {
                enterDetails();
            } else if(op.equals("n") || op.equals("N")){
                System.out.println("Thanks for using tax calculator");
                break;
            } else{
                System.out.println("Please enter either y or n");
            }
            System.out.println("Do you want to enter details of any other item (y/n):");
            op = sc.nextLine();

        }

    }

    private static void enterDetails() {
        String name;
        String type;
        String quantity;
        double price;
        double[] res;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name => ");
        name = sc.nextLine();
        System.out.print("Choose between the three \nRaw \nManufactured \nImported\n");
        type = enterType();
        System.out.print("Enter quantity => ");
        quantity = sc.nextLine();
        System.out.print("Enter price => ");
        price = getPrice();
        res = calTax(price,type);

        String s1 = String.format("Item name => %s \nPrice=> %.2f \nTax => %.2f \nOverall Effective Cost => %.2f",name,price,res[0],res[1]);
        System.out.println(s1);

    }

    private static double getPrice() {
        double price=0;
        boolean ok = false;

        while(!ok){
            try{
                Scanner sc = new Scanner(System.in);
                price = sc.nextDouble();
                ok = true;
//                return price;
            }catch (InputMismatchException e){
                System.out.println("Please enter a numeric value");
            }
        }
        return price;
    }

    private static String enterType() {
        String type;
        Scanner sc= new Scanner(System.in);
        type=sc.nextLine();
        while(true){
            if(type.equals("Raw")||type.equals("Imported")||type.equals("Manufactured")){
                return type;
            }
            else{
                System.out.println("Please enter the correct type");
                type = sc.nextLine();
            }
        }
    }

    private static double[] calTax(double price, String type) {
        double res[] = new double[2];
        double tax=0;
        double effectiveCost=0;
        double rawTax = 12.5*(price/100);
        double manTax = rawTax+2*((price+rawTax)/100);
        double impTax = 10*(price/100);
        if(type.equals("Raw")){
            tax = rawTax;
            effectiveCost = price+tax;
        } else if(type.equals("Manufactured")){
            tax = manTax;
            effectiveCost = price+tax;
        }else if(type.equals("Imported")){
            effectiveCost= price+impTax;
            if (effectiveCost <= 100) {
                effectiveCost += 5;
                tax = impTax + 5;
            }
            else if (effectiveCost > 100 && effectiveCost <= 200) {
                effectiveCost += 10;
                tax = impTax + 5;
            }
            else if (effectiveCost > 200) {
                tax = impTax + 5*(effectiveCost/100);
                effectiveCost += 5 * (effectiveCost / 100);
            }
        }
        res[0]= tax;
        res[1] = effectiveCost;
        return res;

    }


}
