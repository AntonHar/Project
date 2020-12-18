package HomeWorkInputAndOutputStreams;

import java.io.*;

public class TextFormater  {

    public void ReturningTheNumberOfWords(String srv, String desp) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(srv));
             BufferedWriter writer = new BufferedWriter(new FileWriter(desp))) {

            String text = "";
            while ((text = reader.readLine()) != null) {
                int countWords = getTheNumberOfWords(text);
                System.out.println(countWords);
                if (countWords >= 3 & countWords <= 5) {
                    writer.write(text);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getTheNumberOfWords(String words) {
        int count = 0;

        if (words.length() != 0) {
            count++;
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count++;
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


}




