package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class WordInspection {
    private File file;
    private Scanner reader;

    public WordInspection(File file){
        this.file=file;

    }

    public int wordCount(){
        int wordCounter=0;
        setException();
        while(reader.hasNext()){
            String line = "";
            line+=reader.nextLine();
            wordCounter++;
        }

        return wordCounter;
    }

    public List<String> wordsContainingZ(){
        List<String> zWords = new ArrayList<String>();
     setException();
        while(reader.hasNext()){
            String word=reader.nextLine();
            if(word.contains("z")){
                zWords.add(word);
            }
        }
        return zWords;
    }

    public List<String> wordsEndingInL() {
        setException();
        List<String> lWords = new ArrayList<String>();
        while(reader.hasNext()){
            char character = 'l';
            String word=reader.nextLine();
            int length= word.length()-1;
            if(word.charAt(length)==character){
                lWords.add(word);
            }

        }
            return lWords;
    }

    public List<String> palindromes(){
        setException();
        List<String> palindromesList = new ArrayList<String>();
        while(reader.hasNext()){
            String word = "";
            String wordBackwards = "";
            word+=reader.nextLine();
            int length = word.length();
            for(int i=length-1; i>=0;i--){
                char letter = word.charAt(i);
                wordBackwards+=letter;
            }
            if(word.equalsIgnoreCase(wordBackwards)){
                palindromesList.add(word);
            }
        }
        return palindromesList;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> vowelWords = new ArrayList<String>();
        setException();
        int counter = 0;
        while (reader.hasNext()) {
            String allVowels = "aeiouyäö";
            String word = "";
            String vowel = "";
            word = reader.nextLine();
            int length = allVowels.length() - 1;
            if (word.contains("a")) {
                if (word.contains("e")) {
                    if (word.contains("i")) {
                        if (word.contains("o")) {
                            if (word.contains("u")) {
                                if (word.contains("y")) {
                                    if (word.contains("ä")) {
                                        if (word.contains("ö")) {
                                            vowelWords.add(word);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return vowelWords;
    }

    public void setException(){
        try {
            reader = new Scanner(file, "UTF-8");
        }catch (Exception e){
            System.out.println("Cannot read file: ");
            e.getMessage();
        }
    }
}
