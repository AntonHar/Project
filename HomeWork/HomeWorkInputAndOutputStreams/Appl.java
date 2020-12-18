package HomeWorkInputAndOutputStreams;

import java.io.*;

public class Appl {


    public static void main(String[] args) throws IOException {

        Palindrom palindrom = new PalindromImpl();
        String src = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\words.txt";
        String dest = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\palindromWords.txt";
        palindrom.filterPalindromWords(src, dest);

        TextFormater textFormater = new TextFormater();
        String srv = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\Text.txt";
        String desp = "C:\\Users\\Toha8\\Project\\HomeWork\\HomeWorkInputAndOutputStreams\\textString.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(srv))) {

            String tepm = "";
            String temp = reader.toString();

            for (int i = 0; i < temp.length(); i++) {
                if (srv.charAt(i) == ('.' | '!' | '?')) {
                    textFormater.CheckinForPalindrome(srv, desp);
                } else {
                    if (srv.charAt(i) == ('.' | '!' | '?')) {
                        textFormater.ReturningTheNumberOfWords(srv, desp);
                    } else {
                        continue;
                    }

                }

            }
        }
    }
}




