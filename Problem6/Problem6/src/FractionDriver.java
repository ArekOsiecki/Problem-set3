import java.util.Scanner;

public class FractionDriver {
    public static void main(String[] args) {

        int nom, dnom, nom2, dnom2;

        Scanner input = new Scanner(System.in);

        Fraction fraction = new Fraction();

        System.out.print("Please enter the nominator of the fraction: ");
        nom = input.nextInt();
        System.out.print("Please enter the denominator of the fraction: ");
        dnom = input.nextInt();


        Fraction fraction1 = new Fraction(nom, dnom);

        System.out.print("Please enter the nominator of the fraction: ");
        nom2 = input.nextInt();
        System.out.print("Please enter the denominator of the fraction: ");
        dnom2 = input.nextInt();


        Fraction fraction2 = new Fraction(nom2, dnom2);

        System.out.print("Testing the no-argument constructor: " + fraction.toString());
        System.out.print("\nTesting the two argument constructor: " + fraction1.toString());
        System.out.print("\nValue of " + fraction1 + " + " + fraction2 + " = " + fraction1.addFraction(fraction2));
        System.out.print("\nValue of " + fraction1 + " - " + fraction2 + " = " + fraction1.subFraction(fraction2));
        System.out.print("\nValue of " + fraction1 + " * " + fraction2 + " = " + fraction1.multiplyFraction(fraction2));
        System.out.print("\nValue of " + fraction1 + " / " + fraction2 + " = " + fraction1.divideFraction(fraction2));
    }
}
