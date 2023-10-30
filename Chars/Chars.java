package Chars;

public class Chars {

    public static void main(String[] args) {
        // There are three ways to store the value of a char 

        char myChar = 'D'; // Using one character
        char myUnicodeChar = '\u0044';  // Using its representation of Unicode
        char myDecimalCode = 68; // Using its decimal representation

        // Above all the three char are the capital letter D

        char mySingleChar = '?';
        char myUnicodeQuestionMarkChar = '\u003F';
        char myDecimalChar = 63;

        System.out.println("My values are " + mySingleChar + myUnicodeQuestionMarkChar + myDecimalChar);
    }
}