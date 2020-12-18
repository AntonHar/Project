package HomeWorkInputAndOutputStreams;

import java.io.IOException;

public class Appl {


    public static void main(String[] args) throws IOException {

        Palindrom palindrom = new PalindromImpl();
        String src = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\words.txt";
        String dest = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\palindromWords.txt";
        palindrom.filterPalindromWords(src, dest);

        TextFormater textFormater = new TextFormater();
        String srv = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\Text.txt";
        String desp = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\textString.txt";



    }

}

