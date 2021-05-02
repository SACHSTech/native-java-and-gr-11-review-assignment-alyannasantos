package gr11review.part1;

import java.io.*;

public class Review5 {

  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    // Initialize variables
    double dblInvestedAmount = 0.0;
    double dblInterestRate = 0.0;
    double dblTargetAmount = 0.0;
    int intTotalYears = 0;
    double dblAccumulatedTotal = 0.0;

    // Get user inputs
    System.out.print("Enter the yearly invested amount: ");
    dblInvestedAmount = Double.parseDouble(key.readLine());

    System.out.print("Enter the compound interest rate: ");
    dblInterestRate = Double.parseDouble(key.readLine());

    System.out.print("Enter the target amount: ");
    dblTargetAmount = Double.parseDouble(key.readLine());

    double dblConvertedInterestRate = dblInterestRate / 100;
    double dblEarnedAmount = 0.0;

    // Calculate total years
    while (dblAccumulatedTotal < dblTargetAmount) {
      dblAccumulatedTotal = dblAccumulatedTotal + dblInvestedAmount;
      dblEarnedAmount = dblConvertedInterestRate * dblAccumulatedTotal;
      dblAccumulatedTotal = dblAccumulatedTotal + dblEarnedAmount; 

      // Increment years
      intTotalYears++;
    }

    // Print out
    System.out.println("The target amount will be earned in " + intTotalYears + " years.");

  }

}