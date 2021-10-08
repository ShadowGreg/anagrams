package ua.com.foxmainded.anagrams;

import java.util.Scanner;

public class Anagrams {
       

    	public String reverseString(String inputString) {

    		if (inputString == null) {
    			throw new IllegalArgumentException("String can not be null");
    		}
    		String inputWords[] = inputString.split(" ");
    		String outputWords[] = new String[inputWords.length];

    		int i = 0;

    		for (String inputWord : inputWords) {

    			outputWords[i] = reverseWord(inputWord);
    			i++;
    		}
    		return String.join(" ", outputWords);
    	}

    	private String reverseWord(String inputWord) {

    		char outputWord[] = new char[inputWord.length()];
    		outputWord = inputWord.toCharArray();

    		int beginIndex = 0;
    		int endIndex = outputWord.length - 1;

    		for (int i = 0; i < outputWord.length; i++) {

    			char swappSymbol = outputWord[endIndex];

    			if (beginIndex < endIndex) {

    				if (!Character.isLetter(outputWord[beginIndex])) {
    					beginIndex++;

    				} else {
    					if (!Character.isLetter(swappSymbol)) {
    						endIndex--;
    						swappSymbol = outputWord[endIndex];

    					} else {
    						outputWord[endIndex] = outputWord[beginIndex];
    						outputWord[beginIndex] = swappSymbol;

    						beginIndex++;
    						endIndex--;

    						swappSymbol = outputWord[endIndex];
    					}
    				}
    			}
    		}
    		return new String(outputWord);
    	}




    public static void main(String[] args) {

	Anagrams reverse = new Anagrams();
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input a string to reverse: ");
	
	String inputString = input.nextLine();
	
	System.out.printf("Reversed string:           " + reverse.reverseString(inputString));
//	                   Input a string to reverse: 
	input.close();
    }

}
