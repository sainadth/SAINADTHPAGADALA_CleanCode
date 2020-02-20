package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        double interest_amount = 0;

        double principal_amount;
        double time;
        double interest_rate;
        System.out.println("Enter Principal amount: ");
        principal_amount = scanner.nextInt();
        System.out.println("Enter duration: ");
        time = scanner.nextInt();
        System.out.println("Enter rate of interest: ");
        interest_rate = scanner.nextInt();
        System.out.println("Types of interest: \n1.Simple Interest\n2.Compound Interest\n");
        System.out.println("Choose a type (1-2): ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1: interest_amount = Interest.simpleInterest(principal_amount, time, interest_rate);
                System.out.println("The simple interest of the given amount is: "+(principal_amount+interest_amount)+" rupees");
                break;
            case 2: interest_amount = Interest.compoundInterest(principal_amount, time, interest_rate);
                System.out.println("The compound interest of the given amount is: "+(principal_amount+interest_amount)+" rupees");
                break;
            default: System.out.println("Invalid choice...");
                return;
        }
    }
}
