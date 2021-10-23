package ua.com.foxmainded.anagrams;

public class Reverse {
    private static final String SPACE = " ";
    
    public String reverseString(String inputString) {

        if (inputString == null) {
            throw new IllegalArgumentException("String can not be null");
        }
        long countSpace = inputString.chars().filter(e -> e == ' ').count();
        long countChar = inputString.chars().filter(e -> e != ' ').count();
        if (countChar == 0) {
            char[] outputWord = new char[inputString.length()];
            for (int i=0;i<countSpace;i++) {
            outputWord[i] = SPACE.charAt(0);
            }
           String string = String.valueOf(outputWord);
            return string;
        }
        String[] inputWords = inputString.split(SPACE);
        String[] outputWords = new String[inputWords.length];
        int i = 0;
        for (String inputWord : inputWords) {
            outputWords[i] = reverseWord(inputWord);
            i++;
        }
        return String.join(SPACE, outputWords);
    }

    private void swapElements(char[] swapChar, int firstIndex, int secondIndex) {
        char swapSimbol;
        swapSimbol = swapChar[firstIndex];
        swapChar[firstIndex] = swapChar[secondIndex];
        swapChar[secondIndex] = swapSimbol;
    }

    private String reverseWord(String inputWord) {
        char[] outputWord = inputWord.toCharArray();
        int beginIndex = 0;
        int endIndex = outputWord.length - 1;
        for (int i = 0; i < outputWord.length; i++) {
            char swapSymbol = outputWord[endIndex];//
            if (beginIndex < endIndex) {
                if (!Character.isLetter(outputWord[beginIndex])) {
                    beginIndex++;
                } else {
                    if (Character.isLetter(swapSymbol)) {
                        swapElements(outputWord, endIndex, beginIndex);
                        beginIndex++;
                    }
                    endIndex--;
                }
            }
        }
        return new String(outputWord);
    }

}
