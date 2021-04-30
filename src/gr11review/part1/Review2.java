package gr11review.part1;

import java.util.Scanner;

public class Review2 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // Options
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");

    System.out.print("Choose a menu option: ");
    int intOption = in.nextInt();

    // Joke contents
    switch (intOption) {
      case 0: 
        System.out.println("Why do bees have sticky hair?");
        System.out.println("They always use honeycombs.");
        break;
      case 1: 
        System.out.println("Did you hear about the four foot tall psychic who escaped prison?");
        System.out.println("He's a small medium at large.");
        break;
      case 2: 
        System.out.println("What’s a baby’s favorite clothing brand?");
        System.out.println("Fruit of the womb.");
        break;
      case 3: 
        System.out.println("Why were the teacher's eyes crossed?");
        System.out.println("Because she couldn't control her pupils.");
        break;
      default:
        System.out.println("Invalid menu option");
        break;
    } 

  }

}