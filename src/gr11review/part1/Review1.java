package gr11review.part1;

import java.io.*;

public class Review1 {

  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
  
    // Get user month input
    System.out.print("Enter the month number: ");
    int intMonth = Integer.parseInt(key.readLine());
   
    // Get user day input
    System.out.print("Enter the day number: ");
    int intDay = Integer.parseInt(key.readLine());

    // Calculate total days
    int intSum = intDay;

    if (intMonth > 1) { 
      intSum = intSum + 31;  
    }
      
    if (intMonth > 2) {
      intSum = intSum + 28;
    }

    if (intMonth > 3) {
      intSum = intSum + 31;
    }

    if (intMonth > 4) {
      intSum = intSum + 30;
    }

    if (intMonth > 5) {
      intSum = intSum + 31;
    }

    if (intMonth > 6) {
      intSum = intSum + 30;
    }

    if (intMonth > 7) {
      intSum = intSum + 31;
    }

    if (intMonth > 8) {
      intSum = intSum + 31;
    }

    if (intMonth > 9) {
      intSum = intSum + 30;
    }

    if (intMonth > 10) {
      intSum = intSum + 31;
    }

    if (intMonth > 11) {
      intSum = intSum + 30;
    }

    if (intMonth > 12) {
      intSum = intSum + 31;
    }

    // Print out number of days
    System.out.println("" + intSum);
      
  }


}