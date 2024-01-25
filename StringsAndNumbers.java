/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.spring24.cs44542.sec01;

/**
* Class: 44542-NN Object-Oriented Programming
*
* @author Firstname Lastname
* Description: Making sure everything works
* Due: MM/DD/YYYY
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student, internet, or any other source.
* I will not share my source code with anyone under any circumstances.
*/

 
import java.util.Random;

public class StringsAndNumbers {

    public static void main(String[] args) {
        // String Manipulation
        String stringExample = "Working with String Methods in Java!";
        System.out.println("The String is: Working with String Methods in Java!");
        System.out.println("The Length of the String is: " + stringExample.length());
        System.out.println("The Character at the 5th index is: " + stringExample.charAt(5));

        // Substring and Comparison
        String substring = stringExample.substring(11, 18);
        System.out.println("Substring: " + substring);
        System.out.println("Substring 'Methods' Present: " + stringExample.contains("Methods"));

        // String Modification and Case Conversion
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + "_" + lastName;
        System.out.println("Lowercase: " + fullName.toLowerCase());
        System.out.println("Uppercase: " + fullName.toUpperCase());

        // Manipulation and Replacement
        String sampleText = "There are many String methods in Java!";
        String replacedText = sampleText.replace("many", "various");
        System.out.println("After Replacement: " + replacedText);

        // Searching and Trimming
        String searchText = "  Java is an Object-Oriented Programming Language. Java is a high level, robust and secure programming language.  ";
        System.out.println("Index of the second occurrence of 'Java': " + searchText.indexOf("Java", searchText.indexOf("Java") + 1));
        System.out.println("Trimmed Text: " + searchText.trim());

        // Equality and Comparison
        String messageA = "hello";
        String messageB = "HELLO";
        System.out.println("Case-Insensitive Equality: " + messageA.equalsIgnoreCase(messageB));
        System.out.println("Case-Sensitive Equality: " + messageA.equals(messageB));

        // Joining
        System.out.println("Joined Name: " + firstName + "-" + lastName);

        // Random Class
        Random random = new Random();
        int player1Score = random.nextInt(10) + 21;
        int player2Score = random.nextInt(10) + 21;
        int team2Score = player1Score + player2Score;
        System.out.println("Player 1 of Team 2 Score: " + player1Score);
        System.out.println("Player 2 of Team 2 Score: " + player2Score);
        System.out.println("Total Score for Team 2: " + team2Score);

        // Random Floating-Point Numbers
        Random randomWithSeed = new Random(20);
        System.out.print("Random Floating-Point Numbers with Seed: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(randomWithSeed.nextDouble() + " ");
        }
        System.out.println();

        Random randomWithoutSeed = new Random();
        System.out.print("Random Floating-Point Numbers without Seed: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(randomWithoutSeed.nextDouble() + " ");
        }
        System.out.println();

        // Math Class
        System.out.println("Absolute Difference: " + Math.abs(-20 - 15));
        System.out.println("Rounded Value: " + Math.ceil(14.6 * 3.8));
        System.out.println("Floor Value: " + Math.floor(29.7 / 4.2));
        System.out.println("Square Root of Sum of Squares: " + Math.sqrt(Math.pow(10, 2) + Math.pow(20, 2)));
        System.out.println("Logarithm Base 2 of 256: " + Math.log(256) / Math.log(2));
        System.out.println("Minimum Value: " + Math.min(-5, Math.min(-10, Math.min(0, Math.min(15, 8)))));
        System.out.println("Maximum Value: " + Math.max((7 * 9), (40 / 5)));
        double sin30 = Math.sin(Math.toRadians(30));
        double cos60 = Math.cos(Math.toRadians(60));
        System.out.println("Sine of 30 degrees * Cosine of 60 degrees: " + (sin30 * cos60));
        System.out.println("Tangent of (45 - 30) degrees: " + Math.tan(Math.toRadians(45 - 30)));
        double result = (Math.abs(3 - 5) + Math.sqrt(25) - 7 * 2) / 2;
        System.out.println("Result of Expression: " + result);
    }
}
