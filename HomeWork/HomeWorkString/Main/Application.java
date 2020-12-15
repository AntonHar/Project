package HomeWorkString.Main;

import HomeWorkString.Service.CountTableImplement;
import HomeWorkString.Service.CountTableNegativeImpl;
import HomeWorkString.Service.Countable;

public class Application {
    static int count = 0;

    public static void main(String[] args) {
        Countable counter = new CountTableImplement();
        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae abba illo inventore veritatis et quasi architecto beatae vitae    dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor   sit /// amet, consectetur, adipisci velit, sed quia non   numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat volupulov. Ut enimine ad minimaamInim veniam, quisiuq nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas ?nuLlun? pariatur?";
        System.out.println(printResult(counter, text, 'v'));
        System.out.println(counter.countWordsStartByChar(text, 'v'));
        System.out.println(counter.countWordsStartByCharEndFinishByChar(text, 's', 'd'));

        countPalindrome(text);
        System.out.println("\nTotal count of Palindromes are: " + count);
    }

    public static int printResult(Countable countable, String text, char ch) {
        return countable.countChar(text, ch);
    }

    private static int countPalindrome(String inputStr) {

        int count = 0;
        int len = inputStr.length();
        int startIndex = 0;

        String subString = "";

        System.out.println("Possible substrings are: ");
        for (int i = 0; i < len; i++) {
            for (int j = startIndex; j <= len; j++) {
                subString = inputStr.substring(startIndex, j);
                System.out.println(subString);

                count = checkPalindrome(subString);

            }
            startIndex++;
        }

        return count;
    }

    private static int checkPalindrome(String subString) {
        int subLen = subString.length();
        boolean isPalindrome = false;
        for (int k = 0; k < subLen; k++, subLen--) {
            if (subString.charAt(k) != subString.charAt(subLen - 1)) {
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }
        if (isPalindrome == true) {
            count++;
        }
        return count;
    }
}
