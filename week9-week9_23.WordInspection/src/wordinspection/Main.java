package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection s = new WordInspection(file);
        System.out.println(s.wordCount());
        System.out.println(s.wordsContainingZ());
        System.out.println(s.wordsEndingInL());
        System.out.println(s.palindromes());
        System.out.println(s.wordsWhichContainAllVowels());
    }
}
