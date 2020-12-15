package HomeWorkString.Service;

public interface Countable {
    int countChar (String text, char ch);
    int countWordsStartByChar(String text, char ch);
    int countWordsStartByCharEndFinishByChar (String text, char ch, char fh);
}

