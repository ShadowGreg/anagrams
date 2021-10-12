package ua.com.foxmainded.anagrams;

public class Reverse {
    
    void swapElements(char swapChar[], char swapSimbol,
            int firstIndex, int secondIndex) {
        swapChar[firstIndex] = swapChar[secondIndex];
        swapChar[secondIndex] = swapSimbol;
        
    }

    public String reverseString(String inputString) {
        String slit = " ";

        if (inputString == null) {
            throw new IllegalArgumentException("String can not be null");
        }
        String inputWords[] = inputString.split(slit);
        String outputWords[] = new String[inputWords.length];

        int i = 0;

        for (String inputWord : inputWords) {

            outputWords[i] = reverseWord(inputWord);
            i++;
        }
        return String.join(slit, outputWords);
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
                        swapElements(outputWord,
                                swappSymbol,  endIndex, beginIndex);
                        beginIndex++;
                        endIndex--;

                        swappSymbol = outputWord[endIndex];
                    }
                }
            }
        }
        return new String(outputWord);
    }

}
