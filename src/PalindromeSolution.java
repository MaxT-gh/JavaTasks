public class PalindromeSolution {
    // Solution "Find the palindrome"

    public static void main(String[] args) {
        String s = "123255359";
        int maxLength = 1;
        int startPosition = 0;
        int endPosition = 0;
        for (int n = 1; n <= s.length(); n++) {
            for (int i = 0; i <= s.length() - n; i++) {
                String subs = s.substring(i, i + n);
                if (subs.equals(new StringBuilder(subs).reverse().toString())) {
                    maxLength = n;
                    startPosition = i;
                    endPosition = i + n;
                    break;
                }
            }
        }
        if (maxLength == 1) {
            System.out.println("Palindrome not found");
        } else {
            System.out.println("Palindrome length = " + maxLength);
            System.out.println(s.substring(startPosition, endPosition));
        }
    }
}

