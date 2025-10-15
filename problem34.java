package Problems;
import java.util.HashMap;
import java.util.Map;

public class problem34 {
    public static void main(String[] args) {
        Map<Integer, Long> factorials = new HashMap<>();
        for (int i = 0; i <= 9; i++){
           factorials.put(i, factorial(i));
        }

        long sum = 0;

        for (int i = 10; i < 2540160; i++) {
            if (i == sumOfDigitFactorials(i, factorials)) {
                sum += i;
        }
    }
    System.out.println(sum);
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    private static long sumOfDigitFactorials(int number, Map<Integer, Long> factorials) {
        long sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorials.get(digit);
            number /= 10;
        }
        return sum;
    }
}

/*145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the
factorial of their digits. Note: As 1! = 1 and 2! = 2 are not sums they are not included. */