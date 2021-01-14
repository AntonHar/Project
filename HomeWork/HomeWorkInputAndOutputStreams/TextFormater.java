package HomeWorkInputAndOutputStreams;

import java.io.*;

public class TextFormater  {

    public void returningTheNumberOfWords(String src, String dest) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(src));
             BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {

            String text = "";
            while ((text = reader.readLine()) != null) {
                int countWords = getTheNumberOfWords(text);
                if (countWords >= 3 & countWords <= 5) {
                    writer.write(text);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private int getTheNumberOfWords(String text) {
        int count = 0;

        if (text.length() != 0) {
            String [] arrWords = text.split(" ");
            count = arrWords.length;
        }
        return count;
    }


    public void CheckinForPalindrome(String srv, String desp) throws IOException  {
        try (BufferedReader reader = new BufferedReader(new FileReader(srv));
             BufferedWriter writer = new BufferedWriter(new FileWriter(desp))) {

            String text = "";
            while ((text = reader.readLine()) != null) {
                StringBuilder builder = new StringBuilder(text.toLowerCase());
                String def = builder.toString();
                String reverse = builder.reverse().toString();
                boolean chekin = reverse.equals(def);
                if (chekin = true) {
                    writer.write(text);
                } else {
                    continue;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String cancadline(String fileName) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null){
                builder.append(line);
            }

            } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return builder.toString();
    }

    public static String [] splitText (String line){
        return line.split(".");
    }

    public static int countWords (String sentence){
        return sentence.split(" ").length;
    }



}




