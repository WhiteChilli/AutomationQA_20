package org.example;
import java.util.Scanner;

public class CalculateFactorial {

    public static int factorial() {
        Scanner userInput = new Scanner(System.in);
        int numberEntered = 0;

        try {
            System.out.print("Calculate factorial number of: ");
            numberEntered = userInput.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
            userInput.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
            userInput.nextLine();

        } finally {
            userInput.close();
        }

        int factorialResult = 1;
        for (int i = 1; i <= numberEntered; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }
}

