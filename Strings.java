/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec01;
import java.lang.String;
/**
 *
 * @author S572178
 */
public class Strings {
 
    public static void main(String[] args) {
        // 1. Initialization and Basic Operations
        String stringExample = "Working with String Methods in Java!";
        System.out.println("i. Value of stringExample: " + stringExample);
        System.out.println("ii. Length of stringExample: " + stringExample.length());
        System.out.println("iii. Character at the 5th index: " + stringExample.charAt(4));

        // 2. Substring and Comparison
        String substring = stringExample.substring(11, 18);
        System.out.println("i. Substring from index 11 to 17: " + substring);
        System.out.println("ii. Substring 'Methods' is " + (stringExample.contains("Methods") ? "Present" : "Not Present"));

        // 3. String Modification and Case Conversion
       String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + "_" + lastName;
        System.out.println("i. Concatenated string to lowercase: " + fullName.toLowerCase());
        System.out.println("ii. Concatenated string to uppercase: " + fullName.toUpperCase());

        // 4. Manipulation and Replacement
        String sampleText = "There are many String methods in Java!";
        sampleText = sampleText.replace("many", "various");
        System.out.println("i. After replacement: " + sampleText);

        // 5. Searching and Trimming
        String searchText = " Java is an Object-Oriented Programming Language. Java is a high level, robust and secure programming language. ";
        System.out.println("i. Index of the second occurrence of 'Java': " + searchText.indexOf("Java", searchText.indexOf("Java") + 1));
        System.out.println("ii. Trimmed searchText: " + searchText.trim());

        // 6. Equality and Comparison
        String messageA = "hello";
        String messageB = "HELLO";
        System.out.println("i. Equals ignoring case: " + messageA.equalsIgnoreCase(messageB));
        System.out.println("ii. Equals with case sensitivity: " + messageA.equals(messageB));

        // 7. Joining
        System.out.println("i. Joined firstName and lastName with hyphen: " + firstName + "-" + lastName);
    }
}
 

