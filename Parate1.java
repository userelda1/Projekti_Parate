 public class Parate1{
 public static void main(String[] args) {
    int[] coinValues = {25, 10, 5, 1};
    int[] coinCounts = {9, 2, 0, 6};
    int totalAmount = 0;
    //koment i ri
    int u=0;
    for(int i = 0; i < coinValues.length; i++) {
        totalAmount += coinValues[i] * coinCounts[i];
    }
    
    Parate money = new Parate(totalAmount);
    int extractedQuarters = money.extract(25);
    int extractedDimes = money.extract(10);
    int extractedNickels = money.extract(5);
    int extractedPennies = money.extract(1);
    
    System.out.println("Per keto vlera te monedhave kemi:");
    System.out.print("njezetepesecenteshe: ");
    System.out.println(extractedQuarters);
    System.out.print("dhjetecenteshe: ");
    System.out.println(extractedDimes);
    System.out.print("pesecenteshe: ");
    System.out.println(extractedNickels);
    System.out.print("njecenteshe: ");
    System.out.println(extractedPennies);
    System.out.print("Totali :");
    System.out.println(totalAmount);
}}