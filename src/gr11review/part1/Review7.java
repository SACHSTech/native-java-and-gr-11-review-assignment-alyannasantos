package gr11review.part1;

import java.io.*;

public class Review7 {

  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    // Initialize variables
    int intSpace = 0;
    int intLetterA = 0;
    String strOddLetters = "";

    // User input
    String theSentence = key.readLine();

    // Number of characters
    int intCharacters = theSentence.length();
    System.out.println("There are " + intCharacters + " characters in the sentence.");

    // Calculate number of spaces, letter a, and odd number
    for (int intI = 0; intI < intCharacters; intI++) {
      char charLetter = theSentence.charAt(intI);
      
      if (charLetter == ' ') {
        intSpace++;
      }

      if (charLetter == 'a') {
        intLetterA++;
      }

      if ((intI % 2) == 0) {
        strOddLetters = strOddLetters + "-";
      }
    }

    // Print out number of spaces, number of letter a, and odd letters
    System.out.println("There are " + intSpace + " spaces in the sentence.");
    System.out.println("There are " + intLetterA + " letter a in the sentence.");
    System.out.println(strOddLetters);

  }

}