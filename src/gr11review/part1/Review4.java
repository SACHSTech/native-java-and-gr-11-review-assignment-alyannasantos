package gr11review.part1;

import java.text.DecimalFormat;
import java.io.*;

public class Review4 {

  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    DecimalFormat decimalFormat = new DecimalFormat("$###,####,##0.00");
    double dblSubtotal = 0.0;
    double dblTax = 0.0;
    double dblTotal = 0.0;

    System.out.print("How many items do you want to buy? ");
    int intItemCount = Integer.parseInt(key.readLine());
    
    for (int intCount = 1; intCount <= intItemCount; intCount++) {
      System.out.print("Enter the price for item " + intCount + ": ");
      double dblAmount = Double.parseDouble(key.readLine());
      dblSubtotal = dblSubtotal + dblAmount;
    }

    dblTax = dblSubtotal * 0.13;
    dblTotal = dblSubtotal + dblTax;

    System.out.println("Subtotal: " + decimalFormat.format(dblSubtotal));
    System.out.println("Tax: " + decimalFormat.format(dblTax));
    System.out.println("Total: " + decimalFormat.format(dblTotal));

  }

}