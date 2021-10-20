package ua.com.foxmainded.anagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Test;

class ReverseTest {

    Reverse reverse = new Reverse();

    @Test
    public void reverseString_whenNull_throwIllegalArgumentException() {
	assertThrows(IllegalArgumentException.class, new Executable() {

	    @Override
	    public void execute() throws Throwable {
		Reverse reverse = new Reverse();
		reverse.reverseString(null);
	    }
	}, "String can not be null");
    }

    @Test
    public void reverseString_whenEmptyString_EmptyString() {
	assertEquals("", reverse.reverseString(""));
    }
    
    @Test
    public void reverseString_whenSPACEString_SPACEString() {
	assertEquals(" ", reverse.reverseString(" "));
    }
    
    @Test
    public void reverseString_whenDubleSPACEString_DubleSPACEString() {
	assertEquals("  ", reverse.reverseString("  "));
    }
    
    @Test
    public void reverseString_whenSingleCharacterString_SingleCharacterString() {
	assertEquals("1", reverse.reverseString("1"));
    }    
    
    @Test
    public void reverseString_whenMultipleSameLetterString_MultipleSameLetterString() {
	assertEquals("aa", reverse.reverseString("aa"));
    }
    
    @Test
    public void reverseString_whenSameCharLowerUpperCasesString_ReverseCharLowerUpperCasesLetterString() {
	assertEquals("aA", reverse.reverseString("Aa"));
    }  
    
    @Test
    public void reverseString_whenNumbers_notReversed() {
	assertEquals("12345", reverse.reverseString("12345"));
    }
   
    @Test
    public void reverseString_whenString_reversedString() {
	assertEquals("dcba", reverse.reverseString("abcd"));
    }

    @Test
    public void reverseString_whenStringWithNonLetters_reversedStringWithNonLetters() {
	assertEquals("d1cba hgf!e", reverse.reverseString("a1bcd efg!h"));
    }
 
}
