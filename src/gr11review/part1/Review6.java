package gr11review.part1;

import java.text.DecimalFormat;
import java.io.*;

public class Review6 {

  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    // Initialize variables
    DecimalFormat decimalFormat = new DecimalFormat("$###,####,##0.00");
    double dblSubtotal = 0.0;
    double dblTax = 0.0;
    double dblTotal = 0.0;

    // Calculate subtotal and total
    while (true) {
      System.out.print("Enter the price for an item: ");
      double dblAmount = Double.parseDouble(key.readLine());

      if (dblAmount == 0.0) {
        break;
      }

      dblSubtotal = dblSubtotal + dblAmount;
    }

    // Calculate total
    dblTax = dblSubtotal * 0.13;
    dblTotal = dblSubtotal + dblTax;

    // Print out
    System.out.println("Subtotal: " + decimalFormat.format(dblSubtotal));
    System.out.println("Tax: " + decimalFormat.format(dblTax));
    System.out.println("Total: " + decimalFormat.format(dblTotal));

  }

}