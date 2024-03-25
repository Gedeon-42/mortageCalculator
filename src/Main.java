import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterst = 0;
        int numberOfPayments = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Principal:");
             principal = scanner.nextInt();
            if(principal >=1000 && principal <=1_000_000)
                break;
            System.out.print("Enter a Value between 1000 and 100000");
        }
        while(true) {
            System.out.print("Annual Interest Rate:");
            float annualInterest = scanner.nextFloat();
            if(annualInterest >=1 & annualInterest <=30) {
                 monthlyInterst = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.print("Enter a value bewtween 1 and 30");

        }
        while (true) {
            System.out.print("period(years):");
            byte years = scanner.nextByte();
            if(years >=1 && years <=30) {
                 numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("enter value 1 and 30");
        }
        double mortage = principal
                *(monthlyInterst * Math.pow(1+monthlyInterst)) /(Math.pow(1 +monthlyInterst,numberOfPayments));
    }
}