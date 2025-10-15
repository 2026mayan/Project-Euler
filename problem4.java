package Problems;
public class problem4 {
    public static void main(String[] args) {
        long largestPalindrome = 0;
        for (long i = 999; i >= 100; i--) {
            for (long j = i; j >= 100; j--) {
                long product = i * j;
                if (product <= largestPalindrome) break;
                if (isPalindrome(product)) {
                    largestPalindrome = product;
                }
            }
        }
        System.out.println(largestPalindrome);
    }
    public static boolean isPalindrome(long number) {
        String str = Long.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
