package ua.com.foxmainded.anagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseTest {
    private Reverse reverse;
    private static final String NULL_MESSAGE_EXPECT = "String can not be null";
    private static final String EMPTY_SPACE = "";
    private static final String EMPTY_SPACE_REVERSE = "";
    private static final String SPACE = " ";
    private static final String SPACE_REVERSE = " ";
    private static final String DUBLE_SPACE = " ";
    private static final String DUBLE_SPACE_REVERSE = " ";
    private static final String SINGLE_CHARACTER = "1";
    private static final String SINGLE_CHARACTER_REVERSE = "1";
    private static final String MULTIPLE_SAME = "aa";
    private static final String MULTIPLE_SAME_REVERSE = "aa";
    private static final String CAMEL_CASES = "aa";
    private static final String CAMEL_CASES_REVERSE = "aa";
    private static final String NUMBERS = "12345";
    private static final String NUMBERS_REVERSE = "12345";
    private static final String WORD = "abcd";
    private static final String WORD_REVERSE = "dcba";
    private static final String FULL_SET = "a1bcd efg!h";
    private static final String FULL_SET_REVERSE = "d1cba hgf!e";
    

    @BeforeEach
    void setUp() {
        reverse = new Reverse();
    }

    @Test
    void reverseString_whenNull_throwIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            reverse.reverseString(null);
        });
        String actual = exception.getMessage();
        assertTrue(actual.contains(NULL_MESSAGE_EXPECT));
    }

    @Test
    public void reverseString_whenEmptyString_EmptyString() {
        assertEquals(EMPTY_SPACE_REVERSE, reverse.reverseString(EMPTY_SPACE));
    }

    @Test
    public void reverseString_whenSPACEString_SPACEString() {
        assertEquals(SPACE_REVERSE, reverse.reverseString(SPACE));
    }

    @Test
    public void reverseString_whenDubleSPACEString_DubleSPACEString() {
        assertEquals(DUBLE_SPACE_REVERSE, reverse.reverseString(DUBLE_SPACE));
    }

    @Test
    public void reverseString_whenSingleCharacterString_SingleCharacterString() {
        assertEquals(SINGLE_CHARACTER_REVERSE, reverse.reverseString(SINGLE_CHARACTER));
    }

    @Test
    public void reverseString_whenMultipleSameLetterString_MultipleSameLetterString() {
        assertEquals(MULTIPLE_SAME_REVERSE, reverse.reverseString(MULTIPLE_SAME));
    }

    @Test
    public void reverseString_whenSameCharLowerUpperCasesString_ReverseCharLowerUpperCasesLetterString() {
        assertEquals(CAMEL_CASES_REVERSE, reverse.reverseString(CAMEL_CASES));
    }

    @Test
    public void reverseString_whenNumbers_notReversed() {
        assertEquals(NUMBERS_REVERSE, reverse.reverseString(NUMBERS));
    }

    @Test
    public void reverseString_whenString_reversedString() {
        assertEquals(WORD_REVERSE, reverse.reverseString(WORD));
    }

    @Test
    public void reverseString_whenStringWithNonLetters_reversedStringWithNonLetters() {
        assertEquals(FULL_SET_REVERSE, reverse.reverseString(FULL_SET));
    }

}
