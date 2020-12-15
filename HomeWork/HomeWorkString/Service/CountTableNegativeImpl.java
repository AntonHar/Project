package HomeWorkString.Service;

public class CountTableNegativeImpl implements Countable {

    @Override
    public int countChar(String text, char ch) {
        int length = text.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ch) {
                result += 2;
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
        return 0;
    }
}

