package gr11review.part1;

public class Review3 {

  public static void main(String[] args) {

    // Print out odd numbers from 20 to 100
    for (int intX = 20; intX <= 100; intX++) {
      if ((intX % 2) == 1) {
        System.out.println(intX);
      } 
    }

    // Blank line
    System.out.println();

    // Print out numbers from 29 to 2 in decreasing order
    for (int intY = 29; intY >= 2; intY--) {
      System.out.println(intY);
    }
  }

}