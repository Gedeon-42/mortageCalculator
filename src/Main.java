import java.text.NumberFormat;
import java.util.Scanner;

public class calcultor {
    public static void main(String[] args){
        final byte Months_in_year=12;
        final byte PERCENT =100;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Principal:");
        int principal= scanner.nextInt();
        System.out.println("Annual Interest Rate:");
        float annualInterest=scanner.nextFloat();
        float monthlyInterest=annualInterest/PERCENT/Months_in_year;
        System.out.println("Period (Years): ");
        byte years =scanner.nextByte();
        int numberOfPayments=years*Months_in_year;

        double mortage = principal *
                (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))
                /(Math.pow(1+monthlyInterest,numberOfPayments)-1);
        String mortgegeFormatted = NumberFormat.getNumberInstance().format(mortage);
        System.out.println("Mortage: "+mortgegeFormatted);
    }
}