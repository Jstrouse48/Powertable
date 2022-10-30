package homework; 

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args)
    {
        // Welcome the user
        System.out.println("Squared and Cubed");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        do
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            String header = "Number  " + "Squared " + "Cubed";
            System.out.println(header);

            int square = 0;
            int cube = 0;

            String row = "";
            for (int i = 1; i <= num; i++)
            {

                square = i * i;
                cube = i * i * i;

                row = i + "       " + square + "       " + cube;
                System.out.println(row);
            }

            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));  
    }
}