package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println("Material standards for construction: \n1.Standard Materials\n2.Above standard materials\n3.High standard material\n4.High standard and fully automated home\nEnter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("Enter total area of the house(in sqft): ");
        int total_area = scanner.nextInt();

        long construction_cost;
        try{
            construction_cost = constructionCost.calculateCost(choice, total_area);
            System.out.println("The construction cost of the house is: "+construction_cost);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry! you have entered an invalid choice!...");
        }
    }
}
