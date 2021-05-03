package gr11review.part1;

import java.util.Random;

public class Review8 {

  public static void main(String[] args) {
    
    // Initialize variables
    Random rand = new Random();
    int intCount = 0;

    // Generate random numbers
    for (int intX = 0; intX < 1000; intX++) {
      int intResult1 = rand.nextInt(9);
      int intResult2 = rand.nextInt(9);
      int intResult3 = rand.nextInt(9);
      System.out.println(intResult1 + " " + intResult2 + " " + intResult3);

      if (intResult1 == intResult2 && intResult1 == intResult3) {
        intCount++;
      }
    }

    // Print out numbers
    System.out.println(intCount);

  }

}