package Chapter14Exercises;

import java.util.Scanner;

// Exercise 14.7: PigLatin.java
// Output the Pig Latin representation of sentence entered by the user

public class PigLatin {
    
    public static String printLatinWord(String word) {
        char[] arrWord = word.toCharArray();
        String newWord = "";
        
        for (int count = 1; count < arrWord.length; count++) 
            newWord += arrWord[count];
        
        String pigLatinWord = newWord + arrWord[0] + "ay";
        return pigLatinWord;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // get user input
        System.out.println("Enter sentence here: ");
        String sentence = input.nextLine();
        
        String[] stringSentence = sentence.split(" ");
        System.out.println("\nPig latin representation >>> ");
        for (int count = 0; count < stringSentence.length; count++) 
            System.out.print(printLatinWord(stringSentence[count]) + " ");
        
        // new line
        System.out.println();
    }
    
}
