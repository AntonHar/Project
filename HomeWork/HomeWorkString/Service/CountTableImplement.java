package HomeWorkString.Service;

public class CountTableImplement implements Countable {
    @Override
    public int countChar(String text, char ch) {
        int length = text.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ch) {
                result++;
            }
        }
        return result;
    }

    @Override
    public int countWordsStartByChar(String text, char ch) {
        int length = text.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                i++;
                if (text.charAt(i++) == ch) {
                    result++;
                }
            }
        }
        return result;
    }

    @Override
    public int countWordsStartByCharEndFinishByChar(String text, char ch, char fh) {

        String[] words = text.split(" ");
        int i;
        int result = 0;
        for (i = 0; i < words.length; ++i)
            if (words[i].startsWith(String.valueOf(ch)))
                if (words[i].endsWith(String.valueOf(fh))){
                    result++;
                }

        return result;
    }


}




