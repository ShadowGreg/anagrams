package ua.com.foxmainded.anagrams;

import java.util.Scanner;

public class Anagrams {
      
    public static void main(String[] args) {

        Reverse reverse = new Reverse();

	Scanner input = new Scanner(System.in);

	System.out.print("Input a string to reverse: ");
	String inputString = input.nextLine();
	System.out.printf("Reversed string:           " + reverse.reverseString(inputString));
	
	input.close();
    }

}
